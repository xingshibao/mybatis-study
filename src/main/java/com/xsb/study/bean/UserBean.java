package com.xsb.study.bean;

/**
 * @author shibao.xing
 * @since 2017-12-20 17:43
 */
public class UserBean {

    private int id;

    private String email;

    private String userName;

    private int roleId;

    private String passwordHash;

    private int confirmed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", roleId=" + roleId +
                ", passwordHash='" + passwordHash + '\'' +
                ", confirmed=" + confirmed +
                '}';
    }
}
