// Program demonstrating objects, methods, and properties in Java
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


public class ObjectsAndMethodsDemo {
    public static void main(String[] args) {
        Pen p1=new Pen();
        Pen p2=new Pen();
        p1.color="blue";
        p1.type="ballpoint";
        p2.color="black";
        p2.type="gel";
        p1.printColor();
        p2.printColor();
    }
}
