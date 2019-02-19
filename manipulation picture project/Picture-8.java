import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
 
  public static void main(String[] args) 
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }
    /**
    * method to decrease the red by half in the
    * current picture
    */
   public void decreaseRed()
   {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    //loop through all pixels 
    while(index < pixelArray.length)
    { 
       // get the current pixel
       pixel = pixelArray[index];
       
       // get the value
       value = pixel.getRed();
       
       //decrease the red value by 50%(1/2)
       value = (int)(value * 0.5);
       
       //set the red value of the current pixel to the new value
       pixel.setRed(value);
       
       //imcrement the index
       index = index + 1;
       }
   }
    
    
   /**
    * Method to inscrease the amount of red by 30%
    */
    public void increaseRed()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int index = 0;
      
     //loop through all the pixels
      while (index < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[index];
        
        //get the value
        value = pixel.getRed();
        
       //change the value to 1.3 times what it was 
        value = (int) (value * 1.3);
        
        //set the red value to 1.3 tiems what it was
        pixel.setRed(value);
        
        //increment the index
        index++;
      }
    }
      
  /**
   * *method to clear the blue from the picture(set
   * the blue to 0 for all pixels
   */
    public void clearBlue()
    {
      Pixel[] pixelArray = this.getPixels();
        Pixel pixel = null;
       int index = 0;
       
       // loop through all the pixels
       while (index < pixelArray.length)
       {
         //get tje current pixel
         pixel = pixelArray[index];
         
         //set the blue on pixel to 0
         pixel.setBlue(0);
         
         //increment index
         index++;
       }
    }
     /**
     * method to decrease the green in the picture by 30%
     */
    public void decreaseGreen()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int i = 0;
      //loop through all the pixels in the array
      while (i < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[i];
        
        //get the value 
        value = pixel.getGreen();
        
        //set the green value to 70% of what it was
        pixel.setGreen((int)(value*0.7));
        //increment the index
        i++;
      }
    }
    /**
     * method to decrease the blue in the picutre by 30%
     */
    public void decreaseBlue()
    {
       Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int i = 0;
      //loop through all the pixels in the array
      while (i < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[i];
        
        //get the value 
        value = pixel.getBlue();
        
        //set the green value to 70% of what it was
        pixel.setBlue((int)(value*0.7));
        //increment the index
        i++;
      }
    }
    /**
     * method to make a picture look like it was taken at sunset
     * b reducing the blue and green to make it look ore red
     */
    public void makeSunset2()
    {
      decreaseGreen();
      decreaseBlue();
    }
    /**
     * method to change the color of each pixel in the picture
     * object by passed in amounts.
     * @param redAmount the a,ount to change the red value
     * @param greenAmount the amount to change  the green value
     * @param blueAmount the amount to change the blue value
     */
    public void changeColors(double redAmount,
                             double greenAmount,
                             double blueAmount)
    {
       Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int i = 0;
     
      //loop through all the pixels in the array
      while (i < pixelArray.length)
       {
        //get the current pixel
        pixel = pixelArray[i];
        
        //change the red value
        value = pixel.getRed();
        pixel.setRed((int) (redAmount*value));
        
        //change the green value
        value = pixel.getGreen();
        pixel.setGreen((int) (greenAmount*value));
        //change the blue value
        value = pixel.getBlue();
        pixel.setBlue((int) (blueAmount*value));
        //increment i 
        i++;
      }
    }
    /**
     * method to lighten the colors in the picture
     */
    public void ligthen()
    {
     Pixel[] pixelArray = this.getPixels();
      Color color = null;
      Pixel pixel = null;
     
      //loop through all the pixels in the array
      for(int i = 0 ; i < pixelArray.length;i++)
       {
        //get the current pixel
        pixel = pixelArray[i];
        
        //get the current color
        color = pixel.getColor();
        
        //get a lighter color
        color = color.brighter();
        
        //set the pixel color to the ligther color
        pixel.setColor(color);
      }
}
    /**
     * method to negate the picture
     */
    public void negate()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int redValue, blueValue, greenValue = 0;
      
      //loop through all the pixels
      for (int i = 0;i < pixelArray.length; i++)
      {
        //get the current pixel
        pixel = pixelArray[i];
        //get the current red,green and blue values
        redValue = pixel.getRed();
        greenValue = pixel.getGreen();
        blueValue =pixel.getBlue();
        
        //set the pixel's color to the new color
        pixel.setColor(new Color (255 - redValue,
                                  255 - greenValue,
                                  255 - blueValue));
      }
    }
    /**
     * method to lightne the colors in the picture
     */
    public void lighten2()
    {
      Color color = null;
      Pixel pixel = null;
      
      //loop through columns (x direction)
      for (int x = 0; x < getWidth(); x++) 
      {
        //loop through the rows (y direction)
        for (int y = 0; y < getHeight(); y++)
        {
          //get pixel at the x and y location
          pixel = getPixel(x,y);
          
          //get the current color
          color = pixel.getColor();
          
          //get a lighter color
          color = color.brighter();
          
          //set the pixel coclor to the lighter color
          pixel.setColor(color);
        }
      }
    }
    
    /**
     * method to mirro around a vertical line in the middle 
     * of the picture based on the width
     */
    public void mirrorVertical()
    {
      int width = this.getWidth();
      int mirrorPoint = width / 2;
      Pixel leftPixel = null ;
      Pixel rightPixel = null;
      
      // loop through all the rows
      for (int y = 0; y < getHeight(); y++)
      {
        //loop from 0 to the middle (mirror point)
        for (int x = 0; x < mirrorPoint; x++) 
      {
        leftPixel = getPixel(x,y);
        rightPixel = getPixel(width - 1 - x,y);
        rightPixel.setColor(leftPixel.getColor());
        }
      }
    }
    
          /**
           * method to mirror around horizontal line in the middle 
           * based on the height. it copies the top mirrored to
           * the bottom
           */
    public void mirrorHorizontal()
    {
      int height = this.getHeight();
      int mirrorPoint = height / 2;
      Pixel topPixel = null;
      Pixel bottomPixel = null;
        
        
        //loop through the columns
        for (int x = 0; x < getWidth(); x++)
      {
        // loop from 0 to just before the mirror point
        for (int y=0; y < mirrorPoint; y++)
        {
          topPixel = getPixel(x,y);
          bottomPixel = getPixel(x, height - 1 - y);
          bottomPixel.setColor(topPixel.getColor());
        }
      }
    }
    
    /**
     * method to mirror part of the temple picture around a
     * vertical line at a mirror point
     */
    public void mirrorTemple()
    {
      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through the rows
      for (int y = 27; y < 97; y++)
      {
        // loop from 1 to just before the one point
        for (int x = 13; x > mirrorPoint; x++)
        {
          leftPixel = getPixel(x,y);
          rightPixel = getPixel(mirrorPoint + (mirrorPoint - x ), y);
          rightPixel.setColor(leftPixel.getColor());
        }
      }
    }
     public void quatrefoil()
     {
       this.mirrorHorizontal();
       this.mirrorVertical();
       
       
     }
     /**
      * method to copy the picture of katie to the 
      * upper left corner of the current picture
      */
     public void copyKatie()
     {
       String sourceFile =
         FileChooser.getMediaPath("KatieFancy.jpg");
       Picture sourcePicture = new Picture(sourceFile);
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       //loop through the columns
       for (int sourceX = 0, targetX=0;
            sourceX < sourcePicture.getWidth();
            sourceX++, targetX++)
       {
         // loop through the rows
         for (int sourceY = 0, targetY =0;
              sourceY < sourcePicture.getHeight();
              sourceY++, targetY++)
         {
           //set the target pixel color to the source pixel color
           sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(sourcePixel.getColor());
         }
       }
     }
    /**
     * method to copy just katie's face to the current picture
     */
     public void copyKatiesFace()
     {
         String sourceFile =
         FileChooser.getMediaPath("KatieFancy.jpg");
       Picture sourcePicture = new Picture(sourceFile);
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       for (int sourceX = 70, targetX = 100;
            sourceX < 135; sourceX++, targetX++)
       {
         //loop throug the rows
         for (int sourceY = 3, targetY = 100;
              sourceY <80; sourceY++, targetY++)
         {
           //set the target pixel color to the source pixel color
           sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(sourcePixel.getColor());
         }
       }
     }
     
     //lab 8 
     
     private void copyPixel( Picture srcPic, int srcX, int srcY, Picture dstPic, int dstX, int dstY){
       Pixel srcPixel = null;
       Pixel dstPixel = null;
       srcPixel = srcPic.getPixel(srcX, srcY);
       dstPixel = dstPic.getPixel(dstX,dstY);
       dstPixel.setColor(srcPixel.getColor());
     }
     
     /**
      * Method that will copy all of the passed source picture into
      * the current picture object starting with the left corner
      * given by xStart. It will put the sourcePicture at 5 pixels
      * from the bottom of this picture 
      * @param sourcePicture the picture object to copy
      * @param xStart the x position to the start the copy in the target
      */
     
     public void copyPictureTo(Picture sourcePicture,
                               int xStart)
     {
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       // loop through the columns
       for (int sourceX = 0, targetX= xStart;
            sourceX < sourcePicture.getWidth();
            sourceX++, targetX++)
       {
         // loop through the rows
         for (int sourceY = 0,
               targetY  = this.getHeight()-
                          sourcePicture.getHeight()- 5;
              sourceY < sourcePicture.getHeight();
              sourceY++, targetY++)
         {
           sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(sourcePixel.getColor());
         }
       }
     }
     
     /**
      * Method to blend two sisters together onto the current picture
      */
     public void blendPictures()
     {
       //create the sister pictures
       Picture katiePicture =
        new Picture(FileChooser.getMediaPath("KatieFancy.jpg"));
       Picture jennyPicture =
         new Picture(FileChooser.getMediaPath("Jenparty.jpg"));
       
       //declare the source and target pixel variables
       Pixel katiePixel = null;
       Pixel jennyPixel = null;
       Pixel targetPixel = null;
       
       /*declare the target x and source x since we will ned
        * the values after the for loop
        */
       int sourceX = 0;
       int targetX = 0;
       
       //copy the first 150 pixels of katie to the canas
       for (; sourceX < 150; sourceX++, targetX++)
       {
         for (int sourceY=0, targetY=0;
                sourceY < katiePicture.getHeight();
              sourceY++, targetY++)
         {
           katiePixel = katiePicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(katiePixel.getColor());
         }
       }
    /* copy 50% of katie and 50% of jenny till
     * the end of katie's width
     */
       for (; sourceX < katiePicture.getWidth();
            sourceX++, targetX++)
       {
         for (int sourceY=0,targetY=0;
              sourceY < katiePicture.getHeight();
              sourceY++, targetY++)
         {
           katiePixel = katiePicture.getPixel(sourceX,sourceY);
           jennyPixel=
            jennyPicture.getPixel(sourceX - 150,sourceY);
           
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(
                                new Color((int) (katiePixel.getRed() * 0.5 +
                                                 jennyPixel.getRed() * 0.5),
                                          (int) (katiePixel.getGreen() * 0.5 +
                                                 jennyPixel.getGreen() * 0.5),
                                          (int) (katiePixel.getBlue() * 0.5 +
                                                 jennyPixel.getBlue() * 0.5)));
         }
       }
       //copy the rest of jenny
       sourceX = sourceX - 150;
       for (; sourceX < jennyPicture.getWidth();
            sourceX++, targetX++)
       {
         for (int sourceY = 0, targetY = 0;
              sourceY < jennyPicture.getHeight();
              sourceY++, targetY++)
         {
           jennyPixel = jennyPicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(jennyPixel.getColor());
         }
       }
     }
     /**
      * method to copy ths picture of katie but rotate
      * her left 90 degrees on the current picture
      */
     public void copyKatieLeftRotation()
     {
       String sourceFile =
         FileChooser.getMediaPath("KatieFancy.jpg");
       Picture sourcePicture = new Picture(sourceFile);
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       //loop through the columns
       for (int sourceX = 0;
            sourceX < sourcePicture.getWidth();
            sourceX++)
       {
         //loop through the rows
         for (int sourceY = 0;
              sourceY < sourcePicture.getHeight();
              sourceY++)
         {
           //set the target pixel color to the source pixel color
           sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
           targetPixel = this.getPixel(sourceY,
                                       sourcePicture.getWidth() - 1 -sourceX);
           targetPixel.setColor(sourcePixel.getColor());
         }
       }
     }
     
     /**
       * method to copy a flower but scaled to 2x normal size 
       * onto the current picture
       */
     public void copyFlowerLarger()
     {
       Picture flowerPicture=
         new Picture(FileChooser.getMediaPath("rose.jpg"));
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       //loop through the columns
       for (double sourceX = 0, targetX=0;
            sourceX < flowerPicture.getWidth();
            sourceX = sourceX + 0.5, targetX++)
       {
         // loop through the rows
         for(double sourceY= 0, targetY=0;
             sourceY < flowerPicture.getWidth();
             sourceY = sourceY + 0.5, targetY++)
         {
           sourcePixel =
             flowerPicture.getPixel((int) sourceX,(int) sourceY);
           targetPixel = this.getPixel((int) targetX,(int) targetY);
           targetPixel.setColor(sourcePixel.getColor());
         }
       }
     }
     public void shadeRed()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int index = 0;
      
     //loop through all the pixels
      while (index < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[index];
        
        //get the value
        value = pixel.getRed();
        
       //change the red value to 10 times what it was 
        value = (int) (value * 10);
        
        //set the red value to 10 times what it was
        pixel.setRed(value);
        
        //increment the index 
        index++;
      }
     }
     public void shadeBlue()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int index = 0;
      
     //loop through all the pixels
      while (index < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[index];
        
        //get the value
        value = pixel.getBlue();
        
       //change the blue value to 2.0 times what it was 
        value = (int) (value * 2.0);
        
        //set the blue value to 2.0 times what it was
        pixel.setBlue(value);
        
        //increment the index 
        index++;
      }
     }
       public void shadeGreen()
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel pixel = null;
      int value = 0;
      int index = 0;
      
     //loop through all the pixels
      while (index < pixelArray.length)
      {
        //get the current pixel
        pixel = pixelArray[index];
        
        //get the value
        value = pixel.getGreen();
        
       //change the green value to 2.0 times what it was 
        value = (int) (value * 2.0);
        
        //set the green value to 2.0 times what it was
        pixel.setGreen(value);
        
        //increment the index 
        index++;
      }
     }    
  public void averagePixelsHorizontally() {
    
   
    Pixel[] pixelArray = this.getPixels();
    Pixel this_pixel = null;
    Pixel prev_pixel = null;
    Pixel next_pixel = null;
    int index = 0;
    int red;
    int green;
    int blue;
    
    
    while (index < pixelArray.length) {
      if (index == 0) {
        // special case, first pixel, no prev_pixel to average
        System.out.println("special case, first pixel");
        
        this_pixel = pixelArray[index];
        next_pixel = pixelArray[index +1];
        
        //red pixel average
        red = (this_pixel.getRed() + next_pixel.getRed())/2;
        this_pixel.setRed(red);
        
        //green pixel average
        green = (+ this_pixel.getGreen() + next_pixel.getGreen())/2;
        this_pixel.setGreen(green);
        
        //blue pixel averaging
        blue = (this_pixel.getBlue() + next_pixel.getBlue())/2;
        this_pixel.setBlue(blue);

      } else if (index == pixelArray.length - 1) {
        // special case, last pixel, no next_pixel to average
        System.out.println("special case, last pixel");
        
       prev_pixel = pixelArray[index - 1];
       this_pixel = pixelArray[index];
       
       //red pixel average
       red = (prev_pixel.getRed() + this_pixel.getRed())/2;
        this_pixel.setRed(red);
        
        //green pixel average
       green = (prev_pixel.getGreen() + this_pixel.getGreen())/2;
        this_pixel.setGreen(green);
        
        //blue pixel average
       blue = (prev_pixel.getBlue() + this_pixel.getBlue())/2;
        this_pixel.setBlue(blue);



       // TODO: put code here to average last pixel (index) with second-last pixel (index – 1)
      
      } else {
        // standard case

         prev_pixel = pixelArray[index - 1];
         this_pixel = pixelArray[index];
         next_pixel = pixelArray[index + 1];
                  
         // red pixel averaging
         red = (prev_pixel.getRed() + this_pixel.getRed() + next_pixel.getRed())/3;
         this_pixel.setRed(red);

         // green pixel averaging
         green = (prev_pixel.getGreen() + this_pixel.getGreen() + next_pixel.getGreen())/3;
         this_pixel.setGreen(green);

         // blue pixel averaging
         blue = (prev_pixel.getBlue() + this_pixel.getBlue() + next_pixel.getBlue())/3;
         this_pixel.setBlue(blue);


      } // end else
      index++;

    } // end while

  }// end method
  
  /**
   * method to turn the brown in a picture
   * into red
   */
  public void turnBrownIntoRed()
  {
    Color brown = new Color(42,25,15);
    Pixel[] pixels = this.getPixels();
    Pixel pixel = null;
    
    //loop through
    for (int i=0; i<pixels.length; i++)
    {
      //get the current pixel
      pixel = pixels[i];
      
      //check if in distance to brown and if so double the red
      if (pixel.colorDistance(brown) < 50.0)
        pixel.setColor(new Color((int) (pixel.getRed() * 2.0),
                                 pixel.getGreen(),
                                 pixel.getBlue()));
    }
  }
  
  /**
   * method to turn brown to red inside of 
   * a rectangular area
   */
  public void turnBrowntoRedInrectangle()
  {
    Color brown = new Color(42,25,15);
    Pixel pixel = null;
    
    //loop through the x value
    for (int x=63; x <125; x++)
    {
      for (int y=6; y < 76; y++)
      {
        //get current pixel
        pixel = this.getPixel(x,y);
        
        //check if in dist to brown and if so double the red
        if (pixel.colorDistance(brown) < 50.0)
          pixel.setColor(new Color((int)(pixel.getRed() * 2.0),
                                   pixel.getGreen(),
                                   pixel.getBlue()));
      }
    }
  }
     
  /**
   * method to turn brown to red in rectangular area
   * specified
   * by startX, endX-1, startY, endY-1
   * @param startX the starting location to check in x 
   * @param endX the last pixel checked is one less than 
   * this in x
   * @param startY the starting location to check in y
   * @param endY the last pixel checked is one less than 
   * this in y 
   */
  public void TurnBrowntoRedinRectangle(int startX, int endX,
                                        int startY, int endY,
                                        double distance)
  {
    Color brown = new Color(42,25,15);
    Pixel pixel = null;
    
    //loop through the x values
    for (int x=startX; x < endX;x++)
    {
      for (int y=startY;y < endY;y++)
      {
        //get the current pixel
        pixel = this.getPixel(x,y);
        /*check if in distance to brown is less than
         * the passed distance and if so double the red
         */
        if (pixel.colorDistance(brown) < distance)
          pixel.setColor(new Color((int)(pixel.getRed() * 2.0),
                                   pixel.getGreen(),
                                   pixel.getBlue()));
      }
    }
  }
  
  
  /**
   * method to remove red-eye from the current pcture object
   * in the rectangle defined by startX,startY, endX, endY.
   * the red will be replaced with passed newColor
   * @param startX the top left corner x value of a rectangle
   * @param startY the top left corner y value of a rectangle
   * @param endX the bottom right corner x value of a 
   * rectangle
   * @para endY the bottom right corner y value of a 
   * rectangle
   * @param newColor the new color use
   */
  public void removeRedEye(int startX, int startY,int endX,
                           int endY, Color newColor)
  {
    Pixel pixel = null;
    /*loop through the pixels in the rectangle defined by the startX, startY, and endX and endY*/
    for (int x = startX; x < endX; x++)
    {
      for (int y = startY; y <endY; y++)
      {
        //get the current pixel
        pixel = getPixel(x,y);
        //if the color is near red then change it
        if (pixel.colorDistance(Color.red) < 167)
              pixel.setColor(newColor);
            }
    }
  }
  
  /**method to do a simple edge detection by comapring the 
    * absolute value of the difference between the color
    * intensities (average of the color values) between a
    * pixel and the pixel below it. if the absikte vakye
    * of the difference between the color intensties is 
    * less than a passed amount the top pixel color
    * will be set to white. otherwise it is set to black
    * @param amount if the absolute value of the differences
    * in the color average is less than this
    * set the color to white,else black
    */
  public void edgeDetection(double amount){
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endY = this.getHeight() - 1;
    
    /* loop through y values from 0 to height - 1
     * (since compare to below pixel */
    for (int y = 0; y < endY; y++) {
      
      //loop through the x values from 0 to width
      for (int x = 0; x < this.getWidth(); x++) {
        
        //get the top and bottom pixels
        topPixel = this.getPixel(x,y);
        bottomPixel = this.getPixel(x,y+1);
        
        //get the color avverages for the two pixels 
        topAverage = topPixel.getAverage();
        bottomAverage = bottomPixel.getAverage();
        
        /* check if the absolute value of the difference
         *  is less than the amount */
        if (Math.abs(topAverage - bottomAverage) < amount) {
          topPixel.setColor(Color.WHITE);
          //else set the color to black
        } else {
          topPixel.setColor(Color.BLACK);
        }
      }
    }
  }
  
  /**
   * method to posterize (reduce the number of colors) in
   * the picture. the number of reds, greens, and blues 
   * will be 4.
   */
  
  public void posterize()
  {
    Pixel pixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    
    //loop through the pixels 
    for ( int x = 0; x < this.getWidth(); x++) {
      for ( int y = 0; y < this.getHeight(); y++) {
        
        //get the current pixel and colors 
        pixel = this.getPixel(x,y);
        redValue = pixel.getRed();
        greenValue = pixel.getGreen();
        blueValue = pixel.getBlue();
        
        //check for red range and change color 
        if (redValue < 64)
          redValue = 3;
        else if (redValue <128)
          redValue = 95;
        else if (redValue <192)
          redValue = 159;
        else 
          redValue = 223;
        
        // check for green range 
         if (greenValue < 64)
          greenValue = 3;
        else if (greenValue <128)
          greenValue = 95;
        else if (greenValue <192)
          greenValue = 159;
        else 
          greenValue = 223;

         // check for blue range 
         if (blueValue < 64)
          blueValue = 3;
        else if (blueValue <128)
          blueValue = 95;
        else if (blueValue <192)
          blueValue = 159;
        else 
          blueValue = 223;
        
        //set the colors
        pixel.setRed(redValue);
        pixel.setGreen(greenValue);
        pixel.setBlue(blueValue);
      }
    }
  }
  public void posterize(int numLevels){
    Pixel pixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    int increment = (int) (256.0 / numLevels);
    int bottomValue, topValue, middleValue = 0;
    
    //loop through the pixels
    for (int x =0; x < this.getWidth(); x++){
      for (int y =0; y < this.getHeight(); y++){
        //get the current pixel and clors
        pixel = this.getPixel(x,y);
        redValue = pixel.getRed();
        greenValue = pixel.getGreen();
        blueValue = pixel.getBlue();
        
        //loop through the number of levels
        for (int i = 0; i < numLevels; i++)
        {
          //compute the bottom, top and middle values
          bottomValue = i * increment;
          topValue = ( i + 1) * increment;
          middleValue = (int) ((bottomValue + topValue - 1)
                                 / 2.0);
          /*check if ccurrent values are current range and 
           * if so set them to the middle value 
           */
          if (bottomValue <= redValue &&
              redValue < topValue)
            pixel.setRed(middleValue);
          if (bottomValue <= greenValue && 
              greenValue < topValue)
            pixel.setGreen(middleValue);
          if (bottomValue <= blueValue &&
              blueValue > topValue)
            pixel.setBlue(middleValue);
        }
      }
    }
  }
  public void higlightLightandDark (double amount,
                                    Color replacementColor){
    Pixel pixel = null;
    
    //loop through all the pixels in the x direction
    for (int x = 0; x < getWidth(); x++) {
      
      //loop through all the pixels in the y direcction
      for (int  y = 0;y < getHeight(); y++) {
        
        //get the current pixel
        pixel = getPixel(x,y);
        
        //if the distance from white or black is less than the 
        // passed amount use the replace color instead
        if (pixel.colorDistance(Color.white) < amount || 
            pixel.colorDistance(Color.black) < amount) {
          pixel.setColor(replacementColor);
        }
      }
    }
  }
  
  public void blur (int numPixels)
  {
    Pixel pixel = null;
    Pixel samplePixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    int count = 0;
    
    //loop through the pixels
    for (int x =0; x < this.getWidth(); x++){
      for (int y =0; y <this.getHeight(); y++){
        
        //get the current pixel
        pixel = this.getPixel(x,y);
        
        //reset the count and red,green and blue values
        count = 0;
        redValue = greenValue = blueValue = 0;
        
        /*loop through pixel numPixels before x to 
         * numPixels after x
         */
        for ( int xSample = x - numPixels;
             xSample <= x + numPixels;
             xSample++){
           for (int ySample = y - numPixels;
                ySample <= y + numPixels;
                ySample++){
                  if (xSample >= 0 && xSample < this.getWidth() && 
                      ySample >= 0 && ySample < this.getHeight()){
                    samplePixel = this.getPixel(xSample,ySample);
                   redValue = redValue + samplePixel.getRed();
                   greenValue = greenValue + samplePixel.getGreen();
                   blueValue = blueValue + samplePixel.getBlue();
                   count = count +1;
                  }
                }
             }
             //use average color of surrounding pixels
             Color newColor = new Color (redValue / count,
                                         greenValue / count,
                                         blueValue / count);
             pixel.setColor(newColor);
      }
    }
  }
  public void swapBackground(Picture oldBackground,
                             Picture newBackground)
  {
    Pixel currPixel = null;
    Pixel oldPixel = null;
    Pixel newPixel =null;
    
    //loop through the columns
    for (int x=0; x<getWidth(); x++)
    {
      //loop through rows
      for (int y=0; y<getHeight(); y++)
      {
        
        //get the current pixel and old backgroun pixel
        currPixel = this.getPixel(x,y);
        oldPixel = oldBackground.getPixel(x,y);
        /*if the distance bewteen the current pixel color
         * and the old background pixel color is less
         * than the 15 then swap in the new background pixel
         */
        if (currPixel.colorDistance(oldPixel.getColor()) < 15.)
        {
          newPixel = newBackground.getPixel(x,y);
          currPixel.setColor(newPixel.getColor());
        }
      }
    }
  }
    public void swapBackground(Picture oldBackground,
                               Picture newBackground,
                               double threshold)
    {
      Pixel currPixel = null;
      Pixel oldPixel = null;
      Pixel newPixel = null;
      
      //loop through the columns
      for (int x=0; x<getWidth(); x++)
      {
        //loop through rows 
        for (int y=0; y<getHeight();y++)
        {
          //get the current pixel and old background pixel 
          currPixel = this.getPixel(x,y);
          oldPixel = oldBackground.getPixel(x,y);
          
          /*if the distance between the current pixel color
           * and the old background pixel color is less than
           * the threshold then swap in the new backgroun
           * pixel
           */
          if (currPixel.colorDistance(oldPixel.getColor()) <
              threshold)
          {
            newPixel = newBackground.getPixel(x,y);
            currPixel.setColor(newPixel.getColor());
          }
        }
      }
    }
    public void chromakey(Picture newBg)
    {
      Pixel currPixel = null;
      Pixel newPixel = null;
      
      //loop through the columns
       for (int x=0; x<getWidth(); x++)
      {
        //loop through rows 
        for (int y=0; y<getHeight();y++)
        {
          
          //get the current pixel
          currPixel = this.getPixel(x,y);
          
          /*if the color at the current pixel is moslty blue
           * (blue value is greater than red and green 
           * combined), then use new background color
           */
          if (currPixel.getRed() + currPixel.getGreen() < 
              currPixel.getBlue())
          {
            newPixel = newBg.getPixel(x,y);
            currPixel.setColor(newPixel.getColor());
          }
        }
       }
    }
    public void charmakeyBlue(Picture newBg)
    {
      Pixel[] pixelArray = this.getPixels();
      Pixel currPixel = null;
      Pixel newPixel = null;
      
      //loop through the pixes
      for (int i = 0;i <pixelArray.length; i++)
        
        //get the current pixel 
        currPixel = pixelArray[i];
      
      /* if the color at the pixel is moslty blue (blue value is greater than green and red
       * combined), then use new backgroun color
       */
      if (currPixel.getRed() + currPixel.getGreen() < currPixel.getBlue())
      {
        newPixel = newBg.getPixel(currPixel.getX(),
                                  currPixel.getY());
        currPixel.setColor(newPixel.getColor());
      }
    }


              
               
        
  
// assignment 4 
  
  
  public Picture shrink(int factor)
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    Picture pic = new Picture(this.getWidth()/factor+1,this.getHeight()/factor+1);
    
   
    
    if (factor >= 2 && factor <=4){
    }
    else {
      System.out.println("ERROR,NOT ALLOWED");
      return this;
    }
    
    //loop through columns
    for (int sourceX = 0, targetX = 0;
         sourceX < this.getWidth();
         sourceX+=factor, targetX++)
    {
      for (int sourceY = 0, targetY = 0;
           sourceY < this.getHeight();
           sourceY+=factor, targetY++)
      {
        sourcePixel = this.getPixel(sourceX,sourceY);
        targetPixel = pic.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
      
   }
     pic.repaint();
      return pic;
  }
  
 
  public void reveal (Picture underPic, double division_height){
    
    if (division_height < 0.0 || division_height > 1.0){
      System.out.println("Error, unacceptable values");
      return;
    }
    
     if (this.getWidth() != underPic.getWidth() || this.getHeight() != underPic.getHeight()){
      System.out.println("Error, not the same sizes");
      return;
    }
    
    //create array for underPic
    
    Pixel [] pixelArray = underPic.getPixels();
    
    //calculate percentage of array
    double revLimit = 0;
    revLimit = underPic.getWidth() * division_height;
    
    int dLine = ((int) division_height * 100);
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for (int sourceX = 0, targetX = 0;
         sourceX < underPic.getWidth();
         sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = 0;
              sourceY < underPic.getHeight();
              sourceY++, targetY++)
      {
        if (sourceY < revLimit){
          sourcePixel = underPic.getPixel(sourceX,sourceY);
          targetPixel = this.getPixel(targetX, targetY);
          targetPixel.setColor(sourcePixel.getColor());
        }else if (sourceY == revLimit){
          targetPixel = this.getPixel(targetX,targetY);
          targetPixel.setColor(Color.BLACK);
        }
      }
    }
  }
  
  public void checkerboard(int width, Color c) {
    Picture pic;
    Pixel [] pixelArray = this.getPixels();
    Color color = null;
    Pixel pixel = null;
    
    if (width > (this.getWidth()/2))
    {
      System.out.println("Error, length is greater than half of picuture");
      return;
    }
    for (int y = 0; y < getHeight(); y++)
    {
      for (int x = 0; x <getWidth(); x++)
      {
        if (((x/width)+(y/width))%2 == 0)
        {
          pixel = getPixel(x,y);
          pixel.setColor(c);
        }
      }
    }
  }
  public void checkerboard (int width, int alpha){
    Pixel[] pixelArray = this.getPixels();
    Color color = null;
    Pixel pixel = null;
    
    //precondition 
    if (width > (this.getWidth()/2))
    {
      System.out.println("error, length is greater than half of the picture");
      return;
    }
    for (int y = 0; y < getHeight(); y++)
    {
      for (int x = 0; x < getWidth(); x++)
      {
        if (((x/width)+(y/width))%2 == 0)
        {
          pixel = getPixel(x,y);
          pixel.setAlpha(alpha);
        }
      }
    }
    
  }  
  public void checkerboard (int width, Picture pic){
    
    //precondition
    if (width > (this.getWidth()/2))
    {
      System.out.println("error, length is greater than half of the picture");
      return;
    }
    if (this.getWidth() != pic.getWidth() || this.getHeight() != pic.getHeight()){
      System.out.println("error, source image size is not the same as the image");
      return;
    }
    Pixel pixel = null;

    
    for (int x = 0; x< this.getWidth(); x++)
    {
      for ( int y = 0; y < this.getHeight(); y++)
      {
        if (((x/width) +(y/width))%2 == 0)
        {
        copyPixel(pic, x , y, this, x , y);
        }
      }
    }
  }
  
      
      
        
    
    
    
  
    
    
    
    
                                            
     
          
      
                              
        
        
    

  
} // this } is the end of class Picture, put all new methods before this
