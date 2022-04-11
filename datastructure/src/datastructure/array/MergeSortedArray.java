package datastructure.array;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {0, 3, 4, 31};
		int[] arr2 = {4, 6, 30, 55, 88};
		int[] mergedArr = null;
		if(arr1 != null && arr1.length>0 && (arr2 == null || arr2.length==0)) {
			mergedArr = arr1;
		} else if(arr2 != null && arr2.length>0 && (arr1 == null || arr1.length==0)) {
			mergedArr = arr2;
		} else if(arr1 != null && arr1.length>0 && arr2 != null && arr2.length>0) {
			mergedArr = new int[arr1.length+arr2.length];
			int arr1Item = arr1[0];
			boolean hasNextArr1 = true;
			int arr2Item = arr2[0];
			boolean hasNextArr2 = true;
			int i=0, j=0, k=0;
			
			while(hasNextArr1 || hasNextArr2) {
				if((arr1Item <= arr2Item) && hasNextArr1) {
					mergedArr[k]=arr1Item;				
					i++;
					if(i<arr1.length) {
						arr1Item = arr1[i];
					} else {
						hasNextArr1 = false;
						arr1Item=arr2Item;
					}
				} else {
					if(hasNextArr2) {
						mergedArr[k]=arr2Item;
						j++;
						if(j<arr2.length) {
							arr2Item = arr2[j];
						} else {
							hasNextArr2 = false;
							arr2Item = arr1Item;
						}
					}					
				}
				if(k<mergedArr.length-1) {
					k++;
				}				
			}			
		}
		
		for (int m : mergedArr) {
			System.out.println(m);
		}		
	}
}
