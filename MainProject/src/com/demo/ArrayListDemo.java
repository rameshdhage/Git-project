package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String > al=new ArrayList<String>();
		al.add("pawan");
		al.add("shiva ");
		al.add("shashi");
		al.add("rawi");
		
  for(String itr:al) {
	 System.out.println(itr);}
  
       Iterator<String >itr= al.iterator();
       
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
  
  
  
	}

}
