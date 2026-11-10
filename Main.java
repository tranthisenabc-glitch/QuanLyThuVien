public class Main {
    public static void main(String[] args) {
        Sach sach1 = new Sach();

        sach1.maSach = "S01";
        sach1.tieuDe = "Lap trinh Java";
        sach1.tacGia = "Nguyen Van A";
        sach1.namXuatBan = 2025;
        sach1.soLuong = 10;

        System.out.println(" THONG TIN SACH ");
        sach1.hienThiThongTin();
    }
}