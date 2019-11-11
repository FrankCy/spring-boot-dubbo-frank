package com.frank.dubbo.entity.po;

import java.io.Serializable;

public class User implements Serializable {

    private String nickName;

    private String email;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
