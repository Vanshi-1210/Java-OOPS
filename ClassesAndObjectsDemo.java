// Program demonstrating classes and objects in Java
class Pen{
    String color;
    String type;
    public void Write(){
        System.out.println("Writing something");
    }
}
public class ClassesAndObjectsDemo {

    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="blue";
        p1.type="gel";
        p1.Write();
    }
}