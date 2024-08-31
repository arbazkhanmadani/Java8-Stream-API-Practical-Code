package in.dsa.zsteam.streams.primitive;


public class WaysToCreateCall {

	public static void main(String[] args) {
		
		System.out.println("1.----------------------Empty Stream-------------------------");
		WaysToCreateStream.emptyStream();

		System.out.println("2.----------------------Double Stream-------------------------");
		WaysToCreateStream.doubleStream();;

		System.out.println("3.----------------------Primitive Stream-------------------------");
		WaysToCreateStream.primitiveStream();;

		System.out.println("4.----------------------Primitive Array Stream-------------------------");		
		WaysToCreateStream.streamOfPrimitiveArray();

		System.out.println("5.-----------------------Object Array Stream------------------------");
		WaysToCreateStream.streamOfObjectArray();

		System.out.println("6.-----------------------Iterator Stream------------------------");
		WaysToCreateStream.StreamByIterator();
		System.out.println("7.-----------------------Generator Stream------------------------");
		WaysToCreateStream.StreamByGenerator();
		
	}
	
}
