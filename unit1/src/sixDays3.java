//Reese Wadsworth, P1
//12 static methods, cannot call one more than twice
//no print statements in main
//I feel dumb with how I just replaced 5 calls to make this correct

/* public class sixDays3 {
    public static void main(String[] args ){ //only 6 calls, can't call a singular method >2x
        day1();
        day2();
        day3();
        day4();
        day5();
        day6();
    }
    public static void day1(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me"); //one print statement per method
        gift1();

    }
    public static void day2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        gift2();

    }
    public static void day3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        gift3();

    }
    public static void day4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        gift4();

    }
    public static void day5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        gift5();

    }
    public static void day6(){
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
    public static void gift6(){
        System.out.println("six geese a-laying,");
        gift5();
    }

 */
// This doesn't fit the rubric for the amount of callbacks, but the other way doesn't fit either?
// I cannot comprehend how to do this using only 2 callbacks utilizing ONLY what we learned in class

//}

/*
On the 1st day of "Xmas", my true love sent to me
a partridge in a pear tree.
On the 2nd day of "Xmas", my true love sent to me
two turtle doves, and
a partridge in a pear tree.

On the 3rd day of "Xmas", my true love sent to me
three French hens,
two turtle doves, and
a partridge in a pear tree.
On the 4th day of "Xmas", my true love sent to me
four calling birds,
three French hens,
two turtle doves, and
a partridge in a pear tree.
On the 5th day of "Xmas", my true love sent to me
five golden rings,
four calling birds,
three French hens,
two turtle doves, and
a partridge in a pear tree.
On the 6th day of "Xmas", my true love sent to me
six geese a-laying,
five golden rings,
four calling birds,
three French hens,
two turtle doves, and
a partridge in a pear tree.
 */


//dumb trial
/*public class sixDays2 {
    public static void main(String[] args ){ //only 6 calls, can't call a singular method >2x
        day1();
        gift1();
        day2();
        gift2();
        gift1();
        day3();
        gift3();
        gift2();
        gift1();           //how is this supposed to work, I was like: "ooh I'll try instance", the re-remembered I
        day4();            // cannot do that.
        gift4();
        gift3();
        gift2();
        gift1();
        day5();
        gift5();
        gift4();
        gift3();
        gift2();
        gift1();
        day6();
        gift6();
        gift5();
        gift4();
        gift3();
        gift2();
        gift1();

    }
    public static void day1(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me"); //one print statement per method


    }
    public static void day2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");

    }
    public static void day3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");

    }
    public static void day4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");

    }
    public static void day5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");

    }
    public static void day6(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");

    }
    public static void gift1() {                                         //gift methods start here
        System.out.println("a partridge in a pear tree.\n");

    }
    public static void gift2() {
        System.out.println("two turtle doves, and");
    }
    public static void gift3() {
        System.out.println("three French hens,");
    }
    public static void gift4() {
        System.out.println("four calling birds,");
    }
    public static void gift5() {
        System.out.println("five golden rings,");
    }
    public static void gift6(){

        System.out.println("six geese a-laying,");
    }


}

class londonBurningRIPLizzie{
    public static void main(String[] args) {
        lonBurnFetchEngine();
        fire();
        lonBurnFetchEngine();

    }
    public static void lonBurnFetchEngine(){
        System.out.println("London's Burning, London's Burning, \nFetch the engines, Fetch the engines,\n");

    }
    public static void fire(){
        System.out.println("FIRE!, FIRE!,\nFIRE!, FIRE!, \n");

    }


}

*/

//original:

/*
public class sixDays {
    public static void main(String[] args ){ //only 6 calls, can't call a singular method >2x
        day1();
        day2();
        day3();
        day4();
        day5();
        day6();
    }
    public static void day1(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me"); //one print statement per method
        gift1();

    }
    public static void day2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        gift2();
        gift1();

    }
    public static void day3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        gift3();
        gift2();
        gift1();

    }
    public static void day4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        gift4();
        gift3();
        gift2();
        gift1();

    }
    public static void day5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        gift5();
        gift4();
        gift3();
        gift2();
        gift1();

    }
    public static void day6(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        gift6();
        gift5();
        gift4();                          //I literally cannot figure out another way only using SOUT and methods
        gift3();
        gift2();
        gift1();

    }
    public static void gift1() {                                         //gift methods start here
        System.out.println("a partridge in a pear tree.\n");

    }
    public static void gift2() {
        System.out.println("two turtle doves, and");
    }
    public static void gift3() {
        System.out.println("three French hens,");
    }
    public static void gift4() {
        System.out.println("four calling birds,");
    }
    public static void gift5() {
        System.out.println("five golden rings,");
    }
    public static void gift6(){

        System.out.println("six geese a-laying,");
    }
 */