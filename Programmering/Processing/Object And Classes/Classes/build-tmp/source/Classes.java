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

public class Classes extends PApplet {

BallManager ballMgr;

public void setup() 
{
	

	ballMgr = new BallManager(80);
}

public void draw() 
{
	background(100);
	ballMgr.update();
}
class Ball
{
	float x, y;
	float vx, vy;  
  
  Ball(float x, float y)
	
	{
	this.x = x;
	this.y = y;	
	vx = random (10) - 5;
	vy = random (10) - 5;
	}

  public void update()
	
	{
	x += vx;
    y += vy;
	ellipse(x, y, 50, 50);
	}

 }
class BallManager
{
Ball[] balls;
  
  BallManager(int amount)
  
  {
  balls = new Ball[amount];
  for(int i = 0; i < balls.length; i++)
    {
    balls[i] = new Ball(random(width), random(height));
    }
  }
  
  public void update()

  {
  for(int i = 0; i < balls.length; i++)
    {
    balls[i].update();
    }
  }
}
  public void settings() { 	size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Classes" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
