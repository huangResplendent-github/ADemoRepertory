package com.mvvp.my.mvvptest.com.mvp.test.bean;

/**
 * Created by huangResplendent on 16/8/16.
 */
public class ResultEntity<T> {
    private int result;
    private T resultEntity;


    public ResultEntity() {
    }

    public ResultEntity(int result, T resultEntity) {
        this.result = result;
        this.resultEntity = resultEntity;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public T getResultEntity() {
        return resultEntity;
    }

    public void setResultEntity(T resultEntity) {
        this.resultEntity = resultEntity;
    }
}
