
class Bubble {

    //INSTANCE VARIABLES, used Ball.java for reference
    private Sketch s;
    /** the radius of the bubble */
    private float radius; // Floats are better for holding values like speed and coordiantes since they can be decimals. 
    private float x;
    private float y;
    /** The number of pixels the bubbles moves right per frame */
    private float xSpeed;
    /** The number of pixels the bubbles moves down per frame */
    private float ySpeed;
    /** The color of the inside of the bubbles */
    private int fillColor;
    /** The color of the outside of the bubble */
    private int borderColor;

    //MISSING CONSTRUCTORS
    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 30;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = 0x00ffffff; 
        borderColor = s.color(0, 0, 0);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;

    }

    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }

    // accessors for the radius, diameter, x, and y values 
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
 