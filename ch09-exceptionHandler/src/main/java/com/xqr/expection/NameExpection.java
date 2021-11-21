package com.xqr.expection;
//当用户姓名有异常抛出异常
public class NameExpection extends MyUserExpection {
    public NameExpection() {
        super();
    }

    public NameExpection(String message) {
        super(message);
    }
}
