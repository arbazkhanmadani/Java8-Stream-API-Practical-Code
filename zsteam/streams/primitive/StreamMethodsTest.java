package in.dsa.zsteam.streams.primitive;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsTest {
	

	public static void max(){
		
		/**
		 By default max(), min(), findAny() and findAll() returns Optional class's Obj if we hafta get 
		 integer min and max value then we hafta use get() like this ->
		
		 Integer min = age.min( (p1,p2) -> p1.compareTo(p2) ).get();
		 */
		Stream<Float> price = Stream.of(10.0f, 10.1f, 15.1f, 50.0f, 100.0f, 500.0f, 12.0f, 1000.0f, 5000.0f); 
		
		Optional<Float> max = price.max( (p1,p2) -> p1.compareTo(p2));
		System.out.println(max);
	}
	
	
	public static void min(){
		
		Stream<Integer> age = Stream.of(3,4,6,7,4,3,22,4,6,55,3,3); 
		
		Integer min = age.min( (p1,p2) -> p1.compareTo(p2) ).get();
		System.out.println(min);
	}
	
	public static void count(){
		
		/**
		  Stream<String> => If we don't use generic then Stream consider all data type as Object
		 */
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		Long count = names.count();
		System.out.println(count);
	}
	
	
	public static void limit() {
	
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    .filter(i -> i % 2 == 0)
	    .limit(2)
	    .forEach(i -> System.out.println(i + " "));
	}
	
	
	public static void distinct(){
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    .filter(i -> i % 2 == 0)
	    .distinct()
		.forEach(i -> System.out.println(i + " "));
	}
	

	public static void skip(){
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    .filter(i -> i % 2 == 0)
	    .skip(2)
	    .forEach(i -> System.out.println(i + " "));
	}
	
	
	public static void collect(){
		
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		Set<String> nm = names.filter(name -> name.length()>5).collect(Collectors.toSet());
		nm.forEach(System.out::println);
	}

	public static void filter(){
		
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		Stream<String> nm = names.filter(name -> name.length()>5);
		nm.forEach(System.out::println);
	}
	
	
	public static void map(){

		Stream<Float> price = Stream.of(10.0f, 10.1f, 15.1f, 50.0f, 100.0f, 500.0f, 12.0f, 1000.0f, 5000.0f); 

		Stream<Float> prices = price.map(prc -> prc*10);
		prices.forEach(System.out::println);
	}
	

	
	public static void sortByComparator(){
		
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		List<String> sorted = names.sorted( (n1, n2) -> n2.compareTo(n1) ).collect(Collectors.toList());
		sorted.forEach(System.out::println);
	}
	

	public static void sortByDefault(){
		
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		List<String> sorted = names.sorted().collect(Collectors.toList());
		sorted.forEach(System.out::println);
	}
	
	
	public static void anyMatch(){
		
		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		/**
		 Note : Method reference can't be use for Primitive data types.
		 */
		boolean flag = names.anyMatch( n -> n.startsWith("a") );
		System.out.println(flag);
		
	}
	
	public static void allMatch(){

		Stream<Integer> age = Stream.of(3,4,6,7,4,3,22,4,6,55,3,3); 
		
		boolean flag = age.allMatch( n -> n.equals(10) );
		System.out.println(flag);
	}
	
	
	public static void findFirst(){

		Stream<String> names = Stream.of("arbaaz", "zaid","sarafaraz","aman","shadab","tabish"); 

		String name = names.findFirst().get();
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
}
