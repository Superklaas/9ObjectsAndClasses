package be.vdab;

public class Ex98Fan {
    public static void main(String[] args) {

        // Create fan1 and set values
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Create fan2 and set values
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display values fan1
        System.out.println("FAN 1");
        System.out.println(fan1.toString());

        // Display values fan2
        System.out.println("FAN 2");
        System.out.println(fan2.toString());

    }
}

class Fan {

    // constants
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // data fields
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // constructor
    public Fan()    {
    }

    // accessors and mutators
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int currentSpeed)   {
        speed =  currentSpeed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor()    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // string description of the fan
    public String toString()    {
        if (on == true)
            return "speed: " + Integer.toString(speed) + "\ncolor: " + color + "\nradius: " + Double.toString(radius);
        else
            return "color: " + color + "\nradius: " + Double.toString(radius) + "\nfan is off";
    }
    
}