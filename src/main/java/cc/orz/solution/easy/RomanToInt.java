package cc.orz.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongweixu
 * @since 2018/11/2 00:19
 */
public class RomanToInt {
    private static Map<String, Integer> map = new HashMap<>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("III", 3);
        put("II", 2);
        put("I", 1);
    }};

    private static int romanToInt(String s) {
        Integer val = map.get(s);
        if (val != null) {
            return val;
        }

        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            String cur = String.valueOf(s.charAt(i));
            if (i + 1 < len) {
                String curN = String.valueOf(s.charAt(i + 1));
                int cVal = map.get(cur);
                int cnVal = map.get(curN);
                if (cVal < cnVal) {
                    sum += map.get(cur + curN);
                    i++;
                } else {
                    sum += cVal;
                }
                continue;
            }
            sum += map.get(cur);
        }
        return sum;
    }

    public static void main(String[] args) {

        assert 1994 == RomanToInt.romanToInt("MCMXCIV");
        assert 58 == RomanToInt.romanToInt("LVIII");

        System.out.println("Success");
        System.exit(0);
    }
}
