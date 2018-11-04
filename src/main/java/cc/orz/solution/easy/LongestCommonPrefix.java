package cc.orz.solution.easy;

/**
 * @author hongweixu
 * @since 2018/11/2 00:51
 */
public class LongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * <p>
     * 示例 1:
     * <p>
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     * <p>
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     * <p>
     * 所有输入只包含小写字母 a-z
     *
     * @param strs 输入
     * @return 最长公共前缀
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int moveIndex = 0;
        do {
            String val = null;
            String preVal = null;
            for (int i = 0; i < strs.length; i++) {
                val = getCharAsStringByIndex(strs[i], moveIndex);
                if (val == null) {
                    return result.toString();
                }
                if (i == 0) {
                    preVal = val;
                    continue;
                }
                if (!val.equals(preVal)) {
                    return result.toString();
                }
            }
            result.append(val);
            moveIndex++;
        } while (true);
    }

    private static String getCharAsStringByIndex(String str, int index) {
        if (str == null || str.length() == 0 || str.length() <= index) {
            return null;
        }
        return String.valueOf(str.charAt(index));
    }

    public static void main(String[] args) {
        String[] input = {"dog", "door", "doing"};

        assert "do".equals(longestCommonPrefix(input));

        System.out.println("Success");
        System.exit(0);
    }

}
