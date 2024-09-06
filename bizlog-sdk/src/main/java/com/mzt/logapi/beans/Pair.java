package com.mzt.logapi.beans;

/**
 * @author 肖长佩
 * @email 16511660@qq.com
 * @date 2024-09-06 11:57
 * @since 1.0.0
 */
public class Pair <A, B> {
    private final A first;
    private final B second;

    public static <A, B> Pair<A, B> of(A first, B second) {
        return new Pair<A, B>(first, second);
    }

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
