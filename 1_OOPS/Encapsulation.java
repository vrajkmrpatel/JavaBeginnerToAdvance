// Encapsulation : Keeping it close keeping it tight and no one from the outside world can use it

class Human {

    // Rule: Every time you create an instance variable **MAKE IT PRIVATE**
    private int age;
    private String name;

    // THE OUTER WORLD CAN ACCESS THE PRIVATE DATA VIA METHODS
    // GETTER AND SETTER MEHODS

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "Naveen";
        
        obj.setAge(30);
        obj.setName("Reddy");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
