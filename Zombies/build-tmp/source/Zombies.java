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

public class Zombies extends PApplet {

Vector position = new Vector(100, 100);

Human testHuman = new Human("Robert", 32, 12, position, 0.5f);

public void setup() {
	
		

}

public void draw(){
	background(100, 100);

	testHuman.walk();
	testHuman.draw();

}
public class CharacterManager {
	
Human[] characters;

public CharacterManager (int numberofCharacter) {
	characters = new Human[numberofCharacter];

	for (int i = 0; i < numberofCharacter; ++i) {
		Vector position = new Vector(random(width), random(height));
		characters[i] = new Human(12, position, 0.5f);
		
	}
}
public void update() {
	for (Human character : characters) {
		character.walk();
		character.draw();
	}

}

}
public class Human {

    String name = "Kalle"; 
    int age = 12;
    int size = 5;
    float movementSpeed = 4;
    Vector position;
    Vector direction;

	public Human (String name, int age, int size, Vector position, float speed) {
		this.name = name;
		this.age = age;
		this.size = size;
		movementSpeed = speed;
		this.position = position;

		direction = new Vector(random(-1, 1), random(-1, 1));
	}

    public void talk() {
    	if (age > 2) {
    		println(name + ": hello!");
    	}
    }
    
    public void walk() {
    	position.add(direction.mult(movementSpeed));
    }

    public void draw() {
        ellipse(position.x, position.y, size, size);

    }
}
public class Vector {

	public float x;
	public float y;

	public Vector (float x, float y) {
		this.x = x;
		this.y = y;	
	}

	public Vector mult(float multiplier){
		return new Vector(x * multiplier, y * multiplier);

	}

	public void add(Vector vectorToAdd){
		x += vectorToAdd.x;
		y += vectorToAdd.y;

	}
}
  public void settings() { 	size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Zombies" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
