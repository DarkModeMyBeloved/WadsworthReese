public class unit2test {
    public static void main(String[] args) {
        for(int i=1; i <=5;i+=1){
            System.out.println("hello tacoma");
        }

        for(int i=0; i < 4; i++){
            for(int j=0; j < 5; j++){
                System.out.println("*****");
            }
            System.out.println();
        }
        for(int i=1;i <=5; i++){
            for(int j = 1; j <= i; j++){      //this
                System.out.println(i);
            }
            System.out.println();
        }                                          //tester
        for(int i = 0; i< 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print("");
            }
            for(int k = 0; k<= i; k++){
                System.out.println("*");
            }
        }
    }


}
