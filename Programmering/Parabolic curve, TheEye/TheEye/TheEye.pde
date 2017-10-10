int lineammount = 35;
int hastighet = 7;
int storlek = 130;

void setup() {
  size(640, 480);
  frameRate(20); 
}

void draw() {
  background(155,179,200);
  for (int change = 0; change < lineammount; ++change) {
    
    int xpos2 = 20 * change;

    int ypos1 = 20 * change;

      stroke(100, 100);

      if (change % 2 == 0 ) {

        stroke(17, 177, 115, 50);
        
      }

      storlek = storlek + hastighet;

      if ((storlek > 130) || (storlek < 20)) {
          hastighet =-hastighet;
        }
    line(0, ypos1, xpos2, 480);
    line(640, ypos1, xpos2, 0);
    
    strokeWeight(storlek);
    fill(2, 2, 2);
    stroke(185,34,91,5);
    ellipse(300, 255, 70, 70);
  }
}