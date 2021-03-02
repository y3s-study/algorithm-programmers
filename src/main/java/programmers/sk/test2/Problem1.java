package programmers.sk.test2;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4,7));
    }

    public static int solution(int n, int a, int b) {
        int answer = 1;

        for (int i = n; i > 0; i = i / 2) {
            if (a < b && a + 1 == b && b % 2 == 0) {
                break;
            } else if (a > b && b + 1 == a && a % 2 == 0) {
                break;
            }

            if (a % 2 == 0) a = a / 2;
            else a = (a + 1) / 2;

            if (b % 2 == 0) b = b / 2;
            else b = (b + 1) / 2;

            answer++;

            if (a < b && a + 1 == b && b % 2 == 0) {
                break;
            } else if (a > b && b + 1 == a && a % 2 == 0) {
                break;
            }
        }

        return answer;
    }
}
