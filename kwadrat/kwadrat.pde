int y;
int x;
void setup()
{ 
  size (600, 800) ;
  frameRate (14) ;


  y=210;
  x=210;

}



void draw()
{
  fill (random(255), random (255), random (255));
  rect ( x, y, 200, 200 );
}


void keyPressed ()
{
  if (key == ' ')
  {
    background(random(255), random (255), random (255));
  }

  if (key == 'w') 
  {
    y=y -10;
  }

  if (key == 's')
  {
    y=y +10;
  }

  if (key == 'd')
  {
    x=x +10;
  }

  if (key == 'a')
  {
    x=x -10;
  }
}




void  mousePressed ()
{
  strokeWeight (random(20));
  stroke(random(255), random (255), random (255));
}