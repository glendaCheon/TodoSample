package com.hacheon.todosample.logic.local;

import com.hacheon.todosample.logic.LoginDataSource;
import com.hacheon.todosample.logic.LoginRepository;
import com.hacheon.todosample.model.User;

public class LoginLocalDataSourceImpl implements LoginDataSource {
    LoginRepository loginRepository;

    @Override
    public void setLoginRepository(LoginRepository repository) {
        this.loginRepository = repository;
    }

    @Override
    public void loginProc(User user) {
        try {
            UserDao userDao = AppDatabaseProvider.getINSTANCE().getuserDao();
            User signInUserInfo = new User();
            signInUserInfo.setId(user.getId());
            signInUserInfo.setPwd(user.getPwd());
            userDao.signInUser(signInUserInfo);

            User loginUser = userDao.login(user.getId(), user.getPwd());
            if(loginUser != null){
                this.loginRepository.loginDone();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
