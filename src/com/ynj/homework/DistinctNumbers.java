package com.ynj.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		ArrayList<Integer>list =new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integer");
		int value;
		do {
			value=input.nextInt();
			if(!list.contains(value)&&value!=0) {
				list.add(value);
			}
		}
			while(value!=0);
			
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
		
		
	}
}

	


