package com.org.gen.D5;

import java.util.Random;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream.of()
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9);
		s1.forEach(p->System.out.print(p));
		

		Stream<Integer> s2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		s2.forEach(System.out::print);
		
		
		//produce 10 random numbers
		Stream<Integer> ran = Stream.generate(()->(new Random()).nextInt(100));
		ran.limit(10).forEach(System.out::println);
	
	}

}
