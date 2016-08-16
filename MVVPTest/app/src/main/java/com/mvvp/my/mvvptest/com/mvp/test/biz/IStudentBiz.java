package com.mvvp.my.mvvptest.com.mvp.test.biz;

import com.mvvp.my.mvvptest.com.mvp.test.bean.Student;

/**
 * Created by huangResplendent on 16/8/16.
 */
public interface IStudentBiz {
    public void reset(Student student,IResultListener resultListener);
    public void select(IResultListener resultListener);
}
