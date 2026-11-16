public class Main {
    public static void main(String[] args) {
        Sach sach1 = new Sach(
            "S01",
            "Lap trinh Java",
            "Nguyen Van A",
            2025,
            10
        );

        System.out.println(" THONG TIN SACH ");
        sach1.hienThiThongTin();

        System.out.println("\nSUA THONG TIN SACH ");

        sach1.setTieuDe("Lap trinh Java nang cao");
        sach1.setSoLuong(20);

        sach1.hienThiThongTin();
    }
}