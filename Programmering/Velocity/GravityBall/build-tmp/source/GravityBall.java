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

public class GravityBall extends PApplet {

PVector v = new PVector(0,0);
float x = 320;
float y = 50;
float speed = 0;
float gravity = 0.2f;
float angle = 0;
float anglex = 0;
float angle1 = 0;

public void setup() 
{
     
}

public void mousePressed()
{
  if (mouseButton == LEFT)
  {
    PVector mouse = new PVector(mouseX, mouseY);

    v.lerp(mouse, 1);
  }
}

public void keyPressed()
{

if (key == CODED) 
{
  if (keyCode == DOWN) 
  {
    angle1 = -angle1;
  }
}

}

public void draw() 
{
  background(100);
  
y += speed;
speed += gravity;

angle += 0.02f;
anglex += 0.04f;
angle1 += 0.02f;

if (y > height - 25) 
{
  speed =- speed * 0.95f;
}

  float x2 = width / 2 + cos(anglex) * 220;
  float y2 = height / 2 + sin(angle) * 220;
  float x3 = width / 2 + cos(angle1) * 320;

  ellipse(x2, y2, 30, 30);
  ellipse(x, y, 50, 50);
  ellipse(x3, 240, 20, 20);
  ellipse(v.x, v.y, 10, 10);
}
  public void settings() {  size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GravityBall" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
