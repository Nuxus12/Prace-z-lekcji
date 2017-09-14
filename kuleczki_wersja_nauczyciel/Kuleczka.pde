class Kuleczka
{
  // właściwości
  int x, y, r;
  
  // konstruktor
  Kuleczka()
  {
    x = (int)random( 0, width);
    y = (int)random( 0, height);
    r = (int)random( 5, 20 );  // <5, 20)  <5,19>
  }
  
  // metody
  void draw()
  {
    ellipse(x, y, 2*r, 2*r );
  }
  
  
}