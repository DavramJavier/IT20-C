package multidimensionalarray;

/**
 *
 * @author kentr
 */
public class MultidimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numbers = {
            
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++){
                 System.out.println(numbers[i][j] + " ");
             }
             System.out.println();
             }
               
         }
    
}
