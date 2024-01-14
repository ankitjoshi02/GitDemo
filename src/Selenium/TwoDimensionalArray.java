package Selenium;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int [][]a=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		/*
		int a[][]= {{100,200},{300,400},{500,600},{700,800}};
		System.out.println(a.length);//number of columns
		System.out.println(a[0].length);//number of rows
		System.out.println(a[3][1]);
		*/
		
		/*
		reading array with standars for loop
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		*/
		int a[][]= {{100,200},{300,400},{500,600},{700,800}};
		for(int x[]:a) {
			for(int v:x) {
				System.out.println(v);
			}
		} 
		}
	}