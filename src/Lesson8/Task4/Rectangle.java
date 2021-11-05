package Lesson8.Task4;

public class Rectangle {
private int length;
private int breadth;

    public Rectangle() {
    }

    public  Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea(){
        System.out.println("The area of rectangle is: " +length*breadth);
    }



    public void printPerimeter(){
        System.out.println("The perimeter of rectangle is: "+(length*2+breadth*2));


    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}
