float x = 150;
float xDelta = 2;

float y = 50;
float yDelta = 2;

void setup() {
  size(500, 500);
  frameRate(60);
}
void draw() {
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