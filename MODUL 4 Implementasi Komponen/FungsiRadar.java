void drawRadar() {
  pushMatrix();
  translate(960,1000); 
  noFill();
  strokeWeight(2);
  stroke(98,245,31);
  
  arc(0,0,1800,1800,PI,TWO_PI);
  arc(0,0,1400,1400,PI,TWO_PI);
  arc(0,0,1000,1000,PI,TWO_PI);
  arc(0,0,600,600,PI,TWO_PI);
  
  line(-960,0,960,0);
  line(0,0,-960*cos(radians(30)),-960*sin(radians(30)));
  line(0,0,-960*cos(radians(60)),-960*sin(radians(60)));
  line(0,0,-960*cos(radians(90)),-960*sin(radians(90)));
  line(0,0,-960*cos(radians(120)),-960*sin(radians(120)));
  line(0,0,-960*cos(radians(150)),-960*sin(radians(150)));
  line(-960*cos(radians(30)),0,960,0);
  popMatrix();
}

void drawLine() {
  pushMatrix();
  strokeWeight(9);
  stroke(30,250,60);
  translate(960,1000); 
  line(0,0,950*cos(radians(iAngle)),-950*sin(radians(iAngle))); 
  popMatrix();
}

void drawObject() {
  pushMatrix();
  translate(960,1000); 
  strokeWeight(9);
  stroke(255,10,10); 
  pixsDistance = iDistance*22.5; 
  
  if(iDistance<40){
    
  line(pixsDistance*cos(radians(iAngle)),-pixsDistance*sin(radians(iAngle)),950*cos(radians(iAngle)),-950*sin(radians(iAngle)));
  }
  popMatrix();
}

void draw() {
  
  fill(98,245,31);
  textFont(orcFont);
  
  noStroke();
  fill(0,4); 
  rect(0, 0, width, 1010); 
  
  fill(98,245,31); 
  
  drawRadar(); 
  drawLine();
  drawObject();
  drawText();
}