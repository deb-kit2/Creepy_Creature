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

public class Creepy_creature extends PApplet {

float d = 20;
float y = 0;
public void setup()
{
  
  frameRate(60);
  fill(255, 204, 0);
}
public void draw()
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
  public void settings() {  size( 800, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Creepy_creature" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
