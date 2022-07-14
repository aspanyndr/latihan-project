package com.aspanyndr.manajemenperpustakaan.model.dto;

public class HasilLogin {

    private boolean loginStatus;
    private String pesan ="Selamat Datang di perpustakaan kami";

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
