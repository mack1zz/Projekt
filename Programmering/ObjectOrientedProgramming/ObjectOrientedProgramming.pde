//Objektorienterad programmering!!!! <3
//koda.zesapolis.com

GameManager gameMgr;
BallManager ballMgr;

void setup(){
  size(640, 480);
  
  gameMgr = GameManager.getInstance(this);
  ballMgr = new BallManager(250);
}

void draw(){
  background(128);
  ballMgr.update();
}