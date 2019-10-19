package com.hacheon.todosample.logic.local;

import android.content.Context;

import androidx.room.Room;

public class AppDatabaseProvider {
    private volatile static LoginAppDataBase INSTANCE =null;
    //기본 constructor
    private AppDatabaseProvider(){};

    public static LoginAppDataBase getINSTANCE() throws  Exception{
        if(INSTANCE == null){
            throw new Exception("INSTANCE MUST BENOT NULL");
        }

        return INSTANCE;
    }

    public static LoginAppDataBase getINSTACE(Context context) {
        if(INSTANCE == null)
            synchronized (LoginAppDataBase.class){
            INSTANCE = Room.databaseBuilder(context, LoginAppDataBase.class,"db").fallbackToDestructiveMigration().build();
        }

        return INSTANCE;
    }


}
