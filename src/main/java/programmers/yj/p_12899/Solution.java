package programmers.yj.p_12899;

public class Solution {
    public String solution(int n) {
        String[] base = {"1", "2", "4"};
        n = n - 1;

        StringBuilder sb = new StringBuilder();

        while (true) {
            if (n < 3) {
                sb.append(base[n]);
                break;
            }

            sb.append(base[n % 3]);
            n = (n / 3) - 1;
        }

        return sb.reverse().toString();
    }
}
