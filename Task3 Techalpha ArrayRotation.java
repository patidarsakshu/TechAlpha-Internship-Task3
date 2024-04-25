// Task 3-> Array Elements Rotation

import java.util.ArrayList;
import java.util.Collections;

public class ArrayRotation {
    
    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    
    public static void leftRotate(ArrayList<Integer> arr, int d) {
        int n = arr.size();
        d = d % n; 

        
        reverse(arr, 0, d - 1);
        
        reverse(arr, d, n - 1);
        
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7);
        int d = 2;
        leftRotate(arr, d);
        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
