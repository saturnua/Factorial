import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int factInput = 0;
			
		//	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//	try{
		//		factInput = Integer.parseInt(in.readLine());
		//	}catch (IOException e){
			//	System.out.println("Problem reading");
		//	}
			
			FindFactorial findFac = new FindFactorial();
		//	System.out.println("Factorial " +  factInput + " is " + findFac.findFactorial(factInput) + " " );
			
			FindFibonachi finedFib = new FindFibonachi();
			//System.out.println(finedFib.findFibonachi(3));
			finedFib.findFibonachi(5);
		}
}
