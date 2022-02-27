package Example;

//Inheritance
class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}














































//The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
// When you inherit from an existing class, you can reuse methods and fields of the parent class.
// Moreover, you can add new methods and fields in your current class also.

//Three Types of Inheritance... Single Inheritance, Multilevel Inheritance, Hierarchial Inheritance








