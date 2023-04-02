import Searching.BinarySearch;
import Searching.InterpolationSearch;
import kotlin.Result;
import kotlin.random.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.random.RandomGenerator;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class main {
    public static void main(String[] args) throws IOException {

//        ArrayList<String> arList = new ArrayList<>();
//        arList.add("Mama");
//        arList.add("auTo");
//        arList.add("griB");
//        arList.add("aPple");
//        System.out.println(arList);
//
//        Pattern pattern = Pattern.compile("\\b\\p{Upper}\\p{Alpha}*\\p{Upper}\\b");
//        Pattern pattern1 = Pattern.compile("\\D\\S\\[A-Za-z]\\[^0-9]");

        final int SIZE = 20000;
        Integer[]arr = new Integer[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Random.Default.nextInt(0,30000);
        }
        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch.search(arr, 15000));
        System.out.println(InterpolationSearch.search(arr, 15000));



    }


}
