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

public class sin_cos_curve extends PApplet {

int maxDots = 100;
int circleSize = 100;

float xspacing = PI*2/maxDots;
float startTime = 0.0f;
float xPos = 50;
float yPos = 100;


public void setup()
{
  
  stroke(255);
  strokeWeight(5);
}

public void draw()
{
   background(0);

   for (int i = 0; i < maxDots; i++) {
 
    point(i *5.5f + xPos, sin(startTime + i * 0.04f) *50 + yPos);

    point(i *5.5f + xPos, cos(startTime + i * 0.04f) *50 + yPos);

  }


   startTime += xspacing;

  drawCircle(circleSize, 200, 350, maxDots);
}

public void drawCircle(int size, int x, int y, int dots)
{
 
  float cstart = 0.0f;

   for (int i = 0; i < dots; i++) {

       point(cos(cstart) *size + x, sin(cstart) *size +y);

       cstart = cstart + xspacing;

  }
}
  public void settings() {  size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sin_cos_curve" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
