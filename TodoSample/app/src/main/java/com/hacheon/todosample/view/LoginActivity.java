package com.hacheon.todosample.view;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.hacheon.todosample.R;
import com.hacheon.todosample.base.BaseActivity;
import com.hacheon.todosample.login.LoginContract;
import com.hacheon.todosample.login.LoginPresenter;
import com.hacheon.todosample.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity<LoginContract.View, LoginContract.Presenter> implements LoginContract.View {

    @Override
    protected LoginContract.Presenter setPresenter() {
        return new LoginPresenter();
    }

    //[START] components area
    @BindView(R.id.txtId)
    EditText txtId;
    @BindView(R.id.txtPwd)
    EditText txtPwd;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    //[END]

    //[START] objects
    private LoginContract.Presenter loginPresenter;
    //[END]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loginPresenter = new LoginPresenter();
        loginPresenter.setView(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setId(txtId.getText().toString());
                user.setPwd(txtPwd.getText().toString());
                loginPresenter.loginProc(user);
                loginPresenter.loginDone();
            }
        });
    }

    @Override
    public void loginDone() {
        Toast.makeText(this, "loginDone!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        loginPresenter.removeView();
        super.onDestroy();
    }
}
