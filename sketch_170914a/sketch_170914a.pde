Kuleczka k1,k2,k3 ;

void setup()
{size (300,400);
k1=new Kuleczka () ;
k2=new Kuleczka () ;
k3=new Kuleczka () ;


}
void draw()
{
  background (50,30,20);
  fill(200,100,50) ;
  k1.draw () ;
  k2.draw ();
  k3.draw ();
  
}