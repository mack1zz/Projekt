import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class test extends PApplet {

public void setup()
{
  
}
public void draw() {
  background(34,112,138);

  line(20, 90, 50, 10);
  line(50, 8, 80, 90);
  line(80, 90, 110, 10);
  line(110, 8, 140, 90);
  line(160, 90, 190, 10);
  line(190, 8, 220, 90);
  line(173, 60, 210, 60);
  arc(275, 52, 90, 91, 1, 5);
  noFill();
  line(320, 9, 320, 90);
  line(360, 9, 321, 57);
  line(360, 90, 321, 57);
  line(389, 10, 371, 32);
  line(390, 9, 390, 90);
  line(420, 17, 480, 17);
  line(420, 90, 480, 17);
  line(420, 90, 480, 90);
  line(500, 17, 560, 17);
  line(500, 90, 560, 17);
  line(500, 90, 560, 90);
}
  public void settings() {  size(800,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
