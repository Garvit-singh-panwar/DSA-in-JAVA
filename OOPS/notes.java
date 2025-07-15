public class notes {

    public static void main(String[] args) {
      
        // here we made a object of a class 
        car c1 = new car();

        // to access any objects property or function we use . operator ex object.propertyName = value ;
        // or object.method(value); 
        // we are setting the property using set methord
        c1.setProperty("maruti800", "black", 4,606);

        // here are the properties of the c1 object
        System.out.println("the car name is "+c1.Carname);
        System.out.println("the colour of car is "+ c1.color);
        System.out.println("it has "+ c1.numOfGares + " gares");
        
        // here are the methods of the c1 object every object of car class share same methods but they can have different properties
        c1.start();
        c1.run();
        c1.stop();


        System.out.println("\n");

        BankAccount b1 = new BankAccount();

        b1.username = "garvit";
        // b1.password = "just Assume anything"; it will give us error because it is private and it can not be used outside the class
        b1.setPassword("just Assume anything");

        b1.getInfo("garvit", "just Assume anything");
        // b1.getInfo("garvit", "null"); it wont give you access
    }
}

  // OOPs (Object-Oriented Programming)
// It's a way of writing code that makes it more organized, reusable, and closer to real-life modeling.

// What is an Object?
// Objects are real-world entities.
// Example: A car is an object. It has properties like color, model number, engine type, etc.
// It also has behaviors like starting, running, stopping, etc.

// What is a Class?
// A class is a blueprint or template used to create objects.
// It defines two main things:
// 1. Attributes (also called properties) — like color, model number, engine, etc.
// 2. Behaviors (also called methods/functions) — like start(), run(), stop(), etc.
// You can think of a class like a car factory:
// The factory itself is not a car, but it can produce many cars.
// Each car can have different properties (color, engine, etc.) but will have the same basic behavior (start, run, stop).

class car{
    String Carname;
    String color;
    int numOfGares;
    int modelNum;

    public void setProperty(String name , String color , int Gares , int modelNum){
        this.Carname = name;
        this.color = color;
        this.numOfGares = Gares;
        this.modelNum = modelNum;
    }

    public void run(){
        System.out.println("it is running");
    
    }

    public void stop(){
        System.out.println("it stopped");
    }

    public void start(){
        System.out.println("it is started");
    }

}

class BankAccount{

    public String username;
    private String password;


    public void setPassword(String pwd){
        this.password = pwd;

    }

    // getter are those function which is used to get data 
    // setter are those function which is used to set data 
    // for ex set password is a setter or get info is a getter
    public void getInfo(String userName , String password ){
        if(this.username.equals(userName) && this.password.equals(password)){
            System.out.println("you can access it ");
        }
        else{
            System.out.println("you cant access it");
        }
    }

// -----------------------------------------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX_----------------------------------

 // Access Modifiers define how accessible a class, method, or variable is from other parts of the program.

// Types of Access Modifiers:

// 1. private
// - The member (variable or method) can only be accessed within the same class.
// - It cannot be accessed from outside the class, not even by subclasses.

// 2. default (no modifier)
// - If no access modifier is specified, it is considered default.
// - Accessible only within the same package (i.e., other classes in the same package can access it).
// - Not accessible from classes in other packages.

// 3. protected
// - Accessible within the same package (just like default).
// - Also accessible in subclasses (even if they are in different packages).

// 4. public
// - Accessible from anywhere: inside the class, other classes, other packages, and subclasses.


}

// ---------------------------------------XXXXXXXXXXXXXXXXXXXX-----------------------------------

// Encapsulation
// encapsulation is defined as the wrapping up of data & methods under a single unit . it also implements data hiding

// ---------------------------------------------------------------------XXXXXXXXXXXXXXXXX_--------------------------

// COnstructor
// Constructor is a special method which invoked automatically at the time of object creation 
// constructor name is same name as class
// it do not have any return type
// it called once at object creation
// memory allocation happens when constructor is called  


class Student{


    String name;
    int rollNo;
    int marks[];

    // Types of constructor 
// 1. non-parameterized ->where we dont define parameters

Student(){
    System.out.println("I am a Student");
}

// 2. parameterized -> where we define parameters
Student(String name, int rollNo , int marks[]){
    this.name  = name;
    this.rollNo = rollNo;
    this.marks = new int[marks.length];
    for(int i = 0 ; i < marks.length ; i++){
        this.marks[i] = marks[i];
    }

}
// 3. copy constructor -> it takes object as parameter and copy its property into that object
// 
//  wehen we create multiple constructor with different parameters we call this constructor overloading
// there are two types of copy constructor 
// 1. Shallow  here we copy object by reference  -> so changes reflect
// Student(Student s1){
//     this.name = s1.name;
//     this.rollNo = s1.rollNo;
//     this.marks = s1.marks;  here we are taking reference

// }
// 2. deep here we copy objects value -> so changes do not reflect

Student(Student s1){
   this.name = s1.name;
   this.rollNo = s1.rollNo;
   this.marks = new int[s1.marks.length];
   for(int i = 0 ; i < s1.marks.length ; i++){
    this.marks[i] = s1.marks[i]; 
   } // here we are taking value
}

// destructor is used to free the memory used by our objects or varibales created using new keyword (in our computers heap memory)
// in java we dont create destructor because javas garbage collector always does that

}

// ------------------------------------------------------------------------XXXXXX-------------------

// What is Inheritance?
// Inheritance is a concept where a class (called the child or derived class)
// can use the properties and methods of another class (called the parent or base class).

// Why do we use it?
// If two or more classes have similar properties or methods,
// instead of writing the same code again, we write it once in the base class
// and let the other classes inherit it.

// This helps in:
// - Code reuse
// - Better organization
// - Easier maintenance

class Animal{

String name;
String color;
String voice;
String food[];
boolean landAnimal;


void eat(){
    System.out.println("it eats");
    for(int i = 0 ; i < food.length ; i++){
        System.out.print(food[i] + " ");
    }
    System.out.println();
}

void breath(){
    if(landAnimal){
        System.out.println("breath in Land");
    }
    else{
        System.out.println("breath in Water");
    }
}

}

class fish extends Animal{ // this fish class is taking properties and methods of that animal class
int fins;


void swim(){
    System.out.println("swims in water");
}

}

// types of inheritance 
// 1. single level inheritance :-  here baseclass ->  derived class  animal  -> fish
// 2. multi level inheritance :- baseclass -> derived class -> derived class animal -> mammal -> dog
// 3. Hierarchial Inheritance:->  baseclass
//                              /         \
//                         derived       derived
//                         class          class

//       Animal
//     /       \
//   fish     mammal

// hybrid inheritance :- where we can see various tupes of inheritance
// multiple inheritance:- it is not allowed in java but we can achive this using interfaces
// here a derived class can we derived from two or more base classes 

// __________________________________________________________________

// Polymorphism
// "Poly" means many, and "morph" means forms.
// Polymorphism means having many forms.
// It allows us to perform the same action in different ways.
// Example: A function or method can behave differently based on the object calling it.

// types of polymorphysm
// 1. runtime polymorphysm :- method overloading 
// 2. compiletime polymorphysm :- method overrideing

// method overloading :- when we create multiple fuunction with the same name but different parameters 
// it do not depends on return type 
// it depends whether we can change the parameters datatype 
// or  whether we can change the parameters count

// method overriding 
// when we create same method on both parent and child class with different definiiton

// ---------------------------------------------------------------------------XXXXXXXXXXXXXXXXXXXXX-------------------------------

// Packages in Java
// A package is a group of similar types of classes, interfaces, and sub-packages.
// It helps organize the code and avoid name conflicts.

// For example, in a shopping website, we might have different features like:
// - Rating
// - Add to Cart
// - Search

// Each of these features has its own set of classes and methods.
// To keep things organized, we can place the related classes for each feature in their own package.

// This improves code readability, maintenance, and structure.
// there are two types of packages 
// 1. in built packages  (predefined made by java)
// 2. userDefined

// ---------------------------------------------------------------------------XXXXXXXXXXXXXXXXXXXXX-------------------------------


// Abstraction
// Abstraction means hiding unnecessary details and showing only the essential features to the user.
// It is achieved using abstract classes or interfaces.

// We cannot create an instance of an abstract class directly.
// An abstract class can have both abstract and non-abstract methods.
// It can also have a constructor.

abstract class People {

    People() {
        System.out.println("Hi, I am a human");
    }

    void eat() {
        System.out.println("People eat");
    }

    abstract void walk();
    abstract void worktime();
}

class Employee extends People {

    void walk() {
        System.out.println("Employee can walk in day shift or in night shift.");
    }

    void worktime() {
        System.out.println("Employees have to work 8 hours, either in the day or night.");
    }
}

class Teacher extends People {

    void walk() {
        System.out.println("Teachers walk during the day for their job and also in the market.");
    }

    void worktime() {
        System.out.println("Work time is from 8 AM to 3 PM.");
    }
}

// We can create objects of Employee and Teacher, but not of People (the abstract class).
// Each derived class must provide its own implementation of the abstract methods.
// This demonstrates polymorphism — we define abstract methods once and provide different implementations in each subclass.
// Abstract classes allow code reusability and common structure while enforcing certain methods to be implemented.
// The constructor in the abstract class is called when a subclass object is created.


// ---------------------------------------XXXXXXXXXXXXXXXXXXXXX-------------------------------

// Interface 
// interface is a blueprint of a class
// interface is used to achive multiple inheritance or total abstraction 
// intercafe is implemented class is extended

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left right , diagonally");
    }
}


// here we are doing multiple inheritance using inheritance

interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Flying"); }
    public void swim() { System.out.println("Swimming"); }
}



// -------------------------------------XXXXXXXXXXXXXXXXXXXXX-------------------------------

// Static Keyword
// The static keyword in Java is used to create variables or methods that belong to the class, not to individual objects.
// For example, if we make a static variable like age or collegeName:
// static int age = 18;
// Then all objects of the class share the same value of that variable.
// If one object changes the value of a static variable, it affects all other objects.
// This is because static variables are stored in a common memory area for the class.


// ----------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx----------------------------------


// Super keyword 

// Super keyword is used to refer immediate parent class object
// 
// -to access parents properties
// -to access parent's functions
// -to access parents constructor 