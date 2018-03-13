void setup(){
  size(500,500); 
  
  

}  
int score = 0;
  int y = 10;
int x=0;
  void draw(){
     background( 000, 238,  221);
 
     
    
   y += 5;
   
     
    ellipse(x, y, 10, 10);
     
    fill(034, 136, 255);
    stroke(0) ;
     
     if(y == 500){
     y=0;
       x = (int) random(500);
     }
     
     rect(mouseX, 480,100 , 100);{}

checkCatch(x);
 if(mouseX== x){
 s
 }
     
  }
  void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}