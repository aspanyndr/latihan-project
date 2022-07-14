package com.aspanyndr.manajemenperpustakaan.model.dto;

public class LoginDto {

    private String userName;
    private String password;
    private String statusPerpustakaan;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatusPerpustakaan() {
        return statusPerpustakaan;
    }

    public void setStatusPerpustakaan(String statusPerpustakaan) {
        this.statusPerpustakaan = statusPerpustakaan;
    }
}
