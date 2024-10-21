package project.dev.v2;

public class PositiveNumber {

	public static void main(String[] args) {
		int []arr=new int[] {2,-5,0,1,3,-5};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				count++;
			}
		}
		System.out.println("Number of positive are :"+count);

	}

}
