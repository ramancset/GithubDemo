package RamanDemo;

import java.util.Arrays;
import java.util.Scanner;

public class MasterClass3 {

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Size will given to Array");
		int size = sc1.nextInt();
		int []arr = new int [size];
		for(int a=0; a<arr.length;a++)
		{
		
			  arr[a] = sc1.nextInt();
		}
		int fmin = arr[0];
		int smin = arr[0];
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]<=fmin)
			{
				if(arr[a]!=fmin)
				{
					smin=fmin;
				}
				fmin = arr[a];
			}
			else if(arr[a]>smin && fmin==smin)
			{
				smin =arr[a];
			}
		}
		System.out.println("First and second max value are "+fmin +" "+smin);
		
		

	}

}
