BallManager ballMgr;

void setup() 
{
	size(640, 480);

	ballMgr = new BallManager(80);
}

void draw() 
{
	background(100);
	ballMgr.update();
}