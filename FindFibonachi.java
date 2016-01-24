
public class FindFibonachi {

	public int findFibonachi(int find){
		int result = 0;
		if(find == 0){
			//System.out.println ("0");
			result = 0;
			return 0;
		} else if (find == 1){
			//System.out.println ("1");
			result = 1;
			return 1;
		} 
			
		result = (findFibonachi(find-2)+ findFibonachi(find-1));
		System.out.println(result) ;
		return result;
		
	}
}
