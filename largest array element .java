 public class Main {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 7};

        int max = a[0];

        for (int x : a) {
            if (x > max) max = x;
        }

        System.out.println(max);
    }
}
