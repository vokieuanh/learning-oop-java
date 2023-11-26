package QLBDS;

public class BietThu extends BatDongSan implements PhiKinhDoanh {

    public BietThu(int maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
        this.daBan = false;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Trang thai: " + (daBan ? "Da Ban" : "Chua Ban"));
    }

    @Override
    public double phi() {
        return getDienTich() * 1000;
    }

    public void banBT() {
        daBan = true;
        System.out.println("Biet thu da duoc ban. ");
    }

    @Override
    public double tinhGiaBan() {
        return getDienTich() * 400000 + phi();
    }
}