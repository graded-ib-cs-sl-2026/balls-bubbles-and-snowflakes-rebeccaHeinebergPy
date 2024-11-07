public class Star {
     // INSTANCE VARIABLES
     private Sketch s;
     /** the radius of the star */
     private float radius;
     private float x;
     private float y;
     /** The number of pixels the star moves right per frame */
     private float xSpeed;
     /** The number of pixels the star moves down per frame */
     private float ySpeed;
     /** The color of the outside of the star */
     private int borderColor;
     /** The the spinning */
     private float rotate = 0; 
     private float rotateSpeed = 1; 
     // New instace variables so that the star will spin
 
     //MISSING CONSTRUCTORS
     public Star(Sketch sketch) {
         s = sketch;
         radius = 30;
         x = 100;
         y = 100;
         xSpeed = -3;
         ySpeed = 2;
         borderColor = s.color(255, 255, 255);
     }
 
     /** Fully specified constructor to allow changes to size, position, speed */
     public Star(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed, float rotate, float rotateSpeed) {
         this.s = sketch;
         this.radius = radius;
         this.x = x;
         this.y = y;
         this.xSpeed = xspeed;
         this.ySpeed = yspeed;
         this.rotate = rotate; 
         this.rotateSpeed = rotateSpeed; 
 
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

        // To help me write the draw code, I asked chatgpt for help 

        // This Calculates the points of the star
        float angle = (float) (2 * Math.PI / 5);  //72 degrees
        float[] xPoints = new float[10];
        float[] yPoints = new float[10];
    
        // This Calculates the outer points of the star
        for (int i = 0; i < 5; i++) {
            xPoints[i] = x + radius * (float) Math.cos(i * angle+ Sketch.radians(rotate));
            yPoints[i] = y - radius * (float) Math.sin(i * angle + Sketch.radians(rotate));
/* To rotate the star I am redrawing the points to be at different angles each frame */
        }


        rotate += rotateSpeed;
        // I am drawing the star by connecting different points in a specific order
        s.line(xPoints[0], yPoints[0], xPoints[2], yPoints[2]);
        s.line(xPoints[2], yPoints[2], xPoints[4], yPoints[4]);
        s.line(xPoints[4], yPoints[4], xPoints[1], yPoints[1]);
        s.line(xPoints[1], yPoints[1], xPoints[3], yPoints[3]);
        s.line(xPoints[3], yPoints[3], xPoints[0], yPoints[0]);

/*  In java, to draw a star you need to make a circle and set the radius of it. 
After that you need to set a certain amount of "points" on the border of the star.
Then i drew the lines by manually connecting certain points together.  
*/
        }
 
     public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius || x < radius) {
            xSpeed = -xSpeed;
        }
        if (y > s.height - radius || y < radius) {
            ySpeed = -ySpeed;
        } 
 
    }
}
