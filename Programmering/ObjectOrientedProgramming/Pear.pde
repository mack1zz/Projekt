class Pear extends CircleBallOfDoom{
  
  Pear(float x, float y){
    super(x, y);
  }
  
  void update(){
    super.update();
    fill(50, 255, 50);
    ellipse(x, y, 40, 60);
  }
}