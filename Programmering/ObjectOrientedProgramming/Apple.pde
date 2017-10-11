class Apple extends CircleBallOfDoom implements Edible{
  
  Apple(float x, float y){
    super(x, y);
  }
  
  void update(){
    super.update();
    fill(255, 50, 50);
    ellipse(x, y, 50, 50);
  }
  
  void eat(){
    GameManager.getInstance().score ++;
    println("score: " + GameManager.getInstance().GetScore());
  }
}