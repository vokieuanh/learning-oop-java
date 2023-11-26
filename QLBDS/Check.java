package QLBDS;

public class Check {
    public static void main(String[] args) {
        //Tao cong ty BDS
        CongTy ABC = new CongTy("ABC");
        
        // Khoi tao BDS
        ABC.khoiTaoBDS();
        ABC.calc();

        //Ban BDS
        boolean isSuccess = ABC.banNha(0);
        

        // test change content
        
        // Kiểm tra xem nhà đã được bán hay chưa
        // if (nha.isDaBan()) {
        //     System.out.println("Nhà đã được bán.");
        // } else {
        //     System.out.println("Nhà chưa được bán.");
        // }

        // Bán nhà
        // nha.banNha();

        // Kiểm tra lại sau khi bán
        // if (nha.isDaBan()) {
        //     System.out.println("Nhà đã được bán.");
        // } else {
        //     System.out.println("Nhà chưa được bán.");
        // }
    }
}
