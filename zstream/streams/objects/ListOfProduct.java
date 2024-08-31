package in.dsa.zstream.streams.objects;

import java.util.ArrayList;

public class ListOfProduct {

	public static ArrayList<Product> listOfProduct() {


		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product(1,  25000, "HP", "Laptop"));
		list.add(new Product(2,  35000, "Dell", "Laptop"));
		list.add(new Product(3,  30000, "Lenovo", "Laptop"));
		list.add(new Product(4,  55000, "Redmi", "Phone"));
		list.add(new Product(2,  65000, "Samsung", "TV"));
		list.add(new Product(6,  20000, "14 pro", "Phone"));
		list.add(new Product(7,  15000, "Boat smart", "Watch"));
		list.add(new Product(3,  95000, "LG", "TV"));
		list.add(new Product(9,  85000, "Boalt", "Watch"));
		list.add(new Product(10, 85000, "Boat 95", "Ear buds"));
		
		list.forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		return list;
	}

}
