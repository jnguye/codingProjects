/* Assignment 3, Part 1 - Go Psychedelic! */

public class Assignment3Part1
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
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    Picture pic = new Picture(filename);   // Picture to modify
    //
    pic.show();             // Show the original picture
    Thread.sleep(1000);     //  Pause for 1 second.  You can pause for less if you like
    pic.shadeGreen();
    
    // TODO: insert method call to tint your picture
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    pic.shadeBlue();
    // TODO: insert method call to tint your picture
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    pic.shadeRed();
    // TODO: insert method call to tint your picture
    
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    
  }  // End of main method

}  // End of class