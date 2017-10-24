class BallManager
{
Ball[] balls;
  
  BallManager(int amount)
  
  {
  balls = new Ball[amount];
  for(int i = 0; i < balls.length; i++)
    {
    balls[i] = new Ball(random(width), random(height));
    }
  }
  
  void update()

  {
  for(int i = 0; i < balls.length; i++)
    {
    balls[i].update();
    }
  }
}