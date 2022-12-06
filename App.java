package Week5Homework;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Here are my AsteriskLogger Inputs:");
System.out.println();
System.out.println();

		Logger logger = new AsteriskLogger();
		logger.Log("Hello");
		System.out.println();
		
		logger.Log("Kate");
		System.out.println();
		logger.Error("Kate");
		System.out.println();

		System.out.println("Here are my SpackedLogger Inputs:");
		System.out.println();
		System.out.println();

		Logger logger1 = new SpackedLogger();
		logger1.Log("Hello");
		
		System.out.println();
		
		logger1.Error("hello");
		
		System.out.println();
		
		
		
	}

}
