package com.hacheon.todosample.logic.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.hacheon.todosample.model.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM USER WHERE ID = :id AND PWD = :pwd")
    User login(String id, String pwd);

    @Insert
    void signInUser(User user);
}
