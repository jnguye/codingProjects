public class Assignment3Part4
{

  public static void main(String [] args) throws InterruptedException
  {
    String filename;
    if (args.length > 0) {
       filename = args[0];      
       System.out.println("Filename passed in: " + filename);
       
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    Picture pic = new Picture(filename);
    pic.show();
    Thread.sleep(1000);
    //loop psychedelic 3 times
    int shade = 0;
    while (shade < 3){
      pic.shadeGreen();
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    pic.shadeBlue();
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    pic.shadeRed();
    
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    
    shade++;
    
    
    }
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
     
     int avg =0;
    while ( avg < 20){
      pic.averagePixelsHorizontally();
      avg ++;
    }
    pic.repaint();
    
  }
 }  

    