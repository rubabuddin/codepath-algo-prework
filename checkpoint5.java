//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

public class Solution {
		
	public int longestConsecutive(final List<Integer> a) {
	
	Collections.sort(a);
	int sequence = 1;
	
	if(a.size() == 1)
	    return sequence;
	
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	for(int i =1; i<a.size(); i++){
	    if(a.get(i)-1 == a.get(i-1)){
	        sequence++;
	    } else if(a.get(i) == a.get(i-1)){
	        //do nothing
	    } else {
	        sequence = 1;
	    }
	    result.add(i-1, sequence);
	}
	    
	Collections.sort(result);
	return result.get(result.size()-1);
	    
	}
}

