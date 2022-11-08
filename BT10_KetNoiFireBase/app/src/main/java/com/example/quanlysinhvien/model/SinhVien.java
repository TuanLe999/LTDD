package com.example.quanlysinhvien.model;

public class SinhVien {
    private String id;
    private String msv;
    private String hoTen;
    private String email;


    public SinhVien() {
    }

    public SinhVien(String id, String msv, String hoTen, String email) {
        this.id = id;
        this.msv = msv;
        this.hoTen = hoTen;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
