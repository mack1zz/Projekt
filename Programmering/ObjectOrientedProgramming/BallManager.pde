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
  
  void update(){
    for(int i = 0; i < balls.length; i++){
      balls[i].update();
    }
  }
}