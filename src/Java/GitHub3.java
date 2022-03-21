package Java;

public class GitHub3 {
    public static void main(String[] args) {
        int c = 100;
        int b = 899;

        int random_number = c + (int) (Math.random() * b);
        System.out.println(random_number);

        int first = random_number/ 100;
        int secondBegin = random_number/ 10;
        int second = secondBegin % 10;
        int third = random_number% 10;
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }

    }


}
