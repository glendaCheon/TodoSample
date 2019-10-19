package com.hacheon.todosample.logic.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.hacheon.todosample.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class LoginAppDataBase extends RoomDatabase {
    public abstract  UserDao getuserDao();
}
