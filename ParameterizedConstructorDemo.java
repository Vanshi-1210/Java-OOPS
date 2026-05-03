// Program demonstrating parameterized constructor in Java
class Student{
    String name;
    int rollno;
    int age;
     public void printInfo(){
      System.out.println(this.name);
      System.out.println(this.age);
      System.out.println(rollno);
     }
     Student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
     }

}
public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Student s1=new Student("Vanshika",20,89);
        s1.printInfo();
    }
}
