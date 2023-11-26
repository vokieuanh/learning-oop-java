package QLBDS;

abstract class BatDongSan {
    public int maSo;
    public double chieuDai, chieuRong; // don vi: met
    public boolean daBan;

    protected abstract double tinhGiaBan();

    // Constructor
    public BatDongSan(int maSo, double chieuDai, double chieuRong) {
        this.maSo = maSo;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.daBan = false;

    }

    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public boolean isDaBan() {
        return daBan;
    }

    public void setDaBan(boolean daBan) {
        this.daBan = daBan;
    }

    @Override
    public String toString() {
        return getClass().getName() + " - MaSo: " + maSo;
    }

    // Xuat
    public void printInfo() {
        System.out.println("MaSo: " + maSo);
    }
}
