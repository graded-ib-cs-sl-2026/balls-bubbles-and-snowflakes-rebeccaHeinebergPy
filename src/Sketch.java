import processing.core.PApplet;

public class Sketch extends PApplet {

    /** BALLS */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    // BUBBLES
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;

    // SNOWFLAKES

    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;

    // NEW OBJECT

    private Star star1;
    private Star star2;
    private Star star3;
    private Star star4;
    private Star star5;
    private Star star6;

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

        // BALLS:
            //Picks any number between both of the options I gave it
        ball1 = new Ball(this, random(1, 40), random(0, 500), random(0, 500), random(1, 10), random(1, 10));
        ball1.setColors(color(random(0, 255), random(0, 225), random(0, 255)),
                color(random(0, 255), random(0, 225), random(0, 255)));

        ball2 = new Ball(this, 39, 102, 300, 3, 4);
        ball2.setColors(color(0, 100, 225), 0);

        ball3 = new Ball(this, 14, 340, 249, 10, 10);
        ball3.setColors(color(65, 0, 26), color(255, 100, 39));

        ball4 = new Ball(this, 27, 97, 302, 2, 3);
        ball4.setColors(color(0, 255, 2), 0);

        // BUBBLES
        bubble1 = new Bubble(this);

        bubble2 = new Bubble(this, 10, 2, 30, 5, -10);
        bubble2.setColors(0x00ffffff, 0);
        // Hex color, its equal to transparent since bubbles are transparent 

        bubble3 = new Bubble(this, 45, 499, 64, 1, -2);
        bubble3.setColors(0x00ffffff, 0);

        bubble4 = new Bubble(this, random(1, 50), random(0, 500), random(0, 500), random(1, 6), -random(1, 6));
        bubble4.setColors(0x00ffffff, 0);

        // SNOWFLAKES
        snowflake1 = new Snowflake(this);

        snowflake2 = new Snowflake(this, 25, 62, 380, -1, 2);
        snowflake2.setColors(color(241, 164, 238));
        //I only need to call one int since this only has border color and not fill color 

        snowflake3 = new Snowflake(this, 52, 200, 400, -2, -2);
        snowflake3.setColors(color(164, 228, 241));

        snowflake4 = new Snowflake(this, random(1, 40), random(0, 500), random(0, 500), random(1, -10), random(1, -10));
        snowflake4.setColors(color(random(128, 255), random(128, 225), random(128, 255)));
        // I made the colors between 128 and 255 so that they would be more pastel 

        // NEW OBJECT

        star1 = new Star(this);

        star2 = new Star(this, random(1, 50), random(20, 480), random(20, 480), random(1, -10), random(1, 10),
                random(1, 10), 1);
         star2.setColors(color(180, 180, 255, 0));
            // I set the color off the rest of the stars to transparent so that you can make them appear later on 

        star3 = new Star(this, random(1, 50), random(20, 480), random(20, 480), random(1, -10), random(1, 10),
                random(1, 10), 1);
        star3.setColors(color(180, 180, 255, 0));

        star4 = new Star(this, random(1, 50), random(20, 480), random(20, 480), random(1, -10), random(1, 10),
                random(1, 10), 1);
        star4.setColors(color(180, 180, 255, 0));

        star5 = new Star(this, random(1, 50), random(20, 480), random(20, 480), random(1, -10), random(1, 10),
                random(1, 10), 1);
        star5.setColors(color(180, 180, 255));

        star6 = new Star(this, random(1, 50), random(20, 480), random(20, 480), random(1, -10), random(1, 10),
                random(1, 10), 1);
        star6.setColors(color(180, 180, 255, 0));

    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        // BALLS
        ball1.move();
        ball1.draw();

        ball2.move();
        ball2.draw();

        ball3.move();
        ball3.draw();

        ball4.move();
        ball4.draw();

        // BUBBLES
        bubble1.move();
        bubble1.draw();

        bubble2.move();
        bubble2.draw();

        bubble3.move();
        bubble3.draw();

        bubble4.move();
        bubble4.draw();

        // SNOWFLAKES
        snowflake1.move();
        snowflake1.draw();

        snowflake2.move();
        snowflake2.draw();

        snowflake3.move();
        snowflake3.draw();

        snowflake4.move();
        snowflake4.draw();

        // NEW OBJECT
        star1.draw();
        star1.move();

        star2.draw();
        star2.move();

        star3.draw();
        star3.move();

        star4.draw();
        star4.move();

        star5.draw();
        star5.move();

        star6.draw();
        star6.move();

    }

    // EVENT VS POLLING BASED
    // I made a new method so that it would be Event based rather than polling
    // based, this way, the color does not glitch out everytime the keys are pressed
    public void keyPressed() {
        if (key == '1') {
            ball1.setColors(color(random(0, 255), random(0, 225), random(0, 255)),
                    color(random(0, 255), random(0, 225), random(0, 255)));
        }
        if (key == '2') {
            ball2.setColors(color(random(0, 255), random(0, 225), random(0, 255)),
                    color(random(0, 255), random(0, 225), random(0, 255)));
        }
        if (key == '3') {
            ball3.setColors(color(random(0, 255), random(0, 225), random(0, 255)),
                    color(random(0, 255), random(0, 225), random(0, 255)));
        }
        if (key == '4') {
            ball4.setColors(color(random(0, 255), random(0, 225), random(0, 255)),
                    color(random(0, 255), random(0, 225), random(0, 255)));
        }
        if (key == 'a') {
            star2.setColors(color(random(0, 255), random(0, 225), random(0, 255)));

        }
        if (key == 'b') {
            star3.setColors(color(random(0, 255), random(0, 225), random(0, 255)));

        }
        if (key == 'c') {
            star4.setColors(color(random(0, 255), random(0, 225), random(0, 255)));

        }
        if (key == 'd') {
            star5.setColors(color(random(0, 255), random(0, 225), random(0, 255)));

        }
        if (key == 'e') {
            star6.setColors(color(random(0, 255), random(0, 225), random(0, 255)));

        }
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
