import java.util.Scanner;

public class B3 {
    public static double chuvi (double banKinh) {
        return 2 * Math.PI * banKinh;
    }
    public  static double dientich (double banKinh){
        return Math.PI * banKinh * banKinh;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double banKinh;
        System.out.println("Moi ban nhap ban kinh cua hinh tron: ");
        banKinh = scanner.nextDouble();
        double chuvihinhtron = chuvi(banKinh);
        double dientichhinhtron = dientich(banKinh);
        System.out.println("Diện tích của hình tròn là: " + dientichhinhtron );
        System.out.println("Chu vi hinh tron la: " + chuvihinhtron);

    }
}
