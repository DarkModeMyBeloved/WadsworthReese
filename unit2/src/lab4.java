//Reese Wadsworth, p.1
//lab4: classConstants
public class lab4 {
    public static final int WIDTH = 20;
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        drawSplat();
        drawDollar();
        drawHash();
    }

    public static void drawSplat() {
        for (int a = 1; a <= HEIGHT; a++) {
            for (int b = 1; b <= WIDTH; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawDollar() {
        System.out.println();
        for (int a = 1; a <= HEIGHT; a++) {
            for (int b = 1; b <= WIDTH; b++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void drawHash() {
        System.out.println();
        for (int a = 1; a <= HEIGHT; a++) {
            for (int b = 1; b <= WIDTH; b++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


}
