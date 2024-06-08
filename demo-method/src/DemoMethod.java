public class DemoMethod {
    public static void main(String[] args){
        // ^^ this is a method. like procedure in Pascal
        // Calling a method.
        System.out.println("result: "+sum(11.999,2)); //cal method
        System.out.println("result: "+sum(11.999,2,123)); //cal method
        System.out.println("lastchar: "+lastChar("Leveraged Buyout")); //cal method
        System.out.println("toString: "+toString(new char[] {'a','b','c'})); //cal method
        String s1 = "Hello Kitty";
        String s2 = "Hello";
        System.out.println("substring: "+isSubstring(new String("Hello Kitty"),new String("Kitty"))); //cal method
        System.out.println(max (new int[] {4,10,7}));
        System.out.println("circle area: "+circleArea(100));

   /*      int a = 0;
            while (a < 3) {
            switch (a) {
                case 0:
                    System.out.print ("0");
                case 2:
                    System.out.print ("2");
            a++;
            }
        } */
    }

    public static int max(int[] arr1) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr1.length;i++)  {
            if (arr1[i]>max) {
                max = arr1[i];
            }
        }
        return max;
    }
        


    public static int sum(double x, int y){
        //method content should contain "return"
        return (int) x+y;
    }
    
    public static double sum(double x, int y, int z){
        //method content should contain "return"
        return (double) x+y+z;
    }

    public static char lastChar(String x){
        return x.charAt(x.length()-1); //beware of the case
    }

    public static String toString(char[] arr){
        String s1 = "";
        for (int i=0; i<arr.length;i++){
            s1+=arr[i];
        }
        return String.valueOf(arr);
    }

    public static boolean isSubstring(String str,String substr){
        //check if substr is a substring of str
        //return str.contains(substr);   stupid method
        return str.indexOf(substr) != -1;
        /* boolean x = false;
        for (int i=0; i <str.length();i++){

            for (int j=0;j<substr.length();j++){
                if(str.charAt(i+j) != substr.charAt(j)) {
                    break;
                };
                if (j==str.length()-1)
            }
        }
        return  */
        
    }

    // find pi
    public static double circleArea(int radius){
        return Math.PI*radius*Math.pow(radius, 2);
    }

}
