import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] soLuong = new int[5];
        ArrayList<String> danhSachSach = new ArrayList<String>();
        int chon;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }
        int tong = 0;
        int max = soLuong[0];
        for (int i = 0; i < 5; i++) {
            System.out.println("So luong sach thu " + (i + 1) + ": " + soLuong[i]);
            tong = tong + soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
        do {
            System.out.println("\n===== QUAN LY THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap don gia: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    String sach = ma + " - " + ten + " - " + tacGia
                            + " - " + sl + " - " + gia;
                    danhSachSach.add(sach);
                    System.out.println("Them sach thanh cong!");
                    break;
                }
                case 2: {
                    if (danhSachSach.size() == 0) {
                        System.out.println("Danh sach sach rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println(danhSachSach.get(i));
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    int viTri = -1;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String sach = danhSachSach.get(i);
                        if (sach.startsWith(ma + " - ")) {
                            viTri = i;
                            break;
                        }
                    }
                    if (viTri != -1) {
                        System.out.println("Thong tin sach: ");
                        System.out.println(danhSachSach.get(viTri));
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    int viTri = -1;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String sach = danhSachSach.get(i);
                        if (sach.startsWith(ma + " - ")) {
                            viTri = i;
                            break;
                        }
                    }
                    if (viTri != -1) {
                        danhSachSach.remove(viTri);
                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Nhap ma sach can sua: ");
                    String ma = sc.nextLine();
                    int viTri = -1;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String sach = danhSachSach.get(i);
                        if (sach.startsWith(ma + " - ")) {
                            viTri = i;
                            break;
                        }
                    }
                    if (viTri != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap tac gia moi: ");
                        String tacGia = sc.nextLine();
                        System.out.print("Nhap so luong moi: ");
                        int sl = sc.nextInt();
                        System.out.print("Nhap don gia moi: ");
                        double gia = sc.nextDouble();
                        sc.nextLine();
                        String sach = ma + " - " + ten + " - " + tacGia
                                + " - " + sl + " - " + gia;
                        danhSachSach.set(viTri, sach);
                        System.out.println("Sua sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                case 6: {
                    int tongSL = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String sach = danhSachSach.get(i);
                        String[] thongTin = sach.split(" - ");
                        int sl = Integer.parseInt(thongTin[3]);
                        tongSL = tongSL + sl;
                    }
                    System.out.println("Tong so luong sach: " + tongSL);
                    break;
                }
                case 7: {
                    double tongGiaTri = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String sach = danhSachSach.get(i);
                        String[] thongTin = sach.split(" - ");
                        int sl = Integer.parseInt(thongTin[3]);
                        double gia = Double.parseDouble(thongTin[4]);
                        tongGiaTri = tongGiaTri + sl * gia;
                    }
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                }
                case 8:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
        sc.close();
    }
}