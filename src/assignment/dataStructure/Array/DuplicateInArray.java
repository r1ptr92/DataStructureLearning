package assignment.dataStructure.Array;

public class DuplicateInArray {


	public static void main(String args[]) {
		DuplicateInArray duplicateInArray = new DuplicateInArray();
		duplicateInArray.findDulicate();;

	}

	public void findDulicate() {

		int a[] = {1,2,2,2,2,4,5,7,8,8};
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
