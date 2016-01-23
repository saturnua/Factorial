
public class FindFactorial {
	int result = 1;
	
	public int findFactorial(int find){
		for(int i= 1; i<=find; i++){
			result = result * i;
		}
		
		return result;
	}
}
