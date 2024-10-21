package project.dev.v2;

import java.util.Scanner;

public class MultipleOfFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number till multiple you want: ");
		int n=sc.nextInt();
		int []arr=new int[n/5];
		int k=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				arr[k++]=i;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
