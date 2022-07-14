package com.aspanyndr.manajemenperpustakaan.controller;

import com.aspanyndr.manajemenperpustakaan.model.dto.LoginDto;
import com.aspanyndr.manajemenperpustakaan.model.dto.HasilLogin;
//import com.aspanyndr.manajemenperpustakaan.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perpustakaan")
public class PerpusController {

//    @Autowired
//    private AnggotaRepository anggotaRepository;

//    untuk mengakses --> /mahasiswa/login
    @PostMapping("/login")
    public HasilLogin login(@RequestBody LoginDto loginDto){

        HasilLogin hasilLogin = new HasilLogin();
        hasilLogin.setLoginStatus(Boolean.TRUE);
        hasilLogin.getPesan();

        return hasilLogin;
    }

//    @GetMapping("/byid/{idAnggota}")
//    public HasilLogin getByIdDataAnggota(@PathVariable String idAnggota){
//
//
//
//        return hasilLogin;
//    }

}
