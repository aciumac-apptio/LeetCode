import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    public int numDecodings(String s) {

        // do a dfs to find number of possible ways
        return dfsDynamic(s);

    }

    private int dfs(String s) {
        if (s.isEmpty()) {
            return 1;
        } else {
            int result1 = 0, result2 = 0;
            int i1 = Integer.parseInt(s.substring(0, 1));

            if (i1 > 0 && i1 < 27) {
                result1 = dfs(s.substring(1));
            }

            if (s.length() > 1 && s.charAt(0) != '0') {
                int i2 = Integer.parseInt(s.substring(0, 2));
                if (i2 > 0 && i2 < 27) {
                    result2 = dfs(s.substring(2));
                }
            }

            return result1 + result2;
        }
    }


    private int dfsDynamic(String s) {

        int n = s.length();
        int[] memo = new int[n + 1];
        memo[n] = 1;
        memo[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') continue;
            else {
                int val = Integer.parseInt(s.substring(i, i + 2));
                memo[i] = val < 27 && val > 0 ? memo[i + 1] + memo[i + 2] : memo[i + 1];
            }
        }
        return memo[0];
    }
}
