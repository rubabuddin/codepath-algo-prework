//Find the kth smallest element in an unsorted array of non-negative integers.

public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	
	    int kthsmallest = 0;
	    int size = a.size();
	    
	    if(size == 1)
	        return a.get(0);
	    
	    List<Integer> copy = new ArrayList<Integer>();
	    copy = a;
	    Collections.sort(copy);
	   
	    
	    for(int i = 0; i<size; i++){
	        if(i == k-1)
	            kthsmallest = copy.get(i);
	    }
	    
        return kthsmallest;	    
	}
}

//Given an array of non negative integers A, and a range (B, C), find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

public class Solution {
	public int numRange(ArrayList<Integer> a, int b, int c) {
	
	int occurrences = 0;

    for(int i=0; i < a.size(); i++){
        int sum = 0;
        for(int j=i; j<a.size(); j++){
            sum = sum + a.get(j);
            if(sum > c)
                break;
            else if(sum >= b && sum <= c)
                occurrences++;
            else
                continue;
        }
    }
    return occurrences;
	}
}
