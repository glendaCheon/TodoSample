package com.hacheon.todosample.logic;

import com.hacheon.todosample.model.User;
import com.hacheon.todosample.login.LoginContract;

public interface LoginRepository {
    void setPresenter(LoginContract.Presenter presenter);
    void loginProc(User user);
    void loginDone();
}
