import java.util.Scanner;

public class B4 {
    public static Integer nhapso(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so ");
        int so = scanner.nextInt();
        return so;
    }
    public static void hienthi(int so){
        System.out.println("So ban vua nhap la: " + so);
    }
    public static void main(String[] args) {
        int soVuaNhap = nhapso();
        hienthi(soVuaNhap);
    }
}
