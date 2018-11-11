package cc.orz.solution.easy;

/**
 * @author hongweixu
 * @since 2018/11/11 23:28
 */
public class FindStrInStr {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";

        int index = find(haystack, needle);

        if (index == -1) {
            System.out.println(-1);
        } else {
            System.out.println(haystack.substring(index));
        }
        System.exit(0);
    }

    private static int find(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            int x = i;
            while (j < needle.length() && x < haystack.length()) {
                if (haystack.charAt(x) == needle.charAt(j)) {
                    x++;
                    j++;
                    if (j == needle.length()) {
                        return i;
                    }
                } else {
                    break;
                }
            }

        }
        return -1;
    }
}
