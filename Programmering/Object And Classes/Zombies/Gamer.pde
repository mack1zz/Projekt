class Gamer extends Human
{
	float x, y;
	float vx, vy;  
  
  Gamer(float x, float y)
	
	{
	this.x = x;
	this.y = y;	
	vx = random (10) - 5;
	vy = random (10) - 5;
	}

  void update()
	
	{
	x += vx;
    y += vy;
	ellipse(x, y, 50, 50);
	}

 }