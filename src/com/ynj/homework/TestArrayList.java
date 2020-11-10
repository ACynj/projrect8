package com.ynj.homework;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String []args) {
ArrayList<String> cityList=new ArrayList<>();
cityList.add("London");
cityList.add("Denver");
cityList.add("Paris");
   cityList.add("Miami");
   cityList.add("Seoul");
   cityList.add("Tokyo");
   System.out.println("List size "+cityList.size());
   System.out.println("Is Miami in the ist?"+cityList.contains("Miami"));
   System.out.println(cityList.isEmpty());
   cityList.add(2,"Xian");
   cityList.remove(1);
   System.out.println(cityList.toString());
   for(int i=cityList.size()-1;i>=0;i--) {
	   System.out.println(cityList.get(i));
   }
	}
	
}
