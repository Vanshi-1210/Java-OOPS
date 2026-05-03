// Program demonstrating non-parameterized constructor in Java
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Constructor called");
    }
}


public class NonParameterizedConstructorDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Vanshika";
        s1.age=20;
        s1.printInfo();
    }
}
