package com.xqr.expection;

public class MyUserExpection extends Exception{
    public MyUserExpection() {
        super();
    }

    public MyUserExpection(String message) {
        super(message);
    }
}
