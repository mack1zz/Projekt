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

public class ObjectOrientedProgramming extends PApplet {

//Objektorienterad programmering!!!! <3
//koda.zesapolis.com

GameManager gameMgr;
BallManager ballMgr;

public void setup(){
  
  
  gameMgr = GameManager.getInstance(this);
  ballMgr = new BallManager(250);
}

public void draw(){
  background(128);
  ballMgr.update();
}
class Apple extends CircleBallOfDoom implements Edible{
  
  Apple(float x, float y){
    super(x, y);
  }
  
  public void update(){
    super.update();
    fill(255, 50, 50);
    ellipse(x, y, 50, 50);
  }
  
  public void eat(){
    GameManager.getInstance().score ++;
    println("score: " + GameManager.getInstance().GetScore());
  }
}
class BallManager{
  CircleBallOfDoom[] balls;
  
  BallManager(int amount){
    balls = new CircleBallOfDoom[amount];
    for(int i = 0; i < balls.length / 2; i++){
      balls[i] = 
        new Apple(random(width), random(height));
    }
    for(int i = balls.length / 2; i < balls.length; i++){
      balls[i] = 
        new Pear(random(width), random(height));
    }
  }
  
  public void update(){
    for(int i = 0; i < balls.length; i++){
      balls[i].update();
    }
  }
}
abstract class CircleBallOfDoom{
  float x, y;
  float vx, vy;

  CircleBallOfDoom(float x, float y){
    this.x = x;
    this.y = y;
    
    vx = random(10) - 5;
    vy = random(10) - 5;
  }
  
  public void update(){
    x += vx;
    y += vy;
    
    //ellipse(x, y, 50, 50);
  }
}
PVector v1 = new PVector(0,0);
float x = 150;
float xDelta = 2;

float y = 50;
float yDelta = 2;

public void setup() {
	size(640, 480);
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
interface Edible{
  public void eat();
}
class Pear extends CircleBallOfDoom{
  
  Pear(float x, float y){
    super(x, y);
  }
  
  public void update(){
    super.update();
    fill(50, 255, 50);
    ellipse(x, y, 40, 60);
  }
}
  public void settings() {  size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ObjectOrientedProgramming" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
