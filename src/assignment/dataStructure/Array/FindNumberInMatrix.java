package assignment.dataStructure.Array;

public class FindNumberInMatrix {


	public static void main(String args[]) {
		FindNumberInMatrix findNumberInMatrix = new FindNumberInMatrix();
		findNumberInMatrix.findNumber();;

	}


	public void findNumber() {
		int ar[][] ={ { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 },
				{ 17, 18, 19, 20 }
		}; 
		int fr = 0,fc = 0,lc = 3,lr = 4;

		int count =0;
		int number =11;
		while(fr<=4){
			if(ar[fr][fc]== number) {
				System.out.println("Number found at "+(fr+1)+" and "+(fc+1));
			}else if(ar[fr][lc]==number){
				System.out.println("Number found at "+(fr+1)+" and "+(lc+1));
			}else if(number>ar[fr][fc] && number<ar[fr][lc]) {
				for(int i=fc+1;i<lc;i++) {
					if(ar[fr][i]==number) {
						count++;
						System.out.println("Number found at "+(fr+1)+" and "+(i+1));
						fr=5;
					}
				}
			}else if( number > ar[fr][lc]){
				fr++;
			}else {
				System.out.println("Number not found ");
			}
			
		}
		if(count==0) {
			System.out.println("Number not found in  "+(fr+1)+" row");
		}
	}
}
