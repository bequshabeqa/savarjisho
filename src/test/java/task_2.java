public class task_2 {
    public void main(String[] args) {
        System.out.println(findLargest());
    }

    public int findLargest() {
        int ricxvi1 = 5;
        int ricxvi2 = 12;
        int ricxvi3 = 9;

        int largest = ricxvi1;

        if (ricxvi2 > largest) {
            largest = ricxvi2;
        }
        if (ricxvi3 > largest) {
            largest = ricxvi3;
        }

        return largest;
    }
}