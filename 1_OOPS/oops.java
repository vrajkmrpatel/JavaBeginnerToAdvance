
// local variables are part of stack

class Calculator {

      int num = 6; // heap memory

      public int add(int a, int b) {

            int res = a + b;

            System.out.println(num);
            return res;
      }

      public int add(int a, int b, int c) {

            return a + b + c;
      }

      public double add(double a, double b) {

            return a + b;
      }

}

public class oops {

      public static void main(String[] args) {

            // created new object to use class calculator
            Calculator obj1 = new Calculator();
            Calculator obj2 = new Calculator();
            // used add method of the class calculator by object's reference
            int result = obj1.add(3, 4);

            System.out.println(result);
            System.out.println(obj1.num);

            obj2.num = 9;
            System.out.println(obj1.num);
            System.out.println(obj2.num);
            // int result = num1 + num2;
            // System.out.println(result);

      }
}