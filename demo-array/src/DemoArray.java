import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        //array object have to have length!
        double[] arr = new double[3]; //length -> 3
        arr[0] =1.1;
        arr[1] =2.0;
        arr[2] =-3.3;
        for (int i = 0;i<arr.length;i++)
        System.out.println(arr[i]);
        


        arr[2] =100;
        System.out.println(arr[2]);

        // Run - time exception
        //arr[3] = 200; //main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //Compile-time exception
        //array[2] = "Meowo"; //arr is an int array, stores int value

        int [] arr2 = new int[] {10,20,-3,4,5,6,7}; 
        String[] arr3 = new String[] {"hello","abc","ijk"}; 
        for (int i = 0; i<arr3.length;i++) {
            System.out.println(arr3[i]);
        }
        
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr2));
        
        System.out.println("The arrays are as below: ");
        int[] arr5 = new int[] {9,-3,-100,90,66,-4};
        for (int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }
        
        System.out.println();
        //finding max in an array;
        int max=Integer.MIN_VALUE;
        System.out.println("The min value of Int, we store it as the initial value of max: "+max);
        for (int i=0;i<arr5.length;i++){
            if (arr5[i]>max) {
                max = arr5[i];
            }    
        }
        System.out.println("Max num = "+max);
        System.out.println();
        
        //finding min in an array;
        int minum = Integer.MAX_VALUE;
        System.out.println("The max value of Int, we store it as the initial value of min: "+minum);
        for (int i=0;i<arr5.length;i++){
            if (arr5[i]<minum) {
                minum = arr5[i];
            }    
        }
        System.out.println("Min num = "+minum);

        //count char [] array. Count number of 'e'
        int counter = 0;
        char [] arr6 = new char[] {'l','e','e','r','q'};
        for (int i = 0; i<arr6.length;i++) {
            if (arr6[i]=='e'){
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr6));
        System.out.println("number of 'e' in the array: "+counter);
        
        //see if r exist
        Boolean checker = false;
        for (int i = 0; i<arr6.length;i++) {
            if (arr6[i]=='r'){
                checker = true;
                break;
            }
        }
        System.out.println("The char 'r' exists: "+checker);
        
        
        //string result to store the reverse char arr6 = new char[] {'l','e','e','r','q'};
        String reverse = "";
        for (int i = arr6.length-1; i>=0;i--) {
            reverse += arr6[i];
        }
        System.out.println("reverse the array as string: \""+reverse+"\"");

        //given 2 char [] , result as string
        String s1="";
        char [] c1= new char[] {'o','a','k','p'};
        char [] c2= new char[] {'a','b','f','t'};
        for (int i = 0;i<c1.length;i++){
            s1+=c1[i];            
        }
        for (int i = 0;i<c1.length;i++){
            s1+=c2[i];            
        }


        System.out.println(s1);
        //given 2 char [] , when even index get from c1, odd index get from c2

        String s2="";
        for (int i= 0; i<c1.length; i++){
            if (i%2 == 0) {
                s2 += c1[i];
            } else {
                s2 += c2[i];
            }
        }
        System.out.println(s2);

        
    }
}
