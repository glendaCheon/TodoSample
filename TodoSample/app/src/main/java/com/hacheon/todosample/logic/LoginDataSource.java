package com.hacheon.todosample.logic;

import com.hacheon.todosample.model.User;

public interface LoginDataSource {
    public void setLoginRepository(LoginRepository repository);
    public void loginProc(User user);
}
