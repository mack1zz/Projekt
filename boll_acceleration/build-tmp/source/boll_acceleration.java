import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class boll_acceleration extends PApplet {


//Antalet punkter i linjerna.
int maxDots = 100;
//Hur stor drawCircle \u00e4r i pixlar.
int circleSize = 100;

//Avst\u00e5ndet mellan varje kurva.
float xspacing = PI*2/maxDots;
//Vart kurvan skall starta.
float startTime = 0.0f;
//V\u00e4rdet av x i kurvorna.
float xPos = 50;
//V\u00e4rdet av y i kurvorna.
float yPos = 100;

//Placerar ut de statiska elementen.
public void setup()
{
  //Sk\u00e4rmstorlek i pixlar.
  
  //F\u00e4rg p\u00e5 punkterna (vit).
  stroke(255);
  //Avg\u00f6r hur stora/tjocka punkterna \u00e4r.
  strokeWeight(5);
}

//void draw anv\u00e4nds f\u00f6r att faktiskt rita ut punkterna med hj\u00e4lp av den prim\u00e4ra loopen draw.
public void draw()
{
  //Bakgrundsf\u00e4rg (svart), clearar \u00e4ven f\u00f6reg\u00e5ende loop (testa att s\u00e4tta background i setup s\u00e5 f\u00f6rst\u00e5r ni vad jag menar).
  background(0);

  //Sin linjen, den skapar en punkt s\u00e5 l\u00e4nge i \u00e4r mindre \u00e4n maxDots.
  for (int i = 0; i < maxDots; i++) {

    /*H\u00e4r skapas punkterna f\u00f6r sin linjen och tack vare for loopen s\u00e5 repeteras detta tills det blir en sinus kurva.
    Detta tar i variabeln multiplicerar med frekvensen/t\u00e4theten p\u00e5 punkterna sedan adderas startv\u00e4rdet f\u00f6r x.
    Efter det s\u00e5 tar man sinus v\u00e4rdet av startTime variabeln adderat med i variabeln multiplicerat med bredden p\u00e5 kurvan.
    V\u00e4rdet man f\u00e5r ut av detta multipliceras med h\u00f6jden p\u00e5 kurvan samn adderas med y v\u00e4rdet p\u00e5 kurvans position.*/ 
    point(i *5.5f + xPos, sin(startTime + i * 0.04f) *50 + yPos);

    //Samma som point f\u00f6r for loopen til sin linjen bara med ett cos v\u00e4rde ist\u00e4llet.
    point(i *5.5f + xPos, cos(startTime + i * 0.04f) *50 + yPos);

  }


  //G\u00f6r s\u00e5 att punkterna placeras ut i ett j\u00e4mt avst\u00e5nd.
  startTime = startTime + xspacing;

  //Kallar p\u00e5 funktionen drawCircle och placerar ut den p\u00e5 sk\u00e4rmen. Observera att variablerna h\u00e4r representerar int variablerna i drrawCircle d.v.s circleSize \u00e4r size m.m.
  drawCircle(circleSize, 200, 350, maxDots);
}

/*Skapar cirkeln genom en funktion. Funktionen kr\u00e4ver fyra int variabler s\u00e5 internt inom funktionen kallar vi dessa size, x, y och dots.
Observera att int variablerna h\u00e4r kan kallas vad som helst s\u00e5 l\u00e4nge de \u00e4r internt konsistenta, vi kommer kalla dem n\u00e5got annat n\u00e4r vi senare kallar p\u00e5 funktionen.*/
public void drawCircle(int size, int x, int y, int dots)
{
  //Vart cirkelns punkter startar.
  float cstart = 0.0f;

  //En loop som skapar en punkt s\u00e5 l\u00e4nge variabeln i \u00e4r mindre \u00e4n dots.
  for (int i = 0; i < dots; i++) {

    /*H\u00e4r skapas punkterna till cirkeln, detta g\u00f6rs genom att ta cos v\u00e4rdet av cstart sedan multiplicerar det med size, addera detta med x.
    Efter detta s\u00e5 skapas en punkt p\u00e5 exact samma s\u00e4tt fast man anv\u00e4nder sin v\u00e4rdet sam adderar med y ist\u00e4llet.*/
    point(cos(cstart) *size + x, sin(cstart) *size +y);

    //Denna raden s\u00e4ger att punktens startposition \u00e4r samma som punktens startposition + xspacing vilket g\u00f6r att psitionen \u00e4ndras mellan varje punkt med v\u00e4rdet av xspacing.
    cstart = cstart + xspacing;

  }
}
  public void settings() {  size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "boll_acceleration" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
