import java.util.Scanner;

public class SearchLyricsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        var str = sc.next();

        System.out.print("Enter the latter: ");
        var latter = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == latter) {
                count++;
            }
        }
        System.out.println("In the word " + str.toUpperCase() + " the letter " + latter + " appears " + count + " times.");
    }
}
