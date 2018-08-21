package com.Basicpgm;

public class Multidimensionalarray {

	public static void main(String[] args) {
	String a[][]= new String[2][2];
	
a[0][0]="bhanu";
a[0][1]="chandu";
a[1][0]="hello";
a[1][1]="hii";

	for(int i=0;i<a.length;i++) 
	{
		
	for(int j=0;j<a.length;j++) {
		
		System.out.print(a[i][j]+ " ");
	}
	System.out.println();
	
}
}
}