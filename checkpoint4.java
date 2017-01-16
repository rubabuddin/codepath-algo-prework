//Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 

public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {

    int nextGreatest;
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    for(int i = 0; i < a.size(); i++){
        nextGreatest = -1;
        for(int j = i+1; j<a.size(); j++){
            if(a.get(i) < a.get(j))
            {
                nextGreatest = a.get(j);
                break;
            }
        }
        result.add(i, nextGreatest);
    }
    
    return result;
	}
}
