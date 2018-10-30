package cc.orz.solution.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
    public int reverse(int x) {
        // FIXME
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, 10).forEach(list::add);
        list.forEach(System.out::println);

        return 0;
    }

    public static void main(String[] args) {

        new ReverseInt().reverse(10);

        System.exit(0);
    }
}
