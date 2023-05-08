import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCounter = 1;
        while(scanner.hasNextLine()) {
            System.out.println(lineCounter++ + " " + scanner.nextLine());
        }
    }
}
