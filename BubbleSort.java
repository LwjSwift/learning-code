package com.test.pck;

public class BubbleSort {
	public static void Sort(int[] array)
	{
		int temp;
		for(int i=0;i<array.length-1;i++)
			for(int j=0;j<array.length-i-1;j++)
			{
				if (array[j]>array[j+1])
				{
					temp=array[j];
			        array[j]=array[j+1];
			        array[j+1]=temp;
		        }
		    }
	}
	
	public static void GetArray(int[] array)
	{
		for(int m=0;m<array.length;m++)
			if (m==array.length-1)
			System.out.println(array[m]);
			else System.out.print(array[m]+",");
	}
	
	
	public static void main(String []args){
		int[] arra={9,3,6,5,4,3,8};
		System.out.println("before sort");
		GetArray(arra);
		System.out.println("after sort");
		Sort(arra);
		GetArray(arra);
	}	
}
