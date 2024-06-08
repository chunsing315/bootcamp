public class DemoNestedLoop {
    public static void main(String[] args){

 /*        System.out.println("i   j");
        for (int i = 0; i < 4; i++){ //
            for (int j = 0; j < 2; j++){
                if (i%2==1 && j%2==0){
                    System.out.println(i+"  "+j);
                }
            }
        }    
 */            
//approach 2： continue
        
       /*  for (int i = 0; i < 20; i++){ //
            if (i%2 == 0) {
                continue;
            }
            for (int j = 0; j < 4; j++){
                if (j%2 == 1) {
                    continue;
                }
                System.out.println(i+"  "+j);
                
            }
        }    
     */

     String s = "Vincent Book Game Laptop";
     // Find the first index of charater 'a'
     //14
     int idx = 0;
     for (int i = 0;i<s.length();i++){
         if (s.charAt(i)=='a') {
            idx = i;
             break;
            }
        }
    System.out.println(idx);

    // count p
    s = "pppjopdfadsjfpppdofjasdopfjdopppppp";
    int num = 0;
    for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) !='p'){
            continue;
        }
        num++;
    }
    System.out.println(num);

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
    

    // excercise have rectangle (triangle using starts)

        
    }

}

