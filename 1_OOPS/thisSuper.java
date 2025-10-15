// this and super methods 

// NOTE : EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS
// Even if you don't call it's there 
class A extends Object{

    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }

}

class B extends A {

    // By default every Constructor have the first statement super();
    // you mention or not it will call by default
    public B() {

        super(); // call the constructor of the parent class
        System.out.println("in B");
    }

    public B(int n) {
        this(); // this method will call the constructor of the same class 
        // super(n); // call the parameterized constructor of the parent class
        System.out.println("in B int");
    }
}

public class thisSuper {
    public static void main(String[] args) {

        B obj = new B(5);
        // even though created object of the subclass, parent class's Constructor also
        // called / instantiated
    }
}
