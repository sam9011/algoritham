package com.java.logic.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.logic.basic.java8.request.AddOrder;
import com.java.logic.basic.java8.request.Order;

public class Java8Program {
	
	public static void main(String[] args) {
		
		List<Order> lo = new ArrayList<>();
		
		List<Order> lo1 = null;
		lo.add(AddOrder.addOrder());
		lo.add(AddOrder.addOrder());
		lo.add(AddOrder.addOrder());
		lo.add(AddOrder.addOrder());
		lo.add(AddOrder.addOrder());
		
//		lo1 = lo.stream().filter(o->o.getProducts().stream().
//				filter(p->p.getCategary().equals("tech-1")).isParallel()).
//					collect(Collectors.toList());
		List<Integer> list= new ArrayList<>();
		
		list.add(4);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(9);
		
		List<Integer> val = Arrays.asList(1,2,4,3,5,3,2,3);
		
		Set<Integer> s=new HashSet<>();
		
		Set<Integer> s1=val.stream().collect(Collectors.toList()).stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toSet());
		
		int an =s1.stream().skip(2).findFirst().get();
		Integer ans = val.stream().collect(Collectors.toSet()).stream().sorted((a,b)->(a>b)?1:(a<b)?-1:0).skip(5-1).findFirst().get();
		
		System.out.println(an);
//		 val.stream().filter(v->!s.add(v)).collect(Collectors.toList()).stream().forEach(System.out::println);
		
		 List<Integer> l =val.stream().sorted((a,b)->(a>b)?1:(a<b)?-1:0).collect(Collectors.toList());
		 
//		 l.stream().forEach(System.out::println);
		 
//		list.stream().sorted((a,b)->(a>b)?1:(a<b)?-1:0).forEach(System.out::println);
		
//		Map<String, List<Product>> map = lo.get(0).getProducts().stream().
//		sorted((p1,p2)->(p1.getPrice()<p2.getPrice())?1:(p1.getPrice()>p2.getPrice())?-1:0)
//		.collect(Collectors.groupingBy(Product::getCategary));
//		
//		Iterator it = map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			String s1 =(String) it.next();
//			System.out.print(s1+" : ");
//			System.out.println(map.get(s1));
//		}
		
		
//		AddProduct.addProduct().forEach(System.out::println);
	}

}
