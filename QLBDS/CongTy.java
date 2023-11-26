package QLBDS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CongTy {

    private String name;
    // private QLBDS.CongTy.QuanLyBDS QuanLyBDS;

    private List<BatDongSan> QuanLyBDS;

    //
    public CongTy(String name) {
        this.name = name;
        this.QuanLyBDS = new ArrayList<>();
    }

    public void khoiTaoBDS() {
        // Them BDS
        DatTrong datTrong = new DatTrong(1, 15.5, 2.3);
        NhaO nhaO = new NhaO(2, 10.5, 10, 1);
        KhachSan khachSan = new KhachSan(3, 20, 25.5, 3);
        BietThu bietThu = new BietThu(4, 30, 20);

        // Hien thi thong tin BDS
        addBatDongSan(datTrong);
        addBatDongSan(nhaO);
        addBatDongSan(khachSan);
        addBatDongSan(bietThu);
    }

    public String getName() {
        return name;
    }

    public boolean banNha(int maso) {
        // 1. tim nha co ma so truyen vao
        BatDongSan bds = null;
        for (BatDongSan item : this.QuanLyBDS) {
            if (item.getMaSo() == maso) {
                bds = item;
                break;
            }
        }

        if (bds == null) {
            // khong tim thay
            System.out.println("Khong tim thay BDS ma so: " + maso);
            return false;
        }

        if (bds.isDaBan()) {
            System.out.println("BDS ma so: " + maso + " da duoc ban");
            return false;
        }

        bds.setDaBan(true);

        return true;
    }

    // Them BDS vao danh sach
    void addBatDongSan(BatDongSan a) {
        this.QuanLyBDS.add(a);
        // System.out.println("Ma BDS " +BatDongSan.getmaSo() + "");
    }

    void calc() {
        DecimalFormat dFormat = new DecimalFormat("###,###,###,### vnd");
        System.out.println("Chao mung ban den voi cong ty BDS ABC");
        System.out.println("Cong ty ABC bao gom cac BDS la: ");
        for (BatDongSan item : this.QuanLyBDS) {
            System.out.println("[" + item.toString() + "] co gia tri la: " + dFormat.format(item.tinhGiaBan()));
        }
    }

    // public class QuanLyBDS {
    // // tao lop danh sach BDS
    // List<BatDongSan> QuanLy = new ArrayList<>();

    // // Them BDS vao danh sach
    // void addBatDongSan(BatDongSan a) {
    // QuanLy.add(a);
    // // System.out.println("Ma BDS " +BatDongSan.getmaSo() + "");
    // }

    // void calc() {
    // DecimalFormat dFormat = new DecimalFormat("###,###,###,### vnd");
    // System.out.println("Chao mung ban den voi cong ty BDS ABC");
    // System.out.println("Cong ty ABC bao gom cac BDS la: ");
    // for (BatDongSan item : QuanLy) {
    // System.out.println("[" + item.toString() + "] co gia tri la: " +
    // dFormat.format(item.tinhGiaBan()));
    // }
    // }
    // // void sellBDS(int maSo){
    // // System.out.println("Moi ban chon ma so BDS muon mua: ");
    // // for(BatDongSan index : QuanLy){
    // // }
    // // }

    // }
}
