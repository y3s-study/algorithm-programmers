package programmers.sk.p_30_12899;

public class Problem12899 {
    public String solution(int n) {
        String answer = "";
        while (n > 0) {
            answer = parse124(n % 3) + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    private String parse124(int n) {
        if (n % 3 == 1) return "1";
        else if (n % 3 == 2) return "2";
        else return "4";
    }
}
