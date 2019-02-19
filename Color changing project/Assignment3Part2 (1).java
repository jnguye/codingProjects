/* Assignment 3, Part 2 - Go Dutch! */

public class Assignment3Part2
{
//
  public static void main(String [] args) throws InterruptedException
  {
    String filename;
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code needed by TA for grading
       filename = args[0];      
       System.out.println("Filename passed in: " + filename);
       
    } else {
       // ask user for a picture
       //filename = FileChooser.pickAFile();
      filename = FileChooser.getMediaPath("myheadshot.jpg");
       System.out.println("User picked file: " + filename);
      
      
       
    }
    Picture pic = new Picture(filename);   // Picture to modify
    //
    pic.show();             // Show the original picture
    Thread.sleep(1000);     //  Pause for 1 second.  You can pause for less if you like
    
    Pixel[] pixelArray = pic.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    //loop through the first 1/3 of pixels and make it orange
    while (index < (pixelArray.length *.33)){
      
      //Get current pixel
      pixel = pixelArray[index];
      
      //get the value 
      int redvalue = pixel.getRed();
      int greenvalue = pixel.getGreen();
      int bluevalue = pixel.getBlue();
      
      //make the image tint orange
      redvalue = (int) (redvalue * 5);
      greenvalue = (int) (greenvalue * 1.5);
      bluevalue = (int) (bluevalue * .5);
      
      //set color
      pixel.setRed(redvalue);
      pixel.setGreen(greenvalue);
      pixel.setBlue(bluevalue);
      
      //increment the index
      index++;
    }
    
    //loop through the 2nd 1/3rd of pixels and make it white
    while (index < (pixelArray.length *.66)){
      
      //Get current pixel
      pixel = pixelArray[index];
      
      //get the value 
      int redvalue = pixel.getRed();
      int greenvalue = pixel.getGreen();
      int bluevalue = pixel.getBlue();
      
      //make the image tint orange
      redvalue = (int) (redvalue * 5);
      greenvalue = (int) (greenvalue * 5);
      bluevalue = (int) (bluevalue * 5);
      
      //set color
      pixel.setRed(redvalue);
      pixel.setGreen(greenvalue);
      pixel.setBlue(bluevalue);
      
      //increment the index
      index++;
    }
    //loop through the last 1/3rd of pixels and make it green
      while (index < (pixelArray.length)){
      
      //Get current pixel
      pixel = pixelArray[index];
      
      //get the value 
      int redvalue = pixel.getRed();
      int greenvalue = pixel.getGreen();
      int bluevalue = pixel.getBlue();
      
      //make the image tint green
      redvalue = (int) (redvalue * .30);
      greenvalue = (int) (greenvalue * 5);
      bluevalue = (int) (bluevalue * .30);
      
      //set color
      pixel.setRed(redvalue);
      pixel.setGreen(greenvalue);
      pixel.setBlue(bluevalue);
      
      //increment the index
      index++;
      }
      
    
    
    

    pic.repaint();
  }  // End of main
}  // End of Class