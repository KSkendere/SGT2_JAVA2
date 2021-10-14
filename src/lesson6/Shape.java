package lesson6;

abstract public class Shape {
  abstract public int calculatePerimeter();

   }
class Rectangle extends Shape{
 private int height;
 private int with;

    public Rectangle() {
    }

    public Rectangle(int height, int with) {
        this.height = height;
        this.with = with;
    }

    @Override
    public int calculatePerimeter() {

        return (height+with)*2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }
}

class Square extends Shape{

    private int side;

    @Override
    public int calculatePerimeter() {
        return side*4;
    }
}
