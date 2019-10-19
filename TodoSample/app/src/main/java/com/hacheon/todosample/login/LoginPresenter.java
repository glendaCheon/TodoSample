package com.hacheon.todosample.login;

import com.hacheon.todosample.base.BasePresenterImpl;
import com.hacheon.todosample.logic.LoginRepository;
import com.hacheon.todosample.logic.LoginRepositoryImpl;
import com.hacheon.todosample.model.User;

public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements LoginContract.Presenter {
    LoginContract.View view;
    LoginRepository repository = new LoginRepositoryImpl();

    //vivew에서 presenter 호출하므로.
    @Override
    public void setView(LoginContract.View view) {
        this.view = view;
        repository.setPresenter(this);
    }

    @Override
    public void loginProc(User user) {
        repository.loginProc(user);
    }

    @Override
    public void loginDone() {
        view.loginDone();
    }
}
