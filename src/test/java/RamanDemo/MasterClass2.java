package RamanDemo;

import java.util.Scanner;

public class MasterClass2 {

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
		int fmax = arr[0];
		int smax = arr[0];
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]>=fmax)
			{
				if(arr[a]!=fmax)
				{
					smax=fmax;
				}
				fmax = arr[a];
			}
			else if(arr[a]>smax||fmax==smax)
			{
				smax =arr[a];
			}
		}
		System.out.println("First and second max value are "+fmax +" "+smax);
		

	}

}
