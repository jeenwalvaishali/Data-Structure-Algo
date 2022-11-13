public class Question5 {

    public static int firstIndex(int[] nums, int num) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if ((nums[mid] == num) && ((mid == 0) || (nums[mid - 1] < num))) {
                return mid;

            } else if (num <= nums[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

