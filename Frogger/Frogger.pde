void setup(){
  size(400,400);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
int frogX =200;
int frogY = 375;
void draw(){
  
  background(0,255,255);
  fill(0,221,0);
 Boolean check = canvasCheck(frogX,frogY);
  ellipse(frogX,frogY,25,25);
  if(check == false){
    frogX = 200;
    frogY = 375;
    Car car =new c
  }
  
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      frogY -= 5;
      }
      else if(keyCode == DOWN)
      {
        frogY += 5;
      }
      else if(keyCode == RIGHT)
      {
    frogX += 5;
      }
      else if(keyCode == LEFT)
      {
       frogX -= 5;
      }
   }
}
Boolean canvasCheck (int frogX, int frogY ){
  if (frogX < 0){
    return false;
    
  }
  else if(frogX >400){
    return false;
    
  }
  else if(frogY < 0){
    return false;
  }
  else if(frogY >400){
  return false;
  }
  else{   
    return true;
  }}

public class Car{
  int carX;
  int carY;
  int carW;
  int carH;
  int carS;
 public Car  (int carX,int carY,int carW,int carH,int carS){
  
  
  this.carX= carX;
   this.carY= carY;
   this.carW= carW;
   this.carH= carH;
   this.carS= carS;
  
  }
   void display() 
  {
    fill(0,255,0);
    rect(carX , carY, carW,carH,50);
  }

}

  