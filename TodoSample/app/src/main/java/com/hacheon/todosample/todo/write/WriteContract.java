package com.hacheon.todosample.todo.write;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.base.BaseView;
import com.hacheon.todosample.model.Item;

public class WriteContract {
    public interface  View extends BaseView {
        void SaveDone();
    }

    public interface Presenter extends BasePresenter<View> {
        void save(Item item);
        void saveDone();
    }
}
