package com.aspanyndr.manajemenperpustakaan.model.dto;

public class LoginDto {

    private int idUser;
    private String password;
    private String statusPerpustakaan;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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