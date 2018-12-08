float d = 20;
float y = 0;
void setup()
{
  size( 800, 400);
  frameRate(60);
  fill(255, 204, 0);
}
void draw()
{
  background(0);
  for( int i=0; i<(d/5); i++)
  {
    if(i%2==1)
    {
      y = i*d - 5*i*i/2;
    }
    else
    {
      y = i*d - 5*i;
    }
    ellipse((i+1)*pmouseX-i*mouseX, (i+1)*pmouseY-i*mouseY+y, d-5*i, d-5*i);
  }
}
