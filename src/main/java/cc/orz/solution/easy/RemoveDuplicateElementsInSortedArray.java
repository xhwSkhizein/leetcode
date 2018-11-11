package cc.orz.solution.easy;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author hongweixu
 * @since 2018/11/11 22:33
 */
public class RemoveDuplicateElementsInSortedArray {

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 2, 2, 3, 3, 4};

        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }


        System.exit(0);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                continue;
            }
            i++;
            nums[i] = nums[j];
        }

        return i + 1;
    }

    private static int removeDuplicatesStupid(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = nums.length - 1;
        int i = 0;
        while (i <= result) {
            int j = i + 1;
            while (j <= result) {
                if (nums[i] == nums[j]) {
                    swapToLast(j, result, nums);
                    result--;
                } else {
                    j++;
                }
            }
            i++;

        }
        return result + 1;

    }

    private static void swapToLast(int i, int j, int[] nums) {
        while ((i + 1) <= j) {
            swap(i, i + 1, nums);
            i = i + 1;
        }
    }

    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
