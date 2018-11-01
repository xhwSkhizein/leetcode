package cc.orz.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongweixu
 * @since 2018/10/29 02:33
 */
public class TwoSum {
    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     * <p>
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static int[] twoSum(int[] nums, int target) {
        // key 是 currentItem与目标值的差，存入map，val为目标值
        // 找到val不为空的元素停止
        // 复杂度O(n)
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int key = target - num;
            Integer val = indexMap.get(key);
            if (val != null) {
                return new int[]{val, i};
            }

            indexMap.put(num, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        assert twoSum(nums, target) == new int[]{0, 1};

        System.out.println("Success");
        System.exit(0);
    }
}
