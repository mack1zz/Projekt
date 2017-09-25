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

public class test2 extends PApplet {

float x = 150;
float xDelta = 2;

float y = 50;
float yDelta = 2;

public void setup() {
  
  frameRate(60);
}
public void draw() {
  background(34,137,138);
  fill(189,13,215);
  stroke(0,189,0);
  strokeWeight(4);
  ellipse(x, y, 20, 20);
  
  x = x + xDelta;
  y = y + yDelta;
  
  if((x > width - 10) || (x < 10)) {
    xDelta = -xDelta;
  }
  
  if(( y > height - 10) || (y < 10)) {
    yDelta = -yDelta;
  }
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
