// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;
public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // contructor

    public double drawFractal(String type) {
      Canvas can = new Canvas(800,800);
      Color col = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
      if (type.equals("circle")){
          drawCircleFractal(100, 400, 400, col, can, 0);
        }
      else if (type.equals("triangle")){
          drawTriangleFractal(200, 300, 400, 400, col, can, 0);
        }
      else if (type.equals("rectangle")){
          drawRectangleFractal(100,200,400,400,col,can,0);
        }
      return totalArea;
      }
      
    public void drawTriangleFractal(double width, double height, double x, double y, Color col, Canvas can, int level){
      if (level >= 7) {
        return;
      }
      else {
        col = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        Triangle canvasTriangle = new Triangle(x, y, width, height, col);
        can.drawShape(canvasTriangle);
        totalArea = totalArea + canvasTriangle.calculateArea();
        drawTriangleFractal(width/2, height/2, x+width, y, col, can, level+1);
        drawTriangleFractal(width/2, height/2, x-width, y, col, can, level+1);
        drawTriangleFractal(width/2, height/2, x, y+height, col, can, level+1);
        drawTriangleFractal(width/2, height/2, x, y-height, col, can, level+1);
      }
    }

    public void drawCircleFractal(double radius, double x, double y, Color col, Canvas can, int level) {
      if (level >= 7) {
        return;
      }
      else {
       col = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        Circle canvasCircle = new Circle(x, y, radius, col);
        can.drawShape(canvasCircle);
        totalArea = totalArea + canvasCircle.calculateArea();
        drawCircleFractal(radius/2, x+radius, y, col, can, level+1);
        drawCircleFractal(radius/2,  x-radius, y, col, can, level+1);
        drawCircleFractal(radius/2, x, y+radius, col, can, level+1);
        drawCircleFractal(radius/2, x, y-radius, col, can, level+1);
      }
    }

    public void drawRectangleFractal(double width, double height, double x, double y, Color col, Canvas can, int level) {
      if (level >= 7) {
        return;
      }
      else {
        col = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        Rectangle canvasRect = new Rectangle(x, y, width, height, col);
        can.drawShape(canvasRect);
        totalArea = totalArea + canvasRect.calculateArea();
        drawRectangleFractal(width/2, height/2, x+width, y+height, col, can, level+1);
        drawRectangleFractal(width/2, height/2, x+width, y-height/2, col, can, level+1);
        drawRectangleFractal(width/2, height/2, x-width/2, y-height/2, col, can, level+1);
        drawRectangleFractal(width/2, height/2, x-width/2, y+height, col, can, level+1);
      }
    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Pick circle, triangle, or rectangle.");
      String type = sc.nextLine();
      FractalDrawer a = new FractalDrawer();
      a.drawFractal(type);
      sc.close();
      System.out.println(a.totalArea);
    }
}

// Written by Jennifer Kim (kim00954), Matthew Vilaysack (vilay016)