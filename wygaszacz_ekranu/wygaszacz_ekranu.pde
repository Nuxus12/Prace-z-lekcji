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
  stroke (random(256), random(256), random(256)) ;
  if (los >= szansa)
  {
    line (0+x, 0+y, rozmiar+x, rozmiar+y);
  } else 
  {
    line (rozmiar+x, 0+y, 0+x, rozmiar+y) ;
  }
  x=x+rozmiar;
  if (x>= width)
  {
    x=0;
    y=y+rozmiar;
    szansa=(int) random(0,100);
  }
  if (y>= height) 
  {
    background (random(256), random(256), random(256)) ;
    rozmiar=(int) random(5,40);
    y=0;
    x=0;
  }
}