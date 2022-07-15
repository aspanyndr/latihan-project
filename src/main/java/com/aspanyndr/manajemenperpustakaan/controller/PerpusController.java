package com.aspanyndr.manajemenperpustakaan.controller;

import com.aspanyndr.manajemenperpustakaan.model.dto.LoginDto;
import com.aspanyndr.manajemenperpustakaan.model.dto.HasilLogin;
//import com.aspanyndr.manajemenperpustakaan.repository.AnggotaRepository;
import com.aspanyndr.manajemenperpustakaan.model.entity.DataAnggota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perpustakaan")
public class PerpusController {

//    @Autowired
//    private AnggotaRepository anggotaRepository;

//    untuk mengakses --> /mahasiswa/login
    @PostMapping("/login")
    public LoginDto loginDto(@RequestBody LoginDto loginDto){
    return loginDto;
    }

    @PostMapping("/login1")
    public HasilLogin login(@RequestBody LoginDto loginDto){

        HasilLogin hasilLogin = new HasilLogin();
        hasilLogin.setLoginStatus(Boolean.TRUE);
        hasilLogin.getPesan();

        return hasilLogin;
    }
    @GetMapping("/baru")
    public DataAnggota convertDtoToEntity(LoginDto dto){
        DataAnggota da = new DataAnggota();
        da.setIdAnggota(dto.getIdUser());
        da.setPasswordAnggota(dto.getPassword());
        da.setStatusAnggota(dto.getStatusPerpustakaan());
        return da;
    }

//    @GetMapping("/byid/{idAnggota}")
//    public HasilLogin getByIdDataAnggota(@PathVariable String idAnggota){
//
//
//
//        return hasilLogin;
//    }

}
