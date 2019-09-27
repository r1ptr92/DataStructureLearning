package assignment.dataStructure.Array;

public class MatrixSpiralPrint {


	public static void main(String args[]) {
		MatrixSpiralPrint matrixSpiralPrint = new MatrixSpiralPrint();
		matrixSpiralPrint.printSpiral();;

	}



	public void printSpiral() {
		int ar[][] ={ { 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16, 17, 18 } }; 
		int fr= 0,fc=0,lr = 2,lc = 5;

		while(lr+1>fr && lc+1>fc){
			//Print the first row
			for(int i=fc;i<=lc;i++){
				System.out.println((ar[fr][i]));
			}
			fr++;

			//Print the last column 
			for(int i=fr;i<=lr;++i){
				System.out.println(ar[i][lc]);
			}
			lc--;
			if(fr<lr){
				//Print the last row
				for(int i=lc;i>=fc;--i){
					System.out.println(ar[lr][i]);
				}
				lr--;
			}
			if (fc<lc) { 
				 // Print the first column 
				for(int i=lr;i>=fr;--i){
					System.out.println(ar[i][fc]);
				}
				fc++;
			}
		}
	}
}
