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

public class Chemotaxis extends PApplet {

Bacteria [] colony;
Bacteria edward;
PImage photo;
PImage photo1;
PImage photo2;
 public void setup()   
 {     
 photo=loadImage("singed.png");
 photo1=loadImage("kaptain.png");
 photo2=loadImage("rift.png");



 	//initialize bacteria variables here   
 	size(600, 600);
 	//edward = new Bacteria(250,250);
 	background(0,0,0);
 	colony = new Bacteria[40];
 	for (int i = 0; i < colony.length; i++){
 		//fill(int(random(256+100)),int(random(256+100)),int(random(256+100)));
 		colony[i] = new Bacteria((int)(Math.random()*500), (int)(Math.random()*500));


 	}

 }   
 public void draw()   
 {    

 image(photo2,0,0);
 	for(int i=0; i<colony.length; i++)
  	{
	   colony[i].move();
	   colony[i].show();
	}
	image(photo, mouseX-90, mouseY-130);
	fill(255);
	
 }  


 public void mousePressed()
 	{
 		fill(255);
 		ellipse(mouseX,mouseY, 10,10);
 	}
 class Bacteria    
 {     
 	int myX, myY, kolor;

 	Bacteria(int x, int y)
 	{
 		myX=x;
 		myY=y;
 		kolor = color(PApplet.parseInt(random(256+100)),PApplet.parseInt(random(256+100)),PApplet.parseInt(random(256+100)));

 	}

 	public void move()
 	{
 		//myX = myX + (int)(Math.random()*5-2.5);
 		//myY = myY + (int)(Math.random()*5-2.5);
 		if (mouseX > myX){
 			myX = myX + (int)(Math.random()*10-2);
 		}

 		else if (mouseX < myX){
 			myX = myX + (int)(Math.random()*10-8);
 		}

 		if (mouseY > myY){
 			myY = myY + (int)(Math.random()*10-2);
 		}

 		else if (mouseY < myY){
 			myY = myY + (int)(Math.random()*10-8);
 		}

 		//if (mouseY == myY){
 			//myY = myY + (int)(Math.random()*10-2);
 		//}

 	}

 	
 	public void show()
 	{
 		//fill(int(random(256+100)),int(random(256+100)),int(random(256+100)));

 		noStroke();
 		//fill(255, 153,51);
 		 //fill(int(random(256+100)),int(random(256+100)),int(random(256+100)));
 		//fill(kolor);
 		//ellipse(myX, myY, 29, 29);
 		//ellipse(myX-7, myY-7, 21,21);
 		//ellipse(myX+7, myY-7, 21,21);
 		//fill(0);
 		//ellipse(myX-4, myY-4,10,10);
 		//ellipse(myX+4, myY-4,10,10);
 		//stroke(0);
 		//strokeWeight(2);
 		//line(myX-4, myY+4, myX+4, myY+4);
 		
 		image(photo1,myX-120,myY-120);
 		fill(255);

 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
