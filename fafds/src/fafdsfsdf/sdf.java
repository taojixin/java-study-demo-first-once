package fafdsfsdf;

import java.util.Scanner;

public class sdf {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("请问输入几个数");
		int num = reader.nextInt();
		System.out.print("这"+num+"数是：");
		int arr1[] = new int[num];
		for(int k = 0;k < arr1.length;k++){
			arr1 [k]=reader.nextInt();
		}
		for(int i=0;i<arr1.length-1;i++){
			for(int j=0;j < arr1.length-1-i;j++){
				if(arr1[j]>arr1[j+1]){
					int tep=arr1[j];
					arr1[j]=arr1[j+i];
					arr1[j+1]=tep;
				}
			}
		}
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
