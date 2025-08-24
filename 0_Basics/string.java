public class string {

      public static void main(String[] args) {

            // String name = "naveen";

            // name = name + " reddy";

            // System.out.println("Hello " + name);

            // System.out.println(name.charAt(2));
            // System.out.println(name.concat(" reddy"));

            // String s1 = "Naveen";
            // String s2 = "Naveen";

            // System.out.println(s1 == s2);
            // System.out.println(s1);

            // STRING BUFFER
            // String Buffer is Thread Safe

            StringBuffer sb = new StringBuffer("Navin");
            System.out.println(sb.capacity());
            System.out.println(sb.length());

            sb.append(" Reddy");

            System.out.println(sb);
            sb.deleteCharAt(3);
            System.out.println(sb);
            sb.insert(3, "ee");
            System.out.println(sb);
            sb.insert(6,78); // can add int too.
            System.out.println(sb);

            System.out.println(sb.substring(2, 8));

            String str = sb.toString();
            

            // STRING BUILDER
            // String Builder is not Thread Safe. 
            
      }
}
