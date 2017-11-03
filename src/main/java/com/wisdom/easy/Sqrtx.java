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
     * 采用二分法来取值
     * 在实现代码中，我才用了一个判断语句块来对平方根介于两个整数之间这种情况进行处理。
     即如果中间值与左右边界的和的一半是相等的，那么现在的中间值就是上一循环中已经使用过的，也就是不需要
     再进行迭代计算了。同时此时的中间值，也是最接近平方根的整数值。
     * @param x 被开方数
     * @return 结果
     */
    public int sqrt(int x) {
        int low = 0, high = x;
        while(low <= high) {
            int mid = low + (high - low)/2;
            long square = (long)mid * (long)mid;
            long square1 = (long)(mid + 1) * (long)(mid + 1);
            long square2 = (long)(mid - 1) * (long)(mid - 1);

            if(square == x) return mid;
            if(square < x && square1 > x) {
                return mid;
            }
            if(square > x && square2 < x) {
                return mid - 1;
            }
            if(square < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
