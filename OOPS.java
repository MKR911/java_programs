public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        /*Student s1 = new Student();
        s1.name = "mayank";
        s1.roll = 456;
        s1.passward = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.passward = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

        Student s3 = new Student("Mayank");
        System.out.println(s3.name);*/

        /*Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);*/

        /*Deer d = new Deer();
        d.eat();*/

        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));

        /*Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();*/

        Mustang myhorse = new Mustang();

        Queen q = new Queen();
        q.moves();

        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal (1 step in all direction)");
    }
}

abstract class Animal{

    Animal(){
        System.out.println("constructor is called in animal.");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called.");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
}

// class Animal{
//     void eat() {
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }

class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// //derived class
// class Mammals extends Animal{
//     int legs;

//     void walk(){
//         System.out.println("walks");
//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("swims");
//     }
// }

// class bird extends Animal{
//     void fly(){
//         System.out.println("flies");
//     }
// }

// class Dog extends Mammals{
//     String breed;
// }

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

// class Student{
//     String name;
//     int roll;
//     String passward;
//     int marks[];

//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }
//     Student(){
//         marks = new int[3];
//         System.out.println("constructor is called...");
//     }
//     Student(String name){                                  //parameterized.
//         marks = new int[3];
//         this.name = name;
//     }
// }