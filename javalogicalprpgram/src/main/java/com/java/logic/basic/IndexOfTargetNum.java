package com.java.logic.basic;

import java.util.stream.Stream;

public class IndexOfTargetNum {
	

		  public static void main(String[] args) {
		    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		    int targeNum = 9;
		    
		    String l =stream.reduce((a,b)->(a+b)==targeNum?a:(a+b)!=9?b:2).get().toString();

		    System.out.println(l);
//		    l.stream().forEach(System.out::print);
		    //		    Stream<Integer> newStream = stream.map(add);
//		    newStream.forEach(System.out::println);
		  }
}
