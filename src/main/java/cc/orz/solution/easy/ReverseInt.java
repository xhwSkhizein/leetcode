package cc.orz.solution.easy;

/**
 * @author hongweixu
 * @since 2018/10/29 02:37
 */
public class ReverseInt {
    /**
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 123
     * 输出: 321
     * 示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     * 注意:
     * <p>
     * 假设我们的环境只能存储 32 位?有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
     */

    private final static int MAX_D_10 = Integer.MAX_VALUE / 10;
    private final static int MIN_D_10 = Integer.MIN_VALUE / 10;

    public int reverse(int x) {
        // abc
        // pop() -> [c] push(c)
        // pop() -> [b] push(b)
        // pop() -> [a] push(a)
        int result = 0;
        while(x != 0){
            int val = pop(x);
            result = push(result, val);
            x /= 10;
        }
        return result;
    }

    private int pop(int x){
        return x % 10;
    }

    private int push(int result, int val){
        // check range
        int x = val / 10;
        if(result > (MAX_D_10 - x)){
            return 0;
        }
        if(result < (MIN_D_10 - x)){
            return 0;
        }

        return result * 10 + val;
    }
    public static void main(String[] args) {

        assert 1 == new ReverseInt().reverse(10);
        assert 121 == new ReverseInt().reverse(121);
        assert 1 == new ReverseInt().reverse(100);
        assert 456789 == new ReverseInt().reverse(987654);

        System.out.println("Success");
        System.exit(0);
    }
}
