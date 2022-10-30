import java.util.*;

public class relationalExpressions {
    public static void main(String[] args){
        System.out.println(5>3);
        System.out.println(5<3);
        System.out.println(5==3);
        System.out.println(5 != 3);

        Scanner console = new Scanner(System.in);
        System.out.println("input a word - ");
        String word = console.next();

        if(word.length() <= 4){
            System.out.println("short word");
        }else if(word.length() > 10){
            System.out.println("long word");
        }else{
            System.out.println("mid word");
        }

        System.out.println("input grade - ");
        double grade = console.nextDouble();

        if (grade >= 90){
            System.out.println("A");
        }else if(grade >= 80){
            System.out.println("B");
        }else if(grade >= 70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
    public static void serve(){
        int x = 42;
        int y = 17;
        int z = 25;

        System.out.println((y < x) && (y <= z));
        System.out.println(((x % 2) == (y & 2)) || (x % 2) == (z % 2));
        System.out.println((x <= (y + z)) && (x <= (y + z)));

        int sum = 0;
        for (int i = 1; i<= 100000; i++){
            sum += i;
        }
        System.out.println(sum);

        //System.out.println(whatIsIt(num = -3));
    }
    public static String whatIsIt(int num){
        if(num > 0){
            return "positive";
        }else if (num < 0){
            return "negative";
        }else{
            return "zero";
        }
    }
}
