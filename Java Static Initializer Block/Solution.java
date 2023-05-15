import java.util.*;

public class Solution {

    static int breadth;
    static int height;
    static boolean flag = true;

    static {

        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();

        scanner.close();
        try {
            if (breadth <= 0 || height <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        if (flag){
            System.out.println(breadth * height);
        }
    }
}