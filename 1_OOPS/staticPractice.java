class Mobile {

      String brand;
      int price;
      static String name; // All the objects are refer the same static variable
      // static variables are share by all the objects

      // static block
      static {
            name = "Phone";
            System.out.println("in static block");
      }

      // Constructor Class
      public Mobile() {

            brand = "";
            System.out.println("in constructor block");
      }

      // simple show method
      public void show() {

            System.out.println(brand + " : " + price + " : " + name);
      }

      // static method
      public static void show1(Mobile obj) {
            System.out.println("In a static method");
            System.out.println(obj.brand + " : " + obj.name); 
      }

}

public class staticPractice {

      public static void main(String[] args) throws ClassNotFoundException {

            // if you want to load a class without any objects created...
            // Class.forName("Mobile");

            Mobile obj1 = new Mobile();
            obj1.brand = "Samsung";
            obj1.price = 1500;
            Mobile.name = "Smartphone";

            // Mobile obj2 = new Mobile();
            // obj2.brand = "Apple";
            // obj2.price = 1299;
            // Mobile.name = "Smartphone";

            // Mobile.name = "Phone";

            // System.out.println();

            // obj1.show();
            // obj2.show();

           
            // Mobile.show1(obj1);

      }
}
