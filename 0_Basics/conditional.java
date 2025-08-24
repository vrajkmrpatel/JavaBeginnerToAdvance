public class conditional {
      public static void main(String[] args) {

            // if-else

            // int x = 8;
            // int y = 7;
            // int z = 9;

            // if (x > y && x > z)
            // System.out.println(x);
            // else if (y > z) // x is small so only checking for y > z condition
            // System.out.println(y);
            // else
            // System.out.println(z);

            // ternary

            // int n = 5;
            // int result = 0;

            // // if (n % 2 == 0)
            // //       result = 10;
            // // else
            // //       result = 20;

            // // ternary operator   if  else
            // result = n % 2 == 0 ? 10 : 20;

            // System.out.println(result);



            // switch statements

            int n = 3;

            switch (n) {
                  case 1:
                        System.out.println("Monday");
                        break;
                  case 2:
                        System.out.println("Tuesday");
                        break;
                  case 3:
                        System.out.println("Wednesday");
                        break;
                  case 4:
                        System.out.println("Thursday");
                        break;
                  case 5:
                        System.out.println("Friday");
                        break;
                  case 6:
                        System.out.println("Saturday");
                        break;
                  case 7:
                        System.out.println("Sunday");
                        break;
            
                  default:
                        System.out.println("Enter in range of (1-7)");
                        break;
            }
      }
}
