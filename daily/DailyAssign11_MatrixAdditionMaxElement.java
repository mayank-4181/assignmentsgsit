/*
 * Write a program to perform the matrix addition and print the maximum elements in the result matrix
 */

package dailyassignment;

public class DailyAssign11_MatrixAdditionMaxElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matrix1= {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
        int[][] matrix2= {{4,3,2,1},{8,7,6,5},{3,2,1,0}};
        
        int sum_matrix[][]=new int[3][4];
        
       
        
       int largest = 0;;
        
        for(int rows=0;rows<=matrix1.length-1;rows++) {
        	
        	for(int column=0;column<=matrix1[rows].length-1;column++) {
        		 sum_matrix[rows][column]=matrix1[rows][column]+matrix2[rows][column];
        	if(sum_matrix[rows][column]>largest) {
        		largest=sum_matrix[rows][column];
        	}
        	}	
        	
        }
        
        //Print sum_matrix
        
        for(int r=0;r<=sum_matrix.length-1;r++) {
        	for(int c=0;c<=sum_matrix[r].length-1;c++) {
        		System.out.print(sum_matrix[r][c] +  " ");
        	}
        	System.out.println();
        }
       
        System.out.println("Largest element is : " + largest);
        
	}

}
