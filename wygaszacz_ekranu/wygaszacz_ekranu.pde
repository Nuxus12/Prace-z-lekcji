int rozmiar ;
int x, y;
int szansa;
void setup () 
{
  frameRate(10000);
  //size (500, 480);
  rozmiar=10 ;
  x=0 ;
  y=0;
  szansa=50;
  fullScreen();
}
void draw ()
{
  int los=(int)random (0, 101);
  stroke (random(256), random(256), random (256)) ;
  strokeWeight (random(1, 5));
  if (los >= szansa)
  {
    //line (0+x, 0+y, rozmiar+x, rozmiar+y);
    rect(0+x, 0+y, rozmiar, rozmiar);
  } else 
  {
    //line (rozmiar+x, 0+y, 0+x, rozmiar+y) ;
    ellipse(0+x+rozmiar/2, 0+y+rozmiar/2, rozmiar, rozmiar);
  }
  x=x+rozmiar;
  if (x>= width)
  {
    x=0;
    y=y+rozmiar;
    szansa=(int) random(0, 100);
  }
  if (y>= height) 
  {
    background (random(256), random(256), random(256)) ;
    rozmiar=(int) random(5, 40);
    y=0;
    x=0;
  }
}