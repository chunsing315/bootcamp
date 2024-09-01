public class DemoCharSequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.length());
        System.out.println(s.replace("c","a"));
        String s3 = s;  //type-safe, anytime can put in String

        CharSequence cs = "abc";
        System.out.println(cs.length());
        
        System.out.println(cs.charAt(1));

        //if (cs instanceof String){
            StringBuilder sb1 = new StringBuilder(cs);
            String str2 = sb1.toString();
            System.out.println("cs is instance of String");
            System.out.println(str2);
            System.out.println(sb1.reverse());
        //};
        //some of the method in String object is hidden by "cs"

        CharSequence cs3=new StringBuilder("hello");
        System.out.println(cs3.length());
        System.out.println(cs3.charAt(1));
        System.out.println(cs3);

        //StringBuilder sb2 = (StringBuilder) cs; //run-time error, cs refer to String object




    }  
}
