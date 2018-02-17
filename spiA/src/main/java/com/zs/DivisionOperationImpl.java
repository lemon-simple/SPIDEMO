package com.zs;
public class DivisionOperationImpl implements IOperation {

    @Override
    public int operation(int numberA, int numberB) {
    	System.out.println("具体实现:除法計算");
        return numberA / numberB;
    }
}