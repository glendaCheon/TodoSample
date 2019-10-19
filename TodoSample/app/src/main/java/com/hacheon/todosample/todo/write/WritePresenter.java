package com.hacheon.todosample.todo.write;

import com.hacheon.todosample.base.BasePresenterImpl;
import com.hacheon.todosample.model.Item;

public class WritePresenter extends BasePresenterImpl<WriteContract.View> implements  WriteContract.Presenter {
    WriteContract.View view;

    @Override
    public void setView(WriteContract.View view) {
        super.setView(view);

    }

    @Override
    public void save(Item item) {

    }

    @Override
    public void saveDone() {

    }
}
