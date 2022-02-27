package Example;

class Person {
    // private field
    private int age;
    // getter method
    public int getAge() {
        return age;
    }
    // setter method
    public void setAge(int age) {
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        // create an object of Person
        Person p1 = new Person();

        // change age using setter
        p1.setAge(24);

        // access age using getter
        System.out.println("My age is " + p1.getAge());
    }
}


































//In the above example, we have a private field age. Since it is private, it cannot be accessed from outside the class.
//In order to access age, we have used public methods: getAge() and setAge(). These methods are called getter and setter methods.
//Making age private allowed us to restrict unauthorized access from outside the class. This is data hiding.



//Data Hiding
//Data hiding is a software development technique specifically used in object-oriented programming (OOP) to
// hide internal object details (data members).
// Data hiding ensures exclusive data access to class members and protects object integrity by preventing unintended or
// intended changes.
//We can use access modifiers to achieve data hiding. For example,