package programmers.sk.p_30_43165

/**
 * 문제 설명
 * n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 * <p>
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 */

class KtProblem43165 {
    fun solution(numbers: IntArray, target: Int): Int {
        return targetNumber(numbers, target, 0, 0)
    }

    private fun targetNumber(numbers: IntArray, target: Int, index: Int, count: Int): Int {
        if (index == numbers.size) {
            return if (count == target) 1 else 0
        }
        val count1 = targetNumber(numbers, target, index + 1, count + numbers[index])
        val count2 = targetNumber(numbers, target, index + 1, count - numbers[index])
        return count1 + count2
    }
}