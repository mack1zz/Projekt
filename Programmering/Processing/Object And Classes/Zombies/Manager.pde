class BallManager
{
Human[] humans;
  
  Managar(int amount)
  
  {
  humans = new Human[amount];
  for(int i = 0; i < balls.length; i++)
    {
    humans[i] = new Human(random(width), random(height));
    }
  }
  
  void update()

  {
  for(int i = 0; i < humans.length; i++)
    {
    humans[i].update();
    }
  }
}