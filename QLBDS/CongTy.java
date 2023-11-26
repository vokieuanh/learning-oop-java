package QLBDS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CongTy {

    private String name;
    private QLBDS.CongTy.QuanLyBDS QuanLyBDS;

    //
    public CongTy(String name) {
        this.name = name;
        this.QuanLyBDS = new QuanLyBDS();
    }

    public void khoiTaoBDS() {
        //Them BDS
        DatTrong datTrong = new DatTrong(1, 15.5, 2.3);
        NhaO nhaO = new NhaO(2, 10.5, 10, 1);
        KhachSan khachSan = new KhachSan(3, 20, 25.5, 3) ;
        BietThu bietThu = new BietThu(4, 30, 20);
        
        //Hien thi thong tin BDS
        this.QuanLyBDS.addBatDongSan(datTrong);
        this.QuanLyBDS.addBatDongSan(nhaO);
        this.QuanLyBDS.addBatDongSan(khachSan);
        this.QuanLyBDS.addBatDongSan(bietThu);
    }

    public String getName() {
        return name;
    }

    public QuanLyBDS getQuanLyBDS() {
        return QuanLyBDS;
    }

    public class QuanLyBDS {
        // tao lop danh sach BDS
        List<BatDongSan> QuanLy = new ArrayList<>();

        // Them BDS vao danh sach
        void addBatDongSan(BatDongSan a) {
            QuanLy.add(a);
            // System.out.println("Ma BDS " +BatDongSan.getmaSo() + "");
        }

        void calc() {
            DecimalFormat dFormat = new DecimalFormat("###,###,###,### vnd");
            System.out.println("Chao mung ban den voi cong ty BDS ABC");
            System.out.println("Cong ty ABC bao gom cac BDS la: ");
            for (BatDongSan item : QuanLy) {
                System.out.println("[" + item.toString() + "] co gia tri la: " + dFormat.format(item.tinhGiaBan()));
            }
        }
        // void sellBDS(int maSo){
        // System.out.println("Moi ban chon ma so BDS muon mua: ");
        // for(BatDongSan index : QuanLy){
        // }
        // }

    }
}
