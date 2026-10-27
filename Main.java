import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong, chonLoai;
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

        System.out.println("\n--- CHON LOAI SACH ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        chonLoai = Integer.parseInt(sc.nextLine());

        String loaiSach = "";
        switch (chonLoai) {
            case 1:
                loaiSach = "Sách giáo khoa";
                break;
            case 2:
                loaiSach = "Sách tham khảo";
                break;
            case 3:
                loaiSach = "Sách chuyên ngành";
                break;
            case 4:
                loaiSach = "Sách khác";
                break;
            default:
                loaiSach = "Không xác định";
                break;
        }

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n THONG TIN SACH ");
        System.out.println("Ma sach : " + maSach);
        System.out.println("Ten sach : " + tenSach);
        System.out.println("Tac gia : " + tacGia);
        System.out.println("Loai sach : " + loaiSach);
        System.out.println("Nam xuat ban : " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        System.out.println("\n KET QUA TINH TOAN ");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen : " + phiVanChuyen);
        System.out.println("Tong tien nhap : " + tongTienNhap);

        System.out.println("\n--- DANH GIA & QUYET DINH ---");
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 1000 && namXuatBan <= 2026) {
            System.out.println("- Kiem tra hop le: Hop le");
        } else {
            System.out.println("- Kiem tra hop le: Khong hop le");
        }

        if (donGia < 50000) {
            System.out.println("- Phan loai gia: Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("- Phan loai gia: Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("- Phan loai gia: Sach gia cao");
        } else {
            System.out.println("- Phan loai gia: Sach gia dac biet");
        }

        if (soLuong == 0) {
            System.out.println("- Phan loai ton kho: Het sach");
        } else if (soLuong <= 5) {
            System.out.println("- Phan loai ton kho: Sap het");
        } else if (soLuong <= 20) {
            System.out.println("- Phan loai ton kho: Con it");
        } else {
            System.out.println("- Phan loai ton kho: Con nhieu");
        }

        sc.close();
    }
}