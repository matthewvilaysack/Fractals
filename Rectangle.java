import java.awt.Color;
public class Rectangle {
    private double x, y, width, height;
    Color color;
    public Rectangle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double calculatePerimeter() {
        return (2 * (width + height));
    }
    public double calculateArea() {
        return width * height;
    }
    public void setColor(Color color) {
        this.color =  color;
    }
    public void setPos(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
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
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    // public static void main(String[] args) {
    // }
}

// Written by Matthew Vilaysack, vilay016