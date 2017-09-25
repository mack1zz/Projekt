
//Antalet punkter i linjerna.
int maxDots = 100;
//Hur stor drawCircle är i pixlar.
int circleSize = 100;

//Avståndet mellan varje kurva.
float xspacing = PI*2/maxDots;
//Vart kurvan skall starta.
float startTime = 0.0;
//Värdet av x i kurvorna.
float xPos = 50;
//Värdet av y i kurvorna.
float yPos = 100;

//Placerar ut de statiska elementen.
void setup()
{
  //Skärmstorlek i pixlar.
  size(640, 480);
  //Färg på punkterna (vit).
  stroke(255);
  //Avgör hur stora/tjocka punkterna är.
  strokeWeight(5);
}

//void draw används för att faktiskt rita ut punkterna med hjälp av den primära loopen draw.
void draw()
{
  //Bakgrundsfärg (svart), clearar även föregående loop (testa att sätta background i setup så förstår ni vad jag menar).
  background(0);

  //Sin linjen, den skapar en punkt så länge i är mindre än maxDots.
  for (int i = 0; i < maxDots; i++) {

    /*Här skapas punkterna för sin linjen och tack vare for loopen så repeteras detta tills det blir en sinus kurva.
    Detta tar i variabeln multiplicerar med frekvensen/tätheten på punkterna sedan adderas startvärdet för x.
    Efter det så tar man sinus värdet av startTime variabeln adderat med i variabeln multiplicerat med bredden på kurvan.
    Värdet man får ut av detta multipliceras med höjden på kurvan samn adderas med y värdet på kurvans position.*/ 
    point(i *5.5 + xPos, sin(startTime + i * 0.04) *50 + yPos);

    //Samma som point för for loopen til sin linjen bara med ett cos värde istället.
    point(i *5.5 + xPos, cos(startTime + i * 0.04) *50 + yPos);

  }


  //Gör så att punkterna placeras ut i ett jämt avstånd.
  startTime = startTime + xspacing;

  //Kallar på funktionen drawCircle och placerar ut den på skärmen. Observera att variablerna här representerar int variablerna i drrawCircle d.v.s circleSize är size m.m.
  drawCircle(circleSize, 200, 350, maxDots);
}

/*Skapar cirkeln genom en funktion. Funktionen kräver fyra int variabler så internt inom funktionen kallar vi dessa size, x, y och dots.
Observera att int variablerna här kan kallas vad som helst så länge de är internt konsistenta, vi kommer kalla dem något annat när vi senare kallar på funktionen.*/
void drawCircle(int size, int x, int y, int dots)
{
  //Vart cirkelns punkter startar.
  float cstart = 0.0;

  //En loop som skapar en punkt så länge variabeln i är mindre än dots.
  for (int i = 0; i < dots; i++) {

    /*Här skapas punkterna till cirkeln, detta görs genom att ta cos värdet av cstart sedan multiplicerar det med size, addera detta med x.
    Efter detta så skapas en punkt på exact samma sätt fast man använder sin värdet sam adderar med y istället.*/
    point(cos(cstart) *size + x, sin(cstart) *size +y);

    //Denna raden säger att punktens startposition är samma som punktens startposition + xspacing vilket gör att psitionen ändras mellan varje punkt med värdet av xspacing.
    cstart = cstart + xspacing;

  }
}