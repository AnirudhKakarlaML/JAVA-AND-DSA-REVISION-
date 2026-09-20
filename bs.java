public class bs {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                break;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
    }
}