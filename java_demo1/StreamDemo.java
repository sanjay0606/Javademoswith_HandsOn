package com.org.gen.D5;

import java.util.ArrayList;
import java.util.stream.Stream;
// object as a data source
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> rr =new ArrayList<String>();
rr.add("Java");
rr.add("dataStructurs");
rr.add("Pyhton");
rr.add("DBMS");

//creating object of stream where Stream is created using arraylist
//and object as data source
Stream<String> name = rr.stream();

//print and display
name.forEach(p-> System.out.print(p));


	}

}
