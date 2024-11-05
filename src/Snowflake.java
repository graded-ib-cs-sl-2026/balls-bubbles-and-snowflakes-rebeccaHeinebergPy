class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.

    //MISSING MANY INSTANCE VARIABLES
    private Sketch s;
    /** the radius of the snowflakes */
    private float radius;
    private float x;
    private float y;
    /** The number of pixels the snowflakes moves right per frame */
    private float xSpeed;
    /** The number of pixels the snowflake moves down per frame */
    private float ySpeed;
    /** The color of the outside of the snowflake */
    private int borderColor;
    // In this class the fill color is not called because it doesnt have a fill color, only border. 

    //MISSING CONSTRUCTORS
    public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 40;
        x = 100;
        y = 100;
        xSpeed = -1;
        ySpeed = 2;
        borderColor = s.color(255, 255, 255);
    
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;

    }

    public void setColors(int border) {
        borderColor = border;
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
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
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