public class DemoLoop {
    public static void main(String[] args){
    /*     int x = 3;
        for (int i =1 ;i<16;i++){  // initialization ; continue crtieria; increamental operation
            System.out.println(i+1+ ": ");
            x *= 3;
            System.out.println(x);
     */    
/*     
     int y = 3;
     for (int i=0; i<3; i++){
        y*=3;
     }
    System.out.println(y);
    

    for (int i=0; i<8;i++){
        if (i%2==0){
            System.out.println(i);  
        }
    }

    // 1+2+...+10
    int sum = 0;
    for (int i=0;i<11;i++){
        sum += i;
    }
    System.out.println("sum of all integer from 1-10:"+sum);

    // 2+4+...+8
    sum = 0;
    for (int i=0;i<9;i++){
        if (i%2 == 0 ) {
            sum += i;
        }
    }
    System.out.println("sum of all even integer from 1-8:"+sum);
    
    
     */
    // 8, 6,4,2
   /*  for (int i=8;i>0;i-=2){
        if (i%2 == 0 ) {
            System.out.println(i);
        }
    } */
    //exit loop

    /* for (int i=0 ; i <10;i++) {
        if (i>7) {
            break;
        }
        System.out.println(i);
    } */
    int total =0;
    for (int i =0; i<5; i++){
        if (i>3){
            continue; //when i = 4, skip loop logic, goes to "i++"
        }
        total += i;
    }
    System.out.println(total);





    }
}


