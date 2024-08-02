import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int l, int r) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=l; i<=r; i++){

        	String s = Integer.toString(i);
        	
        	for(int j=0; j<s.length(); j++) {
        
        		if(s.charAt(j) != '5' && s.charAt(j) != '0') {
        			break;
        		}else if(j==s.length()-1 && (s.charAt(j) == '5' || s.charAt(j) == '0')) {
        			set.add(i);
        		}
        	}
            
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        if(set.size() >= 1){
            return answer;
        }else{
            set.add(-1);
            answer = set.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
            return answer;
        }
    
    }
}