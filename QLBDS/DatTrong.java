package QLBDS;

public class DatTrong extends BatDongSan {

    // Constructor
    public DatTrong(int maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
        this.daBan = false; // Trạng thái ban đầu là chưa bán
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Trạng thái: " + (daBan ? "Đã Bán" : "Chưa Bán"));
    }

    public void banDat() {
        daBan = true;
        System.out.println("Đất đã được bán. ");
    }

    @Override
    protected double tinhGiaBan() {
        return tinhDienTich() * 10000;
    }

    private double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}