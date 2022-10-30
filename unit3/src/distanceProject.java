//Reese Wadsworth, P.1
//distance project
public class distanceProject {
    public static final double x1 = 16; //Tacoma ++
    public static final double y1 = 10;
    public static final double x2 = 4; //Gig ++
    public static final double y2 = 28;
    public static final double x5 = 23; //Bonney Lake ++
    public static final double y5 = 10;
    public static double d1;
    public static double d2;
    public static double d3;
    public static double d4;

    public static void main(String[] args) {
        distance(d1, d2);
        trip(d3, d4);
    }

    public static void distance(double d1, double d2) { //Tac--> Gig
        d1 = Math.pow(x2 - x1, 2);
        d2 = Math.pow(y2 - y1, 2);
        double sub1 = d1 + d2;
        double tacGig = Math.sqrt(sub1);
        System.out.println(tacGig);
        //return tacGig;
    }
    public static double trip(double d3, double d4){ //Tac-->Gig-->Bonney Lake;_____gig(2): (4, 28)--> BL(5): (23, 10)
        d3 = Math.pow(x5 - x2, 2);
        d4 = Math.pow(y5 - y2, 2);
        double sub2 = d3 + d4;
        double gigBl = Math.sqrt(sub2);
        double tripDistance = distance(d1, d2); // + gigBl;
        System.out.println(tripDistance);
        return tripDistance;
    }
    public static void roundTrip(double d5, double d6){ //Bonney Lake --> Tac


    }

}
