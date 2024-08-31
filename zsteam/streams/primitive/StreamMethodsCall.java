package in.dsa.zsteam.streams.primitive;

public class StreamMethodsCall {

	public static void main(String[] args) {

		System.out.println("A.---------------------------Min-------------------------------");
		StreamMethodsTest.min();
		System.out.println("B.---------------------------Max-------------------------------");
		StreamMethodsTest.max();
		System.out.println("C.---------------------------Count-------------------------------");
		StreamMethodsTest.count();

		System.out.println("D.---------------------------Skip-------------------------------");
		StreamMethodsTest.skip();
		System.out.println("E.---------------------------Distinct-------------------------------");
		StreamMethodsTest.distinct();
		System.out.println("F.---------------------------Limit-------------------------------");
		StreamMethodsTest.limit();
	
		System.out.println("G.---------------------------AllMatch-------------------------------");
		StreamMethodsTest.allMatch();
		System.out.println("H.---------------------------AnyMatch-------------------------------");
		StreamMethodsTest.anyMatch();
		System.out.println("I.---------------------------findFirst-------------------------------");
		StreamMethodsTest.findFirst();
	
		System.out.println("J.---------------------------Map-------------------------------");
		StreamMethodsTest.map();
		System.out.println("K.---------------------------Filter-------------------------------");
		StreamMethodsTest.filter();
		System.out.println("L.---------------------------Collect-------------------------------");
		StreamMethodsTest.collect();
	
		System.out.println("M.---------------------------sortByDefault-------------------------------");
		StreamMethodsTest.sortByDefault();
		System.out.println("N.---------------------------sortByComparator-------------------------------");
		StreamMethodsTest.sortByComparator();
	
	}

}
