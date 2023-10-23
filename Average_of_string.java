import java.util.Scanner;

public class Average_of_string {
    public static int aveString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += (int) ch;
        }
        return sum / str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String input = sc.next();
            int result = aveString(input);
            System.out.println(result);
        }

        sc.close();
    }
}
