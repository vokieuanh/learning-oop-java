package QLBDS;

// tạo lớp NhaO kế thừa từ lớp BatDongSan
class NhaO extends BatDongSan {
    private boolean daBan;
    private int soLau;

    public NhaO(int maSo, double chieuDai, double chieuRong, int soLau) {
        super(maSo, chieuDai, chieuRong);
        this.soLau = soLau;
        this.daBan = false;
    }

    // Getter và Setter cho soLau
    public int getSoLau() {
        return soLau;
    }

    void setSoLau(int soLau) {
        this.soLau = soLau;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Số Lầu: " + soLau);
        System.out.println("Trạng thái: " + (daBan ? "Đã Bán" : "Chưa Bán"));
    }

    public void banNha() {
        daBan = true;
        System.out.println("Nhà đã được bán. ");
    }
    public boolean isDaBan() {
        return daBan;
    }

    @Override
    public double tinhGiaBan() {
        return getDienTich() * 10000 + this.soLau * 100000;
    }
}