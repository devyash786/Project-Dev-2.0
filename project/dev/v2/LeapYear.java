package project.dev.v2;

import java.util.ArrayList;
import java.util.List;

public class LeapYear {

	public static void main(String[] args) {
		int[]arr=new int[] {2007,2008,2000,2100,2400,2010,2016};
		List<Integer> list=new ArrayList<>();
		for(int i:arr) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				list.add(i);
			}
		}
		System.out.println(list);

	}

}
