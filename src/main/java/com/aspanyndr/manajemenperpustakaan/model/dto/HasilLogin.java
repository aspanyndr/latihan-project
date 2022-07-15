package com.aspanyndr.manajemenperpustakaan.model.dto;

import com.aspanyndr.manajemenperpustakaan.model.entity.DataAnggota;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class HasilLogin {
    private boolean loginStatus;
    private String pesan;

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getPesan( ) {
        LoginDto loginDto = new LoginDto();
        pesan ="Selamat Datang " + loginDto.getStatusPerpustakaan() + "di perpustakaan kami";
        return pesan;
    }
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
