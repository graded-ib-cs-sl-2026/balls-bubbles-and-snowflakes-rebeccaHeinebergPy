import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2; 
    private Ball ball3; 
    private Ball ball4; 

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this, random(1, 40), random(0, 500), random(0, 500), random(1, 10), random(1, 10));
        ball1.setColors(color(random (0, 255), random(0, 225), random(0, 255)), color(random (0, 255), random(0, 225), random(0, 255))); 

        ball2 = new Ball (this, 39, 102, 300, 3, 4); 
        ball2.setColors(color(0,100,225), 0);

        ball3 = new Ball (this, 14, 340, 249, 10, 10); 
        ball3.setColors(color(65, 0, 26), color(255, 100, 39)); 

        ball4 = new Ball (this, 27, 97, 302, 2, 3); 
        ball4.setColors(color(0,255,2), 0); 
    }

    
    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        
//BEHAVIORS
        ball1.move();
        ball1.draw();

        ball2.move(); 
        ball2.draw(); 

        ball3.move(); 
        ball3.draw(); 

        ball4.move(); 
        ball4.draw(); 
    
        


    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
