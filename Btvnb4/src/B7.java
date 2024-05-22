import java.util.Scanner;

public class B7 {
    public static double bieuthuc (double a, double b, double x){
        return a / 30 + Math.pow(a,b) - (Math.sin(Math.PI * x / 3) / Math.sqrt(Math.pow(a + b,2) + 5) + Math.log(Math.pow(a,2) + 1) - Math.log(3) * (4*Math.pow(x, 2 *a ) +3 ));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double x;
        double ketQua;
        System.out.println("Moi ban nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Moi ban nhap b: ");
        b = scanner.nextDouble();
        System.out.println("Moi ban nhap x: ");
        x = scanner.nextDouble();
        ketQua = bieuthuc(a ,b, x);
        System.out.println("Vay ket qua cua bieu thuc la : " + ketQua);
    }
}
