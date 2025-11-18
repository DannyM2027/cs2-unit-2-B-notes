public class Main {

   public static void main(String []args) {
     

      //WHILE  LOOPS REPEAT INSTRUCTIONS in the loop body as long condition is true

      // counter controlled while loop
      // step 1 initialize conrole varible


      int count = 6;
      // step 2, test condition
      while (count <= 7) {
         // loop body executes WHILE count <= 5 is true
         System.out.println(count);

         count++;
      }

      // FOR LOOPS: when u knpw how mant times to iterate
      // for (initialze; test condition; change;)
      
      for (int i = 5; i <= 27; i++  ) {
         System.out.println(i);
      }
      //modify change step to skip certain num
      for (int i = 0; i <=10; i+=2) {
          System.out.println(i);
        
      }
for (int i = 5; i > 0; i--) {
          System.out.println(i);
        
          if (i == 1) {
            System.out.println("BLAST OFFFF");
          }
      }
   










   }
}
