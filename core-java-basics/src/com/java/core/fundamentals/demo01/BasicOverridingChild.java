package com.java.core.fundamentals.demo01;

class BasicOverridingChild extends BasicOverriding {
    private int subThirdNo;

    public BasicOverridingChild(int subFirstNo, int subSecondNo, int subThirdNo){
        super(subFirstNo,subSecondNo);
        this.subThirdNo = subThirdNo;
    }
    public int getSubThirdNo(){
        return this.subThirdNo;
    }
    public int sub(){
        return getSubThirdNo()-getSubSecondNo();
    }

}
