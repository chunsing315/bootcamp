public class JavaQuest_Fibonacci {
    public static void main(String[] args){

       
       // fibonacci
           int oldnum = 0;
           int newnum = 1;
           int finum = 0;
           for (int i=0; i<16; i++){
               finum = oldnum + newnum;
               oldnum = newnum;
               newnum = finum;
               System.out.println(finum);
           }
           
               
           }
       
       }
       
       

