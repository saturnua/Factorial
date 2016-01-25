import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int factInput = 0;
			System.out.print("Enter digit to find Factorial: ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			try{
				factInput = Integer.parseInt(in.readLine());
			}catch (IOException e){
				System.out.println("Problem reading");
		}
			FindFactorial findFac = new FindFactorial();
			System.out.println("Factorial " +  factInput + " is " + findFac.findFactorial(factInput) + " " );
			
			System.out.println("-----------------------------------------------------------------------------");
			
			System.out.print("First 15 digits of Fibonacci sequence: ");
			FindFibonachi finedFib = new FindFibonachi();
			for(int i = 1; i<=15; i++){
				System.out.print(finedFib.findFibonachi(i)+ " ");
			}
		}
}
