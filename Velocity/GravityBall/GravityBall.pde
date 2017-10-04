PVector v = new PVector(0,0);
float x = 320;
float y = 50;
float speed = 0;
float gravity = 0.2;
float angle = 0;
float anglex = 0;
float angle1 = 0;

void setup() 
{
    size(640, 480); 
}

void mousePressed()
{
  if (mouseButton == LEFT)
  {
    PVector mouse = new PVector(mouseX, mouseY);

    v.lerp(mouse, 1);
  }
}

void keyPressed()
{

if (key == CODED) 
{
  if (keyCode == DOWN) 
  {
    angle1 = -angle1;
  }
}

}

void draw() 
{
  background(100);
  
y += speed;
speed += gravity;

angle += 0.02;
anglex += 0.04;
angle1 += 0.02;

if (y > height - 25) 
{
  speed =- speed * 0.95;
}

  float x2 = width / 2 + cos(anglex) * 220;
  float y2 = height / 2 + sin(angle) * 220;
  float x3 = width / 2 + cos(angle1) * 320;

  ellipse(x2, y2, 30, 30);
  ellipse(x, y, 50, 50);
  ellipse(x3, 240, 20, 20);
  ellipse(v.x, v.y, 10, 10);
}