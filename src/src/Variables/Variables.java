package Variables;
/*
 - Variable is a data container that stores the data values.
 - Types of Variables:
    1. Local
    2. Instance
    3. Static
*/

public class Variables {

    int age;
    // 2. Instance variable:
    // -> Variables that are declared inside a class but outside any method.
    // -> They are specific to an instance of the class and can be accessed by instance methods.

    static int wallet = 0;
    //  3. Static variable:
    // ->  biến chỉ thuộc Class, ko thuộc Object
    // -> khi 1 Object update biến static thì tất cả Oject khác sẽ nhận biến updated.

    public Variables (int age){
        age = age ;
    }

    void displayInfo (){
        // 1.Local
        // -> declared inside the body of a method.
        int localVariable = 12;
        System.out.println("localVariable: " + localVariable);
        System.out.println("age: " + age);
        System.out.println("wallet: " + wallet);
    }

}
