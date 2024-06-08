import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class DemoString {
    public static void main(String[] args){
        String x = "hello😄"; // String not primitive, Capitalized
        System.out.println(x);

        double price = 9.99;
        String item = "Book";
        String description = "The " + item +" costs $" + price;
        System.out.println(description);
        
        char a = 'a';
        String message = "The answer is " +a;
        System.out.println(message);

        // String Method (Tool)

        // Method1: length
        String t ="hello";
        
        if (t.length()>=4) {
            System.out.println("Yes,  the length of t = " + t.length()); //
        } else { 
            System.out.println("No, length t < 4");
        }

        
        // Method 2: equals
        String s1 = "hello";
        String s2 = "hello";
        if (!s1.equals(s2)) {  //if s1 == s2 does not work here. Java has different concerns. ! equals "Not"
            System.out.println("not equal");
        } else {
            System.out.println("eual");
        }
        
        if ((s1.length()>=6) || (s1.equals(s2))) {
            System.out.println("condition is true that s1 has more characters than 5, or s1 equals s2");            
        }
        
    
        //Method 3: charAt (int index), e.g.: charAt(0)
        String s3 = "world";
        int i = 0;
        while (i<5) {
            System.out.println("The number "+i+" character of s3 = "+ s3.charAt(i));
            i++;
        }    
            System.out.println("The 1st character of s3 = "+ s3.charAt(0)); //0 means the first index
            System.out.println("The last character of s3 = "+ s3.charAt(s3.length()-1)); //0 means the first index

        String x2 = "Hello World";
        if ((x2.charAt(x2.length()-1) == 'd') && (x2.length()>5) ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //Method 4 : substring(int begin index, int endIndex)
        String result = x2.substring(0,0);
        System.out.println(result);

        //check if the first 3 char is "wel"
        String x3 = "welcome";
        String x4 = "wel";
        System.out.println(x3.substring(0,3));
        if (x3.substring(0,3).equals("wel")) {
            System.out.println("yes substring");
        }
        if ((x3.charAt(0) == 'w') && (x3.charAt(1) == 'e') && (x3.charAt(2) == 'l'))  {
            System.out.println("yes charAt");
        }

        //chain method
        System.out.println(x3.substring(0,3).length());
        System.out.println(x3.substring(0,3).charAt(0));

        // isEmpty =/= blank
        String x7 = "apple";
        System.out.println(x7.isEmpty());

        String x8 = "whats";
        System.out.println(x8.isEmpty());
        System.out.println(x7.compareTo(x8));

        String x9 = "";
        System.out.println(x9.isBlank());
        x9 = " ";
        System.out.println(x9.isEmpty());
        System.out.println(x9.isBlank()); //ignore white space only

        System.out.println(x7.substring(0,1));
        System.out.println(x7.toUpperCase());
        System.out.println(x7.replace("pp","fxhohjljh"));
        System.out.println(x8.contains("ats"));
        System.out.println(x8.startsWith("wh"));
        System.out.println(x8.startsWith("Mr. "));
        System.out.println(x8.endsWith("s"));
        System.out.println("       !       ab c    ".trim());
//ex.
        String [] strings = new String[] {"hello","abcijk","Vincent","HeLLo","    HELLO"};
        //How many string contains the pattern of "ELL"
        int counter = 0;
        for (int i1 = 0; i1 < strings.length;i1++) {
            if (strings[i1].toLowerCase().contains("ell")){
                counter++;
            }
        }
        System.out.println(counter);
        
        for (int i1 = 0; i1 < strings.length;i1++) {
            if (strings[i1].trim().equalsIgnoreCase("hello")){
                System.out.println(strings[i1]);
            }
        }

        //index of

        String s13 = "helloll";
        System.out.println((s13.indexOf("ll")));
        System.out.println((s13.indexOf("e")));
        System.out.println((s13.indexOf("l")));//first 'l'
        System.out.println((s13.indexOf("L")));//can't find
        System.out.println((s13.indexOf("ll",4)));//from index 4, count from top
        System.out.println((s13.indexOf("ll",6)));//-1
        System.out.println((s13.lastIndexOf("ll",6)));//5

        System.out.println((s13.indexOf(101)));//1
        char c1 = 101;
        System.out.println((char)101);
        
        String s14= "abc";
        //for (double i2 = 0; i2<1000000;i2++){
            s14 += "def";
        //}
        System.out.println(s14);
        
        String s15 = "abc";
        //for (double i2 = 0; i2<1000000;i2++){
            s15 = s15.concat("def"); //better performance
        //}
        System.out.println(s15);

        String s16 = "abc";
        String s17 = "abc";
        String s18 = "abc";
        String s19 = "abc";
        System.out.println(s16.compareTo(s17));
        System.out.println(s16.equals(s17));
        System.out.println(s16 == s17);

        


        
    }
}
