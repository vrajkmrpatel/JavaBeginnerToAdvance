class Human {

      private int age;
      private String name;

      // default Constructor
      public Human() {
            // System.out.println("in constructor");
            age = 24;
            name = "John";
      }

      // parameterized Constructor
      public Human(int age, String name) {
            this.age = age;
            this.name = name;
      }

      public int getAge() {
            return age;
      }

      public void setAge(int age) {
            // Human obj1 = obj;
            // obj.age = age;
            this.age = age;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

}

public class static2 {
      public static void main(String[] args) {

            Human h1 = new Human();
            Human h2 = new Human(18, "Arjun");

            // h1.age = 19;
            // h1.name = "NamDoSan";

            // assigning data using methods to private members
            // h1.setAge(22);
            // h1.setName("Vraj");

            // getting data using methods
            System.out.println(h1.getName() + " : " + h1.getAge());
            System.out.println(h2.getName() + " : " + h2.getAge());

      }
}
