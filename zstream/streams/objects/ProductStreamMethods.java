package in.dsa.zstream.streams.objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
wwo
public class ProductStreamMethods {

	static ArrayList<Product> product = ListOfProduct.listOfProduct();
	
	
	public static void min(){
	
		/**
		min( (p1,p2) -> p1.price()>p2.price() ? 1: -1).get()
		p1.price()>p2.price() ? 1: -1 => ternary operator.
		p1, p2 => are min max comparators
		1 => if max
		-1 => if min
		get() => for getting result
		*/
		
		Product maxProduct = product.stream().max( (p1,p2) -> p1.price()>p2.price() ? 1: -1).get();    
		System.out.println(maxProduct.price());  
	
	}
	
	public static void max(){
		
		 /**
		 max( (p1,p2) -> p1.price()>p2.price() ? 1: -1).get()
		 p1.price()>p2.price() ? 1: -1 => ternary operator.
		 p1, p2 => are min max comparators
		 1 => if max
		 -1 => if min
		 get() => for getting result
		*/
		
		Product maxProduct = product.stream().max( (p1,p2) -> p1.price()>p2.price() ? 1: -1).get();    
		System.out.println(maxProduct.price());  
	
		
	}

	
	public static void filter(){
	
		//Filtering Data..................
		product.stream().filter( prod -> prod.name().startsWith("B") && prod.type().equals("Watch"))
		.forEach(elm -> System.out.println(elm) );
			
	}
	
	
	public static void skip(){
		
		//It skips the data from the sentinal..................
		product.stream().filter( prod -> prod.name().startsWith("B") && prod.type().equals("Watch"))
		.skip(1).forEach(elm -> System.out.println(elm) );
			
	}
	
	

	public static void limit(){
		
		//it limits the result..................
		product.stream().filter( prod -> prod.name().startsWith("B") && prod.type().equals("Watch"))
		.limit(3).forEach(elm -> System.out.println(elm) );
			
	}
	
	
	public static void sort(){
		
		
		/**
		 Comparator<Product> = Generic is mandatory otherwise will get Error. 
		 * */
		
		/*Comparator<Product> idComparator = (p1, p2) ->{
			return p2.type().compareTo(p1.type());
		};*/
		
		List<Product> al = product.stream().sorted( (p2,p1) ->p2.type().compareTo(p1.type()) ).collect(Collectors.toList());
		al.forEach(elm -> System.out.println(elm) );
	}
	
	public static void map(){
		
		//Mapping Data....................                  //Method reference ::
		product.stream().map(prod -> prod.id()*2).forEach(System.out::println);
	}
	
	public static void count(){
		
		//Counting.................
		long count = product.stream().filter(prod->prod.price()<30000).count();  
		System.out.println("less than 30000 are : "+count); 
	}
	
	
	public static void getStream(){
	
		//Alternating way to return then iterate.............
		Stream<Integer> mapped = product.stream().map(prod -> prod.id()*2).distinct();
		mapped.forEach(n -> System.out.println(n));
	}	
		
	public static void toList(){
		
		/**
		 Collectors -> can be used to collect as list ,set,map,doing sum,min,max etc 
		Collecting result as List.......
		*/
		List priceList =product.stream().filter(p -> p.price()>30000)  
		                  .map(p->p.price()) // fetching price  map used only for getting prices else entire obj will be fetched.
		                  .collect(Collectors.toList()); // collecting as list  
				  
		System.out.println(priceList); 
	}
	
	
	public static void toSet(){
	
		/**
		Collectors -> can be used to collect as list ,set,map,doing sum,min,max etc 
		Collecting result as List.......
		*/
		Set priceSet =product.stream().filter(p -> p.price()>30000)  
                  .map(p->p.price()) // fetching price  map used only for getting prices else entire obj will be fetched.
                  .collect(Collectors.toSet()); // collecting as list  
		  
		System.out.println(priceSet); 

	}
	
	public static void toMap(){
		  
		// Converting into Map................  
	    Map<String,Integer> productPriceMap = product.stream()
	    		   			// making name = keys and id = values
	    		   			 .collect( Collectors.toMap( p -> p.name(), p -> p.id() ));  
	              
	    System.out.println(productPriceMap); 
	}
}
