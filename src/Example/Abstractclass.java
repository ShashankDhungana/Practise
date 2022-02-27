package Example;

abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}





































//Abstract class in Java
//        A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
//
//        Before learning the Java abstract class, let's understand the abstraction in Java first.
//
//        Abstraction in Java
//        Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//        Ways to achieve Abstraction
//        There are two ways to achieve abstraction in java
//
//        Abstract class (0 to 100%)
//        Interface (100%)
//
//
//        Abstract class in Java
//        A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
//        It needs to be extended and its method implemented. It cannot be instantiated.
//
