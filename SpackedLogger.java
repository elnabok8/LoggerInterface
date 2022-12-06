package Week5Homework;

public class SpackedLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		for (int n=-1; n<log.length()-1; n++, 
				System.out.print((log.charAt(n)) + " "));
}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		System.out.print("Error: ");
		int lemon = 0;
		for (int n=0; n<error.length(); n++, lemon = n) 
		System.out.print(error.charAt(lemon) + " ");
		
		}

}

//Error: " + error.charAt(n)
