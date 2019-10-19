package com.hacheon.todosample.logic.remote;

import android.util.Log;

import com.hacheon.todosample.logic.LoginDataSource;
import com.hacheon.todosample.logic.LoginRepository;
import com.hacheon.todosample.model.User;

public class LoginRemoteDataSourceImpl implements LoginDataSource {
    LoginRepository loginRepository;

    @Override
    public void setLoginRepository(LoginRepository repository) {
        this.loginRepository = repository;
    }

    @Override
    public void loginProc(User user) {
        Log.d("RemoteDataSourceImple]", "서버 통신 아직 안 됨 ㅠ.ㅠ");
        return;
    }
}
