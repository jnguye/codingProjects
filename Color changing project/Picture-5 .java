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



   
                                            
     
          
      
                               
    

  
} // this } is the end of class Picture, put all new methods before this
