package in.dsa.zsteam.streams.primitive;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class WaysToCreateStream {

	
	public static void streamOfPrimitiveArray(){
		
		Stream<Integer> ints = Stream.of(1,2,3,4,5,6,7,8,9);
		ints.forEach(System.out::println);
	}
	
	
	public static void streamOfObjectArray(){
		
		Integer[] arr = {1,2,3,4,5};
		Stream<Integer> ints = Arrays.stream(arr);
		ints.forEach(System.out::println);
	}
	
	
	public static void emptyStream(){
		
		Stream empty = Stream.empty();
		empty.forEach(System.out::println);
	}
	

	public static void stringStream(){
		
		Stream string =(String)"abcdef".chars();
		string.forEach(System.out::println);
	}
	
	
	public static void doubleStream(){
		
		DoubleStream value = DoubleStream.of(1.2,2.2,3.1);
		value.forEach(System.out::println);
	}
	
	
	public static void primitiveStream(){
		
		/**
		  range(inc, exd)        => 1st include , 2nd exclude
		  rangeClosed(inc, exd); => 1st include , 2nd include
		 */
		LongStream value = LongStream.range(10, 15);
		value.forEach(System.out::println);
	}
	
	public static void StreamByIterator(){
		

		/**
		  While creating stream by 
		  generate() and iterator()
		  function if we don't use limit() 
		  then infinite stream will be created and we go in infinite loop.
		*/
		
		Stream iterate = Stream.iterate(1, element -> element+1)  
		        .filter(element -> element%5==0)  
		        .limit(5);  
		
		iterate.forEach(System.out::println);
	}
	
	
	public static void StreamByGenerator(){
		
		/**
		 generate( new Random().nextInt() ) => method calling is not allowed in generate();
		 generate( new Random()::nextInt ) => only method reference is allowed in generate();
		 */
		
		Stream.generate( new Random()::nextInt ).limit(3).forEach(System.out::println);
	}
	
	

	
	
}
