import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String s = String.valueOf(n);

        if(Integer.parseInt(s) == n){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }

    }
}