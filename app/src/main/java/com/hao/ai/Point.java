package com.hao.ai;

/**
 * Created by ZhangHao on 2017/7/25.
 * 记录每个点的优先级
 */

public class Point {
    //在数组中位置
    private int x, y;
    //该点的优先级（AI根据优先级落子）
    private int priority = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", priority=" + priority +
                '}';
    }
}
