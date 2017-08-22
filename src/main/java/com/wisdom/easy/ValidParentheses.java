package com.wisdom.easy;

import java.util.Stack;
/**
 * 简单——高频题
 * 有效的括号序列
 * 给定一个字符串所表示的括号序列，包含以下字符： '(', ')', '{', '}', '[' and ']'， 判定是否是有效的括号序列。
 * 括号必须依照 "()" 顺序表示， "()[]{}" 是有效的括号，但 "([)]"则是无效的括号。
 */
public class ValidParentheses {
    /**
     * main 方法测试
     * @param args Main函数
     */
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
//        boolean b = validParentheses.isValidParentheses(""); //true
//        boolean b = validParentheses.isValidParentheses("["); //false
//        boolean b = validParentheses.isValidParentheses("[{({})([]{})}]"); //true
//        boolean b = validParentheses.isValidParentheses("[]{}{(}){}]["); //false
        boolean b = validParentheses.isValidParentheses("[][]{}{}");
        System.out.println(b);
    }
    /**
     * 实现：
     *      按照要求进行分析：
     *          1，如果括号数量为单数，不符合
     *          2，括号有序，那么就要保证有几个左半边就有多少右半边，并且不能右半边为前。
     *          3，如果有序，那么必然中间或者某处有括号成对出现，并且之前不成对的括号在去除成对的括号之后也可看作成对出现
     *      于是，想到了一个简单的，LIFO（后进先出）的数据结构，队列
     *      将字符串分为数组，按照顺序存储到队列中，存储过程中，如果出现于栈顶元素相匹配的括号，则去除栈顶元素，否则存储到栈中
     *      最后，判断栈是否为空 Stack.isEmpty()方法，将其返回就好
     * @param s 需要判断的字符串
     * @return 符合要求：true  否则 false
     */
    private boolean isValidParentheses(String s) {
        //write you code here
        if (0 != s.length() % 2) {
            return false;
        }
        if (0 == s.length()) {
            return true;
        }
        char[] ch = s.toCharArray();
        //创建一个堆栈
        Stack<String> stack = new Stack<>();
        //先向堆栈中压入第一个字符
        stack.push(ch[0] + "");
        //循环
        for (int i = 1; i < ch.length; i++) {
            if (stack.isEmpty()) {
                stack.push(ch[i] + "");
                continue;
            }
            if ("(".equals(stack.peek()) && (ch[i] + "").equals(")")) {
                stack.pop();
                continue;
            }
            if ("[".equals(stack.peek()) && (ch[i] + "").equals("]")) {
                stack.pop();
                continue;
            }
            if ("{".equals(stack.peek()) && (ch[i] + "").equals("}")) {
                stack.pop();
            } else {
                stack.push(ch[i] + "");
            }
        }
        return stack.isEmpty();
    }
}
