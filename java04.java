public class java04 { 
    public static void main(String[] args) { 
        for(int i =1; i <=3 ;i ++ ) {
         
            for (int j =1; j <=3-i;j ++) { 
                System.out.print(" ");
            }
            for(int z=1; z <=i ; z++) { 
                System.out.print("* ");
            }
            System.out.println();
           }
    
           for(int i = 0; i<2; i ++) { 
            for(int j =0; j <=i; j ++) { 
                System.out.print(" ");
            }
            for(int z =0; z<2 -i; z++) { 
                System.out.print("* ");
            }
            System.out.println();
           }
        }
    }
    