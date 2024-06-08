public class DemoLoop2 {
    public static void main(String[] args) {
/*         for (int i = 0;;i++);{
            System.out.println("Hello World");
        } */

    /* 
       //label the loop using the : 
        outerLoop: for (int i = 1; i <=3; i++){
            for (int j = 1; j<=3; j++){
                if (i==2 && j==2) {
                    continue outerLoop;
                }
                System.out.println("i:" +i + ", j:"+j);
            }
        }

        int i = 0 ;
        // found it 
        for (i =0; i<10;i++){
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i); */

        int[] arr = {32,87,3,589,12,1076};
        int target = 12;

        int i = 0 ;
        boolean foundIt=false;

        for (i=0;i<arr.length;i++){
            if (arr [i] == target){
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("found "+target+" at index "+i);
        } else {
            System.out.println(target+" not found");

        }

    }    
}
