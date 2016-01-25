
public class FindFibonachi {

	public int findFibonachi(int find){
		int result = 0;
		if(find == 0){
			return 0;
		} else if (find == 1){
			return 1;
		} else {
			return findFibonachi(find-2)+ findFibonachi(find-1);	
		}		 
	}
}
