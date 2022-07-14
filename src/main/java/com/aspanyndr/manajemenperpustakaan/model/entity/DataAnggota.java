package com.aspanyndr.manajemenperpustakaan.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_anggota")

public class DataAnggota {
    @Id
    @Column(name = "id_Anggota")
    private int idAnggota;
    @Column(name = "nama_Anggota")
    private String namaAnggota;
    @Column(name = "jk_Anggota")
    private String jkAnggota;
    @Column(name = "pekerjaan")
    private String pekerjaan;
    @Column(name = "alamat_Anggota")
    private String alamatAnggota;
    @Column(name = "no_Hp_Anggota")
    private int noHpAnggota;
    @Column(name = "password_Anggota")
    private String passwordAnggota;
    @Column(name = "status_Anggota")
    private String statusAnggota;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getJkAnggota() {
        return jkAnggota;
    }

    public void setJkAnggota(String jkAnggota) {
        this.jkAnggota = jkAnggota;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamatAnggota() {
        return alamatAnggota;
    }

    public void setAlamatAnggota(String alamatAnggota) {
        this.alamatAnggota = alamatAnggota;
    }

    public int getNoHpAnggota() {
        return noHpAnggota;
    }

    public void setNoHpAnggota(int noHpAnggota) {
        this.noHpAnggota = noHpAnggota;
    }

    public String getPasswordAnggota() {
        return passwordAnggota;
    }

    public void setPasswordAnggota(String passwordAnggota) {
        this.passwordAnggota = passwordAnggota;
    }

    public String getStatusAnggota() {
        return statusAnggota;
    }

    public void setStatusAnggota(String statusAnggota) {
        this.statusAnggota = statusAnggota;
    }
}


