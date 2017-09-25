int maxDots = 100;
int circleSize = 100;
float startTime = 0.0;
float xspacing = PI*2/maxDots;
float xPos = 50;
float yPos = 100;

void setup()
{
  size(640, 480);
  stroke(255);
  strokeWeight(5);
}

void draw()
{
   background(0);

   for (int i = 0; i < maxDots; i++) {
 
    point(i *5.5 + xPos, sin(startTime + i * 0.04) *50 + yPos);

    point(i *5.5 + xPos, cos(startTime + i * 0.04) *50 + yPos);

  }

  startTime = startTime + xspacing;

  drawCircle(circleSize, 200, 350, maxDots);
}

void drawCircle(int size, int x, int y, int dots)
{
 
  float cstart = 0.0;

   for (int i = 0; i < dots; i++) {

       point(cos(cstart) *size + x, sin(cstart) *size +y);

       cstart = cstart + xspacing;

  }
}