// Inheritance - 
// Ex -  A laptop is a computer. 
// here, the laptop gots its features from the computer

public class Inheritance {
    public static void main(String[] args) {

        VeryAdvancedCalc obj = new VeryAdvancedCalc();

        int r1 = obj.add(10, 20 );
        int r2 = obj.sub(10, 20);
        int r3 = obj.multi(10, 20);
        int r4 = obj.div(100, 20);
        double r5 = obj.power(10, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}