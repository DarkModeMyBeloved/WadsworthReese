//Reese Wadsworth, p.1
//nestledForLoops lab
public class lab3 {
    public static void main(String[] args) {
        drawSplats();
        drawAmpersands();
        fiveToOne();

    }

    public static void drawSplats() {               //5x5
        for (int a = 0; a < 1; a++) {
            for (int b = 0; b < 5; b++) {
                System.out.println("*****");
            }
            System.out.println();
        }
    }

    public static void drawAmpersands() {           //3x10
        for (int c = 0; c < 1; c = c + 1) {
            for (int d = 0; d <= 2; d = d + 1) {
                System.out.println("&&&&&&&&&&");
            }
            System.out.println();
        }
    }

    public static void fiveToOne() {           //I don't like this one
        for(int e = 5; e >= 1; e--) {
            for(int f = 1; f <= e; f++){
                System.out.print(e);
            }
            System.out.println();
        }
    }

}
