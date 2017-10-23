PVector v1 = new PVector(0,0);
float x = 150;
float xDelta = 2;

float y = 50;
float yDelta = 2;

void setup() {
	size(640, 480);
}

void draw() {

 x += xDelta;
 y += yDelta;
  
  if((x > width - 10) || (x < 10)) 
  {
    xDelta = -xDelta;
  }
  
  if(( y > height - 10) || (y < 10)) 
  {
    yDelta = -yDelta;
  }

	background(100);

PVector mouse = new PVector(mouseX, mouseY);

	v1.lerp(mouse, 0.05);

	stroke(80, 20, 80);
	fill(80, 30, 20);
	ellipse(v1.x, v1.y, 50, 50);
	ellipse(x, y, 30, 30);
}