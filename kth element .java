import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {5, 2, 9, 1, 7};

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Arrays.sort(a);

        int n = a.length;

        if (k > 0 && k <= n) {
            System.out.println("Kth largest: " + a[n - k]);
        } else {
            System.out.println("Invalid k");
        }
    }
}
