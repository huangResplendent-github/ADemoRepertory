package com.mvvp.my.mvvptest.com.mvp.test.biz;

import android.os.AsyncTask;

import com.mvvp.my.mvvptest.com.mvp.test.bean.ResultEntity;
import com.mvvp.my.mvvptest.com.mvp.test.bean.Student;

/**
 * Created by huangResplendent on 16/8/16.
 */
public class StudentBiz implements IStudentBiz {


    @Override
    public void reset(Student student, final IResultListener resultListener) {
        new AsyncTask<Student, Integer, Integer>() {


            @Override
            protected Integer doInBackground(Student... students) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Student student1 = students[0];
                    Student.getInstance().setAge(student1.getAge());
                    Student.getInstance().setName(student1.getName());
                    return 1;
                } catch (Exception e) {
                    return -1;
                }

            }

            @Override
            protected void onPostExecute(Integer integer) {
                super.onPostExecute(integer);
                resultListener.result(new ResultEntity(1,null));
            }
        }.execute(student);
    }

    @Override
    public void select(final IResultListener resultListener) {

        new AsyncTask<Integer, Integer, Student>() {


            @Override
            protected Student doInBackground(Integer... Integer) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

               return Student.getInstance();

            }

            @Override
            protected void onPostExecute(Student student) {
                super.onPostExecute(student);
                resultListener.result(new ResultEntity(1,student));
            }
        }.execute();

    }
}
