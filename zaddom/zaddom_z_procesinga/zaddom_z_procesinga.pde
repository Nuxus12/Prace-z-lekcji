void setup ()
{
  size(320,200);
  fill(#FAFF03);
  stroke (255,00,00);
  strokeWeight (3);
  ellipse(50,80,10,10);
  
}
void keyPressed ()
{
  if (key == 'k') 
  {
    background (random (255), random (255), random (255));
  }
}
 
  

    
  