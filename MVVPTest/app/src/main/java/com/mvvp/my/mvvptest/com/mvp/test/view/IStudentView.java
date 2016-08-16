package com.mvvp.my.mvvptest.com.mvp.test.view;

/**
 * Created by huangResplendent on 16/8/16.
 *
 */
public interface IStudentView {
    String getStuentName();
    String getStuentAge();
    void clearInput();
    void setStuentName(String stuentName);
    void setStuentAge(String age);
    void showLoading(boolean isShow);
    void showToast(String text);





}
