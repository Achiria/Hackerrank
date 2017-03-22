import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int reverse[] = new int[n];
        for (int i = n; i > 0; i--) {
            reverse[n - i] = arr[i - 1];
        }
        
        for (int j = 0; j < n; j++) {
            System.out.print(reverse[j] + " ");
        }
    }
}