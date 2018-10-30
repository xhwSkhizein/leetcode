package cc.orz.solution.easy;

/**
 * @author hongweixu
 * @since 2018/10/29 02:38
 */
public class PalindromeNum {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 121 输出: true 示例 2:
     * <p>
     * 输入: -121 输出: false
     * <p>
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。 示例 3:
     * <p>
     * 输入: 10 输出: false 解释: 从右向左读, 为 01 。因此它不是一个回文数。 进阶:
     * <p>
     * 你能不将整数转为字符串来解决这个问题吗？
     */
    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseX = 0;
        int tmp = x;
        while (tmp != 0) {
            int last = tmp % 10;
            reverseX = reverseX * 10 + last;

            tmp = tmp / 10;
        }

        return reverseX == x;
    }

    public static void main(String[] args) {

        PalindromeNum solution = new PalindromeNum();

        assert !solution.isPalindrome(10);
        assert solution.isPalindrome(101);
        assert solution.isPalindrome(1);

        System.out.println("Success !");

        System.exit(0);
    }
}
