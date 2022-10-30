//Reese Wadsworth, P.1
//change size of output by changing only one value--> most likely class constant + no print in main + no rep.
public class rocketShip {
    public static final int SIZE = 3; //given value--> independent value
    public static void main(String[] args){ //starting comp.: have output of 3
        nose();                             //START ALL FOR LOOPS WITH (1,2) VALUES
        separator();
        upperBody(); //it took so long for me to understand that I needed to split upper and lower
        lowerBody();
        separator();
        lowerBody(); // i++ --> a(x-h)^2+k or +x
        upperBody();// i-- --> -a(x-h)^2+k or -x
        separator();
        nose();
    }

    public static void separator(){ // used 3x between all parts of body, x = 14
        System.out.print("+");
        for (int i = 1; i <= SIZE * 2; i++){ //changed from 4 to 2 --> use 1 and 2 for all initial for loop values
            System.out.print("=*");
        }
        System.out.println("+"); //moved from (line 21)
    }

    public static void upperBody(){ //used 2x, diamond configuration, 6x14
        for (int i = 1; i <= SIZE; i++){
            System.out.print("|");
            for (int j = 1; j <= 2; j++){ //changed: j--, j+
                for(int p = 1; p <= SIZE - i; p++){
                    System.out.print(".");
                }
                for (int s = 1; s <= i; s++){
                    System.out.print("/\\"); //changed from "/\\/"
                }
                for(int p = 1; p <= SIZE - i; p++) { //used twice, literally cannot figure out how to get rid of
                    System.out.print(".");
                }
            }
            System.out.println("|"); //ONLY use ln as last ind. print statement
        }
    }

    public static void lowerBody(){ //used 2x, hourglass looking, 6x14
        for(int i = SIZE; i >= 1; i--) { // changed from i++ to i-- ?? OH MY GOD, IT'S RECIPROCAL upperBody
            System.out.print("|");
            for (int j = 1; j <= 2; j++) {
                for (int p = 1; p <= SIZE - i; p++) { //inequality flipped(oh, they're all the same)
                    System.out.print(".");
                }
                for (int s = 1; s <= i; s++) {
                    System.out.print("\\/"); //changed from "/\\/"
                }
                for (int p = 1; p <= SIZE - i; p++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

    public static void nose(){ //used 2x--> top and bottom, 5x12--> took like 4x longer than the rest
        for(int i = 1; i <= (SIZE * 2 - 1); i++){ // added () and multiplied instead
            System.out.print(" "); //from println to print
            for(int b = 1; b <= (SIZE * 2 - 1) - i; b++){
                System.out.print(" ");
            }
            for(int s = 1; s <= i; s++){
                System.out.print("/");
            }
            System.out.print("**");
            for(int ss = 1; ss <= i; ss++){
                System.out.print("\\"); //escape sequence, not doubled(72) <--biggest miss
            }
            System.out.println(" "); //compiler error: set after star backslash + doubled
        }
    }
}
