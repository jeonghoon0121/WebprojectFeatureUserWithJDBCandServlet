package com.linkup.UserManagerProject.model.dto;

public class UserDTO {
    private String userCode;
    private String userName;
    private String userPassword;
    public UserDTO() {}

    public UserDTO(String userCode, String userName, String userPassword) {
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
