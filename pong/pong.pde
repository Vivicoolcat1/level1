 import ddf.minim.*;
 Minim minim;
 AudioSample sound;
 PImage backgroundImage;
 
 void setup(){
   size(500,500);
   minim = new Minim (this);
   sound = minim.loadSample("pong.wav", 16);
   backgroundImage = loadImage("Pong.jpg");
 }
 
int ballx =50;
int bally = 150;
int ballxspeed = 10;
int ballyspeed = 10;
int paddlex;
int paddley = 475;
int paddlew = 150;
int paddleh = 25;
 void draw(){
    background(122,0,187);
    image(backgroundImage, 0, 0);
    fill(255);
    stroke(0);
 ellipse(ballx,bally,50,50);
 ballx +=ballxspeed;
if(ballx >= width){
ballxspeed = -10 ;

}
else if(ballx<= 0){
ballxspeed = 10;
}

 bally += ballyspeed;

 if(bally>= height){
 ballyspeed = -10;
 
 sound.trigger();
 }
 else if(bally <= 0 ){
   ballyspeed = 10;
 }
 rect(mouseX,paddley,paddlew,paddleh);
 if(intersects(ballx,bally,mouseX ,paddley, paddlew)){
 println("Hit");
 ballyspeed += -10;
 
 }
 


 
 
 
 
 }
 
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength && bally> paddley - .5 *paddleh)
return true;
else 
return false;
}