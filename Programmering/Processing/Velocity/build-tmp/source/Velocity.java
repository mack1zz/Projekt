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

public class Velocity extends PApplet {

PVector v1 = new PVector(0,0);
float x = 150;
float xDelta = 2;

float y = 50;
float yDelta = 2;

public void setup() {
	
}

public void draw() {

 x += xDelta;
 y += yDelta;
  
  if((x > width - 10) || (x < 10)) {
    xDelta = -xDelta;
  }
  
  if(( y > height - 10) || (y < 10)) {
    yDelta = -yDelta;
  }

	background(100);

PVector mouse = new PVector(mouseX, mouseY);

	v1.lerp(mouse, 0.05f);

	stroke(80, 20, 80);
	fill(80, 30, 20);
	ellipse(v1.x, v1.y, 50, 50);
	ellipse(x, y, 30, 30);
}
  public void settings() { 	size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Velocity" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
