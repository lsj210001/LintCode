// 2. 尾部的零
public class TrailingZeros {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     * 可以将每个数拆分成其素因子的乘积，可以发现，0是由2*5产生的，而5的数量一定小于2的数量，因此5的个数决定了结尾0的个数。
     * 只要计算n的阶乘中，5这个素因子出现多少次即可。
     */
    public long trailingZeros(long n) {
        long result = 0;
        while (n != 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}
