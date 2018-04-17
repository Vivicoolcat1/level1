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
float pipeH = 300;
int pipeX2 = 450;
int  pipeY2 = 100;
int pipeW2 =50;
float pipeH2= -300;
void draw(){
  background(199,204,255);
  fill(255,255,0);
  ellipse(birdx,birdy,birdw,birdh);
 
  
 birdy += birdYV;
  
birdYV += birdYG;
  
  fill(0,204,136);
  stroke(0);
  rect(pipeX,pipeY,pipeW,pipeH);
  rect(pipeX2,pipeY2,pipeW2,pipeH2);
  pipeX -= 5;
  pipeX2 -= 5;
 
  

  
if (pipeX < 50){
pipeX = 500;
pipeH = random(0, 250); ;
}
if (pipeX2 < 50){
pipeX = 500;
pipeH2 = random(0, -250); ;
}
 Boolean intersects2 = intersects(birdx,birdy,pipeX,pipeY,pipeW);
 Boolean intersects3 = intersectsT(birdx,birdy,pipeX2,pipeY2,pipeW2);

if(intersects2 == true){
  fill(255);
  textSize(30);
 text("you loose",250,250);
if(intersects3 == true){
  fill(255);
  textSize(30);
 text("you loose",250,250);
exit();
}
}





}



void mousePressed(){
  birdYV += -5;
  
  
  

}

boolean intersectsT(int birdX, int birdY, int paddleX, int paddleY, int paddleLength, int pipeH) {
if (birdY > paddleY - 4 && birdX > pipeH && birdX < paddleX + paddleLength)
return true;
else 
return false;
}