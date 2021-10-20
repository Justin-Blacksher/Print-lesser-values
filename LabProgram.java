import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

    
      /* ==================== My solution goes here =================== */
      // Variables
      int lastInteger;
      int i;
      int firstInteger;
      
      /* ==================== Get Input =============================== */
      firstInteger = scnr.nextInt();
      for (i = 0; i <= firstInteger - 1; i++){
         userValues[i] = scnr.nextInt();
         
         }
      lastInteger = scnr.nextInt();
      
      /* ==================== Display Results ======================== */
      
      for (i = 0; i <= firstInteger - 1; i++){
         if ( userValues[i] < lastInteger ){
            System.out.print(userValues[i] + ",");
            }
         else{
            continue;
            }
         }
      System.out.println("");
   }
}
