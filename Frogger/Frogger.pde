void setup(){
  size(400,400);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
int frogX =200;
int frogY = 375;
  
 
 
 Car car =new Car(10,25,100,50,10);
 Car car2 =new Car(490,100,100,50,10);
 Car car3 =new Car(10,175,100,50,10);
 Car car4 =new Car(490,250,100,50,10);
 Car car5 =new Car(10,300,100,50,10);
void draw(){

  background(0,255,255);
  fill(0,221,0);
 car.display();
 car2.display();
 car3.display();
 car4.display();
 car5.display();
 car.MoveRight();
  car2.Moveleft();
   car3.MoveRight();
    car4.Moveleft();
     car5.MoveRight();
     
 Boolean check = canvasCheck(frogX,frogY);
 

  ellipse(frogX,frogY,25,25);
  if(check == false){
    frogX = 200;
    frogY = 375;
   
  }
   
   
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      frogY -= 10;
      }
      else if(keyCode == DOWN)
      {
        frogY += 10;
      }
      else if(keyCode == RIGHT)
      {
    frogX += 10;
      }
      else if(keyCode == LEFT)
      {
       frogX -= 10;
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
  
    rect(carX,carY,carW,carH,carS);
  }
public void MoveRight(){
  carX += 5;
  if(carX >= 400){
    carX=10;}
   
   
    
}
public void Moveleft(){
  carX += -5;
 if ( carX <=0){
      carX= 490;
    }
}

public  int getCarX (){
    return this.carX;
  }
  public  int getCarY (){
    return this.carY;
  }
  public int getCarS (){
    return this.carS;
  }
  boolean intersects(Car car) {
if ((frogY > car.getCarY() && frogY < car.getCarY()+50) && (frogX > car.getCarX() && frogX < car.getCarX()+car.getCarS()))
          return true;
    else 
        return false;
}
}