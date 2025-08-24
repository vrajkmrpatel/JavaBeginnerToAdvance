
class A extends Object {
      public A() {
            super();
            System.out.println("in A");
      }

      public A(int a) {

            super();
            System.out.println("in A int");
      }

}

class B extends A {
      public B() {
            super();
            System.out.println("in B");
      }

      public B(int n) {
            this();
            System.out.println("in B int ");
      }
}

public class thissuper {
      public static void main(String[] args) {

            B ojb = new B(5);
      }
}
