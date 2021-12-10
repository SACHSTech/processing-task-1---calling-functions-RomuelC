import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(122, 163, 240);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(60);
    
    // Church
    fill(148, 62, 9);
    rect(200, 300, 200, 300);
    
    // Church Door
    fill(15, 15, 15);
    rect(275, 450, 50, 70);  
    
    // Left Roof
    fill(15, 15, 15);
    line(300, 10, 200, 300);
    
    // Right Roof
    fill(15, 15, 15);
    line(300, 10, 400, 300);
    
    // Cross Y
    line(300, 120, 300, 200);  
    
    // Cross X
    line(330, 150, 270, 150);    
    
    // Left Window
    fill(119, 64, 237);
    ellipse(350, 400, 45, 45);
    
    // Right Window
    fill(119, 64, 237);
    ellipse(250, 400, 45, 45);
    
  }
  
  // define other methods down here.
}