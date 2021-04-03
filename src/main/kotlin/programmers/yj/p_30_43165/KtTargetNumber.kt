package programmers.yj.p_30_43165

/**
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 */
class KtTargetNumber {
    fun solution(numbers: IntArray, target: Int, idx: Int = 0, sum: Int = 0): Int =
        when {
            (idx >= numbers.size) -> if (sum == target) 1 else 0
            else -> {
                val count1 = solution(numbers, target, idx + 1, sum + numbers[idx])
                val count2 = solution(numbers, target, idx + 1, sum - numbers[idx])
                count1 + count2
            }
        }

    fun solution2(numbers: IntArray, target: Int): Int {
        return numbers
            .fold(listOf(0)) { list, i -> list.map { it + i } + list.map { it - i } }
            .count { it == target }
    }
}
