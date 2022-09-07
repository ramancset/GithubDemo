package RamanDemo;

import java.util.Arrays;
import java.util.Scanner;

public class MasterClass {

	 public static void main(String[] args) {
	        
			Scanner sc = new Scanner(System.in);
	        System.out.println("Array Size:-  ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        for (int a = 0; a < arr.length; a++) {
	            arr[a] = sc.nextInt();
	        }
	        System.out.println(Arrays.toString(arr));
	        int largestNo =0 ;
	        for (int a = 0; a < arr.length; a++)
	        {
	            for (int b = 1; b < arr.length; b++)
	            {
	                if (arr[a] >arr[b])
	                {
	                    largestNo = arr[a];
	                    arr[a]=arr[b];
	                    arr[b]=largestNo;
	                }
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	 }

}
