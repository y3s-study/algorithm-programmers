package programmers.yj.p42895

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42895
 * <p>
 * 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.
 * 아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.
 * <p>
 * 12 = 5 + 5 + (5 / 5) + (5 / 5)
 * 12 = 55 / 5 + 5 / 5
 * 12 = (55 + 5) / 5
 * <p>
 * 5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
 */
class KtExpressN {
    fun solution(N: Int, number: Int): Int {
        val sets = (0..7).map { mutableSetOf("$N".repeat(it + 1).toInt()) }

        for (i in 0..7) {
            for (j in 0 until i) {
                for (a in sets[j]) {
                    for (b in sets[i - 1 - j]) {
                        sets[i].add(a + b)
                        sets[i].add(a - b)
                        sets[i].add(a * b)
                        if (b != 0) sets[i].add(a / b)
                    }
                }
            }

            if (sets[i].contains(number)) return i + 1
        }

        return -1
    }
}

fun main() {
    println(KtExpressN().solution(5, 12))
    println(KtExpressN().solution(2, 22))
}