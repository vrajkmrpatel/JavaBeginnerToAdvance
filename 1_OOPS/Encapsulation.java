// Encapsulation : Keeping it close keeping it tight and no one from the outside world can use it

class Human {

    // Rule: Every time you create an instance variable **MAKE IT PRIVATE**
    private int age;
    private String name;

    // Constructor : it's a special method which invokes first whenever a new object is created....
    // Generally it is used for the initialization
    public Human() {
        age = 21;
        name = "John";

        System.out.println("in constructor");
    }

    // parameterized constructor
    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // THE OUTER WORLD CAN ACCESS THE PRIVATE DATA VIA METHODS
    // GETTER AND SETTER MEHODS

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // this is a keyword which represent the current object.
    // here current object = calling object
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class Encapsulation {

    public static void main(String[] args) {

        Human obj = new Human();
        // Human obj1 = new Human(18, "Vraj");

        System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.age = 11;
        // obj.name = "Naveen";

        obj.setAge(30);
        obj.setName("Reddy");
        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
