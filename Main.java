import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        String[] tacGia = new String[100];
        int[] namXuatBan = new int[100];
        int[] soLuong = new int[100];
        double[] donGia = new double[100];
        int n = 0;
        int chon;
        for (;;) {
            System.out.println("\n========== MENU QUAN LY SACH ==========");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Hien thi danh sach sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach can nhap: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap thong tin sach thu " + (i + 1));
                        System.out.print("Nhap ma sach: ");
                        maSach[i] = sc.nextLine();
                        System.out.print("Nhap ten sach: ");
                        tenSach[i] = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        tacGia[i] = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        namXuatBan[i] = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap don gia: ");
                        donGia[i] = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap so luong: ");
                        soLuong[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;
                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }
                    System.out.println("\n========== KET QUA ==========");
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    int timThay = 0;
                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\n========== THONG TIN SACH ==========");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Nam xuat ban: " + namXuatBan[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);

                            timThay = 1;
                        }
                    }
                    if (timThay == 0) {
                        System.out.println("Khong tim thay sach co ma: " + maCanTim);
                    }
                    break;

                case 4:
                    System.out.println("\n========== DANH SACH SACH ==========");

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSach thu " + (i + 1));
                        System.out.println("Ma sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("Tac gia: " + tacGia[i]);
                        System.out.println("Nam xuat ban: " + namXuatBan[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}