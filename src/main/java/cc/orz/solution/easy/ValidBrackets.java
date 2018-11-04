package cc.orz.solution.easy;

import java.util.*;

/**
 * @author hongweixu
 * @since 2018/11/4 11:44
 */
public class ValidBrackets {

    private static Map<Integer, Integer> map = new HashMap<>() {{
        put((int) ')', (int) '(');
        put((int) ']', (int) '[');
        put((int) '}', (int) '{');
    }};

    private boolean isValid(String s) {
        if ("".equals(s)) {
            return true;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for (char v : s.toCharArray()) {
            Integer val = map.get((int) v);
            if (val == null) {
                queue.add((int) v);
                continue;
            }
            if (queue.size() == 0) {
                return false;
            }
            Integer removed = queue.removeLast();
            if (!Objects.equals(removed, val)) {
                return false;
            }
        }

        return queue.size() == 0;

    }

    public static void main(String[] args) {

        System.exit(0);
    }
}
