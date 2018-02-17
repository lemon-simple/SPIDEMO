package com.zs;
public class PlusOperationImpl implements IOperation {
    public int operation(int numberA, int numberB) {
    	System.out.println("具体实现:加法計算");

        return numberA + numberB;
    }
}