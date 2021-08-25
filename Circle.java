import java.awt.Color;
public class Circle {
    private double x, y, radius;
    Color color;
    public Circle(double x, double y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
        
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return this.color;
    }
    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }
    public double getRadius() {
        return this.radius;
    }
    // public static void main(String[] args) {
    // }
}   

// Written by Matthew Vilaysack, vilay016