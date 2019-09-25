package assignment.dataStructure.Array;

public class DuplicateInArray {


	public static void main(String args[]) {
		DuplicateInArray duplicateInArray = new DuplicateInArray();
		int a[] = {1,2,3,4,5,6,6,8,9,3,6,2,7,9,2};
		duplicateInArray.findDulicate(a);;

	}

	public void findDulicate(int a[]) {

		int arr_size = a.length; 
		int r = arr_size-1;
		int l = 0; 
		int count = 0;

		while (l<arr_size-1) {

			if(a[l]==a[r]) {
				int temp = a[l+1];
				a[l+1] = a[r];
				a[r] = temp;
				l++;
				r = arr_size-1;
				count++;
			}else if(r>l){
				r--;
			}
			if(l== r) {
				if(count>0) {
					System.out.println(a[l]);
				}
				count = 0 ;
				r = arr_size-1;
				l++;
			}
		}
	}
}
