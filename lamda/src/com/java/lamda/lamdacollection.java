package com.java.lamda;

import java.util.Arrays;
import java.util.List;

public class lamdacollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		List<Person> people = Arrays.asList(new Person("chen","pang",12),
				                     new Person("han","pang",13));
		
		for(int i=0 ; i< people.size(); i++)
		{
			System.out.println("person:" + people.get(i).getFirstname()) ;
		}
		
		people.forEach(s -> System.out.println("for each:"+s.getFirstname()));
			
		for(Person p : people)
		{
			System.out.println("for cool" + p.getFirstname());
		}
		people.forEach(System.err::println);
		
		people.stream().filter(s-> 13 == s.getAge()).forEach(System.out::println);
	}

}
