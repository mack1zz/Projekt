import processing.core.*;

public class GameManager{
 private static GameManager _instance;
 private static PApplet _app;
 public int score;
 
 public static GameManager getInstance(PApplet app){
   if(_instance == null){
     _instance = new GameManager();
     _app = app;
   }
   return _instance;
 }
 
 public static GameManager getInstance(){
   return getInstance(_app);
 }
 
 public int GetScore(){
   return score;
 }
}