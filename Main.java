import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia;
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n THÔNG TIN SÁCH ");
        System.out.println("Mã sách  : " + maSach);
        System.out.println("Tên sách : " +tenSach)
        System.out.println("Tác giả : " + tacGia);
        System.out.println("Nhà xuất bản : " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);

        System.out.println("\n KẾT QUẢ TÍNH TOÁN ");
        System.out.println("thành tiền: " + thanhTien);
        System.out.println("phí vận chuyển : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập : " + tongTienNhap);
        sc.close();
    }
}