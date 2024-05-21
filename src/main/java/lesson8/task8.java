package lesson8;

import java.util.TreeSet;

public class task8 {

    public static void main(String[] args) {
        String somestring = "масло, масло, ковбаса, молоко";
        String[] somewords = somestring.split(", ");
        TreeSet<String> result = new TreeSet<>();
        for (int i = 0; i < somewords.length; i++) {
            result.add(somewords[i].substring(0, 1).toUpperCase() + somewords[i].substring(1).toLowerCase());
        }
        int n = result.size();

        String arr[] = result.toArray(new String[n]);
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }

}


