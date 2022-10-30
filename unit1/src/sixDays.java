//Reese Wadsworth, P1
//12 static methods, cannot call >2x
//no sout in main
//I feel genuinely stupid with how I replaced 5 calls and fixed it

public class sixDays {
    public static void main(String[] args) { //only 6 calls, can't call a singular method >2x
        day1();
        day2();
        day3();
        day4();
        day5();
        day6();
    }

    public static void day1() {
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me"); //one print statement per method
        gift1();

    }

    public static void day2() {
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        gift2();

    }

    public static void day3() {
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        gift3();

    }

    public static void day4() {
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        gift4();

    }

    public static void day5() {
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        gift5();

    }

    public static void day6() {
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        gift6();

    }

    public static void gift1() {                                         //gift methods start here
        System.out.println("a partridge in a pear tree.\n");

    }

    public static void gift2() {
        System.out.println("two turtle doves, and");
        gift1();
    }

    public static void gift3() {
        System.out.println("three French hens,");
        gift2();
    }

    public static void gift4() {
        System.out.println("four calling birds,");
        gift3();
    }

    public static void gift5() {
        System.out.println("five golden rings,");
        gift4();
    }

    public static void gift6() {
        System.out.println("six geese a-laying,");
        gift5();
    }
}

