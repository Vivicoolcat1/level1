 
void setup(){

  size(500,500);
  background(199,204,255);
  
  
}

float birdx = 50;
float birdy = 250;
float birdw = 50;
float birdh = 50;
double birdYV = 1;
double birdYG = .1;
float pipeX = 450;
float  pipeY = 250;
float pipeW =50;
float pipeH = 300;
float pipeX2 = 450;
float  pipeY2 = 100;
float pipeW2 =50;
float pipeH2= -300;
float gapLength = 100;
int score=0;
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
 
  

  
if (pipeX < -50){
pipeX = 500;

pipeY = random(250,400 ); ;
}
if (pipeX2 < -50){
pipeX2 = 500;
score++;
pipeH2 = pipeH;
}
pipeH2 -= pipeH + gapLength; 
 Boolean intersects2 = intersectsB(birdx,birdy,pipeX,pipeY,pipeW,pipeH);
 Boolean intersects3 = intersectsT(birdx,birdy,pipeX2,pipeY2,pipeW2,pipeH2);
 fill(255);
 textSize (20);
text("your score is "+ score,100,50);
if(intersects2 == true){
 fill(255);
  textSize(30);
text("you loose. Your finall score is " + score,100,250);

exit();}

else if(intersects3 == true){
  fill(255);
 textSize(30);
 text("you loose. Your finall score is " + score,100,250);;

exit();}

else if (birdy> 500){
    fill(255);
 textSize(20);
text("you loose. Your finall score is " + score,100,250);
 
exit();}
}













 void mousePressed(){
  birdYV = -5;

 }  
  
  



boolean intersectsB(float birdX, float birdY, float pipeX, float pipeY, float pipeW, float pipeH) {
if (birdX >pipeX && birdX < pipeX + pipeW && birdY > pipeY)
return true;
else 
return false;
}
boolean intersectsT(float birdX, float birdY, float pipeX2, float pipeY2, float pipeW2, float pipeH2) {
if (birdX >pipeX2 && birdX < pipeX2 + pipeW2 && birdY < pipeY2)
return true;
else 
return false;
}