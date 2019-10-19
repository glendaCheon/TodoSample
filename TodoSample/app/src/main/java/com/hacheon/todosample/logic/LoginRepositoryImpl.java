package com.hacheon.todosample.logic;

import com.hacheon.todosample.logic.local.LoginLocalDataSourceImpl;
import com.hacheon.todosample.logic.remote.LoginRemoteDataSourceImpl;
import com.hacheon.todosample.model.User;
import com.hacheon.todosample.login.LoginContract;

public class LoginRepositoryImpl implements LoginRepository {
    LoginContract.Presenter presenter;
    LoginDataSource localDataSource;
    LoginDataSource remoteDatSource;

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter  = presenter;
        localDataSource = new LoginLocalDataSourceImpl();
        localDataSource.setLoginRepository(this);
        remoteDatSource = new LoginRemoteDataSourceImpl();
        remoteDatSource.setLoginRepository(this);
    }

    @Override
    public void loginProc(User user) {
        localDataSource.loginProc(user);
    }

    @Override
    public void loginDone() {
        this.presenter.loginDone();
    }
}
