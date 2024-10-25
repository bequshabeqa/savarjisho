public class Main {
    public static int findLargest(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(5, 12, 9));  // Output: 12
    }
}