import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] count = new int[256]; 

      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        System.out.println("Duplicate characters:");

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count[ch] > 1) {
                System.out.println(ch + " appears " + count[ch] + " times");
                count[ch] = 0; 
            }
        }

        sc.close();
    }
}
