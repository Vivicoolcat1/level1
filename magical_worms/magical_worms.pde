void setup() {
 size (500,500);
 background(0);
  
  
  
}



void draw() {
float x0  = random(500);
float y0  = random(500);
 // for(float x=x0, y=y0; x<=500&&y<=500;x+=5,y+=5){
    fill(225);
   float x2 = getWormX(5000);
   float y2 = getWormY(5000);
  
    ellipse(x2,y2,50,50);
    fill(136,102,255);
    frequency=.005;
     float x3 = getWormX(1000);
   float y3 = getWormY(1000);
     ellipse(x3,y3,50,50);
    makeMagical();
    frequency=.01;
 // }
  
  
  
  
  
  
}


float frequency = 50;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}