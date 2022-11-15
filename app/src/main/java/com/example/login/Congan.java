package com.example.login;

public class Congan {
    private String Ten;
    private String CapBac;
    private String NoiCongTac;
    private String QuocGia;
    private int Hinh;


    public Congan() {
    }

    public Congan(String ten, String capBac, String noiCongTac, String quocGia, int hinh) {
        Ten = ten;
        CapBac = capBac;
        NoiCongTac = noiCongTac;
        QuocGia = quocGia;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String capBac) {
        CapBac = capBac;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        NoiCongTac = noiCongTac;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
