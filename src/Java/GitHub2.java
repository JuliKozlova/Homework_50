package Java;

public class GitHub2 {
    public static void main(String[] args) {
        double m = 5.7;
        double n = 16.8;
        int a = 10;
        double b = Math.abs(a-m);
        double c = Math.abs(a-n);
        if (b > c) {
            System.out.println(m + " is farther from 10 than " + n);
        } else if (c > b) {
            System.out.println(n + " is farther from 10 than " + m);
        } else {
            System.out.println(n + " and " + m +" are equidistant from 10");
        }
    }
}
