package datastructure.hashmap;

import java.util.HashSet;

public class FirstRecurringCharacter {
	
	public static void main(String[] args) {
		
		int[] input = {2, 5, 1,2, 3, 5, 1, 2, 4};
		
		System.out.println(findRecurringCharacter(input));
		
		
	}
	
	private static Integer findRecurringCharacter(int[] input) {
		if(input != null && input.length>0) {			
			HashSet<Integer> lookups = new HashSet<Integer>();			
			for(int num: input) {
				if(lookups.contains(num)) {
					return num;
				} else {
					lookups.add(num);
				}
			}
		}
		return null;
	}

}
