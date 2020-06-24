// 3. 统计数字
public class DigitCounts {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        int result = 1;
        for (int i = k + 1; i <= n; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == k) {
                    result += 1;
                }
                tmp /= 10;
            }
        }
        return result;
    }
}
