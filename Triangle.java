import java.awt.Color;
public class Triangle {
  private double x, y, width, height;
  Color colorOfShape;
  public Triangle(double x, double y, double width, double height, Color colorOfShape) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.colorOfShape = colorOfShape;
  }
  public double calculatePerimeter() {
    return width + Math.sqrt((Math.pow((width/2),2)) + Math.pow(height,2))*2;
  }
  public double calculateArea(){
    return (width * height)/2;
  }
  public void setColor(Color colorOfShape){
    this.colorOfShape = colorOfShape;
  }
  public void setPos(double x, double y){
    this.x = x;
    this.y = y;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public Color getColor(){
    return this.colorOfShape;
  }
  public double getXPos(){
    return this.x;
  }
  public double getYPos(){
    return this.y;
  }
  public double getHeight(){
    return this.height;
  }
  public double getWidth(){
    return this.width;
  }

  // public static void main(String[] args) {
  //   }

}

// Written by Jennifer Kim, kim00954