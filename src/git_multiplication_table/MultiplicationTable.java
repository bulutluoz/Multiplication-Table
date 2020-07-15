package git_multiplication_table;

public class MultiplicationTable {
	static int tableInput;
	
	public static void main(String[] args) {
		
	//Call to multipleTable method inside main method
        int tableInput = 8;
        printMultiplicationTable(tableInput);
    }
     
	
	// Create a method an integer as parameter
    public static void printMultiplicationTable(int multipleTable) {
       
     // We use nested loops for creating the MultiplicationTable table
        for(int i = 1 ;i<=multipleTable;i++) {
        	
            for(int j=1;j<=multipleTable;j++) {
                System.out.printf("%4d",i*j);
            }
			
            System.out.println();
        }
    }
}
