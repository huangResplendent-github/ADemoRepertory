package com.mvvp.my.mvvptest.com.mvp.test.presenter;

import com.mvvp.my.mvvptest.com.mvp.test.bean.ResultEntity;
import com.mvvp.my.mvvptest.com.mvp.test.bean.Student;
import com.mvvp.my.mvvptest.com.mvp.test.biz.IResultListener;
import com.mvvp.my.mvvptest.com.mvp.test.biz.StudentBiz;
import com.mvvp.my.mvvptest.com.mvp.test.view.IStudentView;

/**
 * Created by huangResplendent on 16/8/16.
 */
public class StudentPresenter {
    private IStudentView studentView;
    private StudentBiz studentBiz;

    public StudentPresenter(IStudentView studentView) {
        this.studentView = studentView;
        this.studentBiz = new StudentBiz();
    }

    public void reset(){
        studentView. showLoading(true);
        final Student student=new Student();
        student.setName(studentView.getStuentName());
        student.setAge(studentView.getStuentAge());
        studentBiz.reset(student, new IResultListener() {
            @Override
            public void result(ResultEntity result) {
                studentView. showLoading(false);
                if(result.getResult()>0){
                    studentView.showToast("重置成功");
                    studentView.clearInput();
                }else{
                    studentView.showToast("重置失败");
                }



            }
        });
    }


    public void select(){
        studentView. showLoading(true);
        studentBiz.select(new IResultListener() {
            @Override
            public void result(ResultEntity result) {
                studentView. showLoading(false);
            Student student=(Student)result.getResultEntity();
                if(student!=null){
                    studentView.setStuentAge(student.getAge());
                    studentView.setStuentName(student.getName());
                }
            }
        });
    }

}
