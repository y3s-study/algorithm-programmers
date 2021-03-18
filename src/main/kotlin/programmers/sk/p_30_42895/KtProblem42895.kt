package programmers.sk.p_30_42895

class KtProblem42895 {
    fun solution(N: Int, number: Int): Int {
        val sets = (0..8).map {
            if (it != 0) mutableSetOf("$N".repeat(it).toInt())
            else mutableSetOf()
        }

        for (i in 1..8) {
            for (j in 1 until i) {
                for (a in sets[j]) {
                    for (b in sets[i - j]) {
                        sets[i].add(a + b)
                        sets[i].add(a - b)
                        sets[i].add(a * b)
                        if (b != 0) sets[i].add(a / b)
                    }
                }
            }

            if (sets[i].contains(number)) return i
        }

        return -1
    }
}