//Print concentric rectangular pattern in a 2d matrix. 

public class Solution {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int val = a;
        //base case
        if (a <= 0) {
            return result;
        }
	
        int bounds = (a*2)-1;
        int[][] ans = new int[bounds][bounds];
	    
        for(int i=0; i<val; i++){
            if(i==val-1){
                ans[i][i] = a;
            } else {
                for(int j=i; j<bounds-1-i; j++){
                    ans[i][j] = a;
                    ans[bounds-1-i][bounds-1-j] = a;
                    ans[j][bounds-1-i] = a;
                    ans[bounds-1-j][i] = a;
                }
            }
            a--;
        }
	  
        for (int i=0; i<bounds; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j=0; j<bounds; j++) {
                temp.add(ans[i][j]);
            }
            result.add(temp);
        }
	
	return result;  
	}
}
