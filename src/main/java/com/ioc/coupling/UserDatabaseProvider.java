package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Message to check userDatabaseProvider dependency";
    }
}
