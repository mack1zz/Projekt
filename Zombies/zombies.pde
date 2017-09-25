Vector position = new Vector(100, 100);

Human testHuman = new Human("Robert", 32, 12, position, 0.5);

void setup() {
	
	size(640, 480);	

}

void draw(){
	background(100, 100);

	testHuman.walk();
	testHuman.draw();

}
