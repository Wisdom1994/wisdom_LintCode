package com.wisdom.easy;

public class Sqrtx {
    /**
     * 偷鸡取巧的方法，使用了Java的 java.lang.Math 类中的 sqrt方法
     * @param x 被开方数
     * @return 结果
     */
    public int sqrtDemo(int x) {
        if (x <= 0) {
            return 0;
        }
        return (int)Math.floor(Math.sqrt(x));
    }
    /**
     * 需要我们求一个整数的平方根，更准确的说是平方根的向下取整的整数，
     可以采用二分法来进行求解；
     需要注意的是，可能结果并不是待求整数的数学平方根,
     所以，在进行区间迭代的时候，是要引起注意的，有可能待求数的平方根是介于两个整数之间的，
     这种情况需要做一下判断处理，否则会陷入死循环中。
     *
     * 采用二分法来取值
     * 在实现代码中，我才用了一个判断语句块来对平方根介于两个整数之间这种情况进行处理。
     即如果中间值与左右边界的和的一半是相等的，那么现在的中间值就是上一循环中已经使用过的，也就是不需要
     再进行迭代计算了。同时此时的中间值，也是最接近平方根的整数值。
     * @param x 被开方数
     * @return 结果
     */
    public int sqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        int low = 1, high = 46341;
        int mid = 0;
        while(low < high) {
            if ((low + high) / 2 == mid) {
                break;
            }
            mid = (low + high) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid < x) {
                low = mid;
            }
            if (mid * mid > x) {
                high = mid;
            }
        }
        return mid;
    }
}
