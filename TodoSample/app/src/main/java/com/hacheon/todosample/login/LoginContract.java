package com.hacheon.todosample.login;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.base.BaseView;
import com.hacheon.todosample.model.User;

public class LoginContract {
    public interface  View extends BaseView {
        void loginDone();
    }

    public interface Presenter extends BasePresenter<LoginContract.View> {
        void loginProc(User user);
        void loginDone();
    }
}
