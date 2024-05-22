import java.util.Scanner;

class HocSinh {
    public String hoTen;
    public int tuoi;
    public String lop;

    public HocSinh(String ten, int tuoiHocSinh, String lopHocSinh ) {
        hoTen = ten;
        tuoi = tuoiHocSinh;
        lop = lopHocSinh;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên học sinh là : " + hoTen);
        System.out.println("Tuổi học sinh là : " + tuoi);
        System.out.println("Lớp học sinh là : " + lop);
    }
}

public class B6 {
    public static HocSinh nhapThongTinHocSinh() {
        Scanner scanner = new Scanner(System.in);

        String hoTen;
        int tuoi;
        String lop;

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập lớp: " );
        lop = scanner.nextLine();

        return new HocSinh(hoTen, tuoi, lop);
    }

    public static void main(String[] args) {
        HocSinh hocSinh = nhapThongTinHocSinh();
        hocSinh.hienThiThongTin();
    }
}