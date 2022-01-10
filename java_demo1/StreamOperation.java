package com.org.gen.D5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> m = new ArrayList<>();
		m.add("Saroo");
		m.add("ourav");
		m.add("Sam");
		m.add("un");
		m.add("Sunjay");
		
		//intermediate operation
		//stream.filter()
		m.stream().filter((s)->s.startsWith("S")).forEach(System.out::println);
		
		ArrayList<Integer> e = new ArrayList<>();
		e.add(1);
		e.add(2);
		e.add(3);
		e.add(4);
		e.add(5);
		e.add(6);
		e.stream().filter((s)->s%2==0).forEach(System.out::println);
	
		
		//stream.map()
		m.stream().filter((a)->a.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
	
		//stream.sorted()
		m.stream().sorted().forEach(System.out::println);
		
		//distinct()
List<String> m2 = m.stream().distinct().collect(Collectors.toList());		
System.out.print(m2);

	//flatMap()
List<Integer> list1 = Arrays.asList(1,2,3);
List<Integer> list2 = Arrays.asList(10,20,30);
List<Integer> list3 = Arrays.asList(11,22,33);

List<List<Integer>> list = Arrays.asList(list1,list2,list3);
List<Integer> list6 = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
System.out.print(list6);




		
		
	// terminal opertaor
		
	//stream.collect()
		
		m.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
	    System.out.print(m);
	
	
	//stream.match()
	boolean res = m.stream().anyMatch((p)->p.startsWith("S"));
	System.out.print(res);
	
	res = m.stream().allMatch((p)->p.startsWith("S"));
	System.out.print(res);
	
	res = m.stream().noneMatch((p)->p.startsWith("S"));
	System.out.print(res);
	
	//count
	long total = m.stream().filter((s)->s.startsWith("S")).count();
	System.out.print(total);
	
	//findfirst()
	String fname = m.stream().filter((p)->p.startsWith("o")).findFirst().get();
	System.out.print(fname);
	
	
	
	
	
	}

}
