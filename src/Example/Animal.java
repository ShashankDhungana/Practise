package Example;

//Polymorphism in Java with example
class Animal {
    public void animalSound(){
        System.out.println("Animal Sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig goes oink oink");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog goes bark bark");
    }
}

class main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}































//Polymorphism in java is an ability of an object to take on many forms.
//Polymorphism enables us to perform the same action in many different ways.






//Single Inheritance
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class TestInheritance{
//    public static void main(String args[]){
//        Dog d=new Dog();
//        d.bark();
//        d.eat();
//    }}

//Multi Inheritance
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class BabyDog extends Dog{
//    void weep(){System.out.println("weeping...");}
//}
//class TestInheritance2{
//    public static void main(String args[]){
//        BabyDog d=new BabyDog();
//        d.weep();
//        d.bark();
//        d.eat();
//    }}
//Heirairiariar Inheritance
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class Cat extends Animal{
//    void meow(){System.out.println("meowing...");}
//}
//class TestInheritance3{
//    public static void main(String args[]){
//        Cat c=new Cat();
//        c.meow();
//        c.eat();
////c.bark();//C.T.Error
//    }}