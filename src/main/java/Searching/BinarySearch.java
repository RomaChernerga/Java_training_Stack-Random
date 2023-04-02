package Searching;

public class BinarySearch {
    public static int search(Integer[]arr, int num) {

        int start = 0;
        int end = arr.length-1;
        int i = 0;
        int base;
        


        while (end >= start) {
            i++;
            base = (start + end)/2;
            System.out.println("Base: " + base);
            if(arr[base] == num) {
//                System.out.println("Binary_iterations: " + i);
                return base;
            } else if (arr[base] > num) {
                end = base -1;
            } else {
                start = base + 1;
            }
        }
        System.out.println("Binary_iterations: " + i);
        return -1;
    }

}
