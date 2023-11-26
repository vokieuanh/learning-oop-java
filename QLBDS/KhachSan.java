package QLBDS;

public class KhachSan extends BatDongSan implements PhiKinhDoanh{
    private int soSao;

    public KhachSan(int maSo, double chieuDai, double chieuRong, int soSao) {
        super(maSo, chieuDai, chieuRong);
        this.soSao = soSao;
        this.daBan = false;
    }

    // Getter và Setter cho soSao
    public int getSoSao() {
        return soSao;
    }

    void setSoSao(int soSao) {
        this.soSao = soSao;
    }

    @Override
    public double phi() {
        return chieuRong * 5000;
    }

    @Override
    public double tinhGiaBan() {
        return chieuDai * chieuRong * 100000 + soSao * 50000 + phi();
    }
}