public class DemoOperator {
    public static void main(String[] args){
        /*   
        int x = 3;
        x = x +1  ; // x = x +1
        System.out.println("x=" + x); // string plus anything becomes string?
        x ++  ; // x = x +1
        System.out.println("x=" + x);
        x +=1  ; // x = x + something...
        System.out.println("x=" + x);
        ++x ; 
        System.out.println("x=" + x);
        
        int y = 4;
        y = y-1;
        y--;
        --y;
        y -= 1;
        
        System.out.println("y=" + y);
        
        int p = 4;
        p = p*2;
        p *= 2;
        p /= 4;
        
        System.out.println("p=" + p);


        int z = 10;
        z = z%3; //1
        int j = 10;
        j %= 3;
        System.out.println("z=" + z + ", j=" +j);

        String s = "hello";
        s += "!!!";
        System.out.println("s= "+s);
         */
        int x = 3;
        ++x  ; // x = x +1
        System.out.println("x=" + x); // string plus anything becomes string?
        boolean r1= 10>3;
        boolean r2= 4>10;
        boolean r3= 10>=10;
        boolean r4= -9<=9;
        System.out.println("r1=" + r1); 
        System.out.println("r2=" + r2); 
        System.out.println("r3=" + r3); 
        System.out.println("r4=" + r4);
        
        // and (&&) or (||)
        boolean r5= 10 > 3 && 20 >= 20; // true AND true => True ;
        System.out.println("r5=" + r5);
        boolean r6= 10 > 3 && 20 > 20; // true AND false => false ;
        System.out.println("r6=" + r6);
        
        boolean r7= 10 > 3 || 20 >= 20; // true OR true => True ;
        System.out.println("r7=" + r7);
        boolean r8= 10 > 3 || 20 > 20; // true or false => True ;
        System.out.println("r8=" + r8);
        boolean r9= 10 < 3 || 20 > 20; // false or false => false ;
        System.out.println("r9=" + r9);
        
        char c10 = 'a';
        char c11 = 'b';
        boolean r10 = c10 != c11; //= is assign; == is conditional; != is not equal. char is comparable by ASCII no.
        System.out.println("r10=" + r10);

        int r12 = 122-91 ; //' '= 32; A=65, Z=90; a=91 , z=122,
        System.out.println(r12);

    }
}
