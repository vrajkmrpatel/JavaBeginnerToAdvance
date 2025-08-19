import java.lang.classfile.ClassFile.Option;
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        // List<Integer> arr = new ArrayList<>();

        // int[] arr1 = { 1, 2, 3 };

        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }

        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Honda");
        // cars.add("Kia");
        // cars.add("BMW");
        // cars.add("TATA");
        // cars.add("Alto");

        // System.out.println(cars);
        // // add an element
        // cars.add(0, "Audi");
        // System.out.println(cars);
        // // change an element
        // cars.set(0, "Hundai");
        // System.out.println(cars);
        // // remove an element
        // cars.remove(2);
        // System.out.println(cars);
        // // clear all element
        // // cars.clear();
        // // System.out.println(cars);

        // // loop through all the elements
        // for (String str : cars) {
        // System.out.println(str);
        // }

        // Collections.sort(cars);
        // System.out.println(cars);

        // Map<String, Integer> mp = new HashMap<>();

        // mp.put("abc", 50);
        // mp.put("def", 100);
        // mp.put("rohit", 200);
        // mp.put("harsh", 250);

        // for (Map.Entry<String, Integer> it : mp.entrySet()) {
        //     System.out.print(it.getKey() + " : ");
        //     System.out.println(it.getValue());
        //     System.out.println("-----------");
        // }

        // // System.out.println(mp.get("rahul") > 10);       // gives null value

        // // So we use Optional
        // Optional<Integer> marks = Optional.ofNullable(mp.get("rahul"));
        // if(marks.isPresent()) {
        //     /// portion of code
        // }else{
        //     System.out.println("I am not present");
        // }

        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(13);
        // list.add(15);
        // list.add(17);

        // System.out.println(list);

        // HashSet<String> cars = new HashSet<>();

        // cars.add("BMW");
        // cars.add("Honda");
        // cars.add("Kia");
        // cars.add("TATA");
        // cars.add("BMW");
        // cars.add("Alto");

        // System.out.println(cars);
        // // element contains in a set
        // System.out.println(cars.contains("BMW"));

        // // remove an element
        // cars.remove("Alto");
        // System.out.println(cars);

        // sort
        // Collections.sort(cars);

        // for sorted hashset we have TreeSet

        // Set<String> cars = new TreeSet<>();

        // cars.add("BMW");
        // cars.add("Honda");
        // cars.add("Kia");
        // cars.add("TATA");
        // cars.add("BMW");
        // cars.add("Alto");

        // System.out.println(cars);
        
        int n = 5;

        int[][] dp = new int[n][n];
        Arrays.fill(dp, -1);
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("---------");
        }
    }
}
