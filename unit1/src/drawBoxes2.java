import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reese Wadsworth, P1
public class drawBoxes2 {
    public static void main(String[] args) {
        System.out.println("box draw start:");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("box draw end.");
    }
    public static void drawSides() { //My first in-class attempt used an escape sequence to only require
        System.out.println("|       |"); //the drawSides method to be called once for simplicity(see class below)
    }
    public static void drawTopBottom() {
        System.out.println("+-------+");
    }
    public static void drawBox() {
        drawTopBottom();
        drawSides();
        drawSides();
        drawTopBottom();
    }
}

/*
public class drawBoxes {
    public static void main(String[] args) {
        System.out.println("start:");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("end.");
    }
    public static void sides() {
        System.out.println("|       |\n|       |");
    }
    public static void topBot() {
        System.out.println("+-------+");
    }
    public static void drawBox() {
        topBot();
        sides();
        topBot();
    }
}

 */

