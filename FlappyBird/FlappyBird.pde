void setup(){
  size(500,500);
  background(199,204,255);
  
  
}

int birdx = 50;
int birdy = 250;
int birdw = 50;
int birdh = 50;
double birdYV = 1;
double birdYG = .1;
int pipeX = 450;
int  pipeY = 200;
int pipeW =50;
int pipeH = 300;

void draw(){
  background(199,204,255);
  fill(255,255,0);
  ellipse(birdx,birdy,birdw,birdh);
 
  
 birdy += birdYV;
  
birdYV += birdYG;
  
  fill(0,204,136);
  stroke(0);
  rect(pipeX,pipeY,pipeW,pipeH);
  pipeX -= 5;
 float r =random(100, 500);
  int b= Math.round(r);
if (pipeX == 0){
pipeX = 500;
pipeY=b;
}
 Boolean intersects2 = intersects(birdx,birdy,pipeX,pipeY,pipeW);


if(intersects2 == true){
  fill(255);
  textSize(30);
 text("you loose",250,250);

exit();
}






}



void mousePressed(){
  birdYV += -5;
  
  
  

}

boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}