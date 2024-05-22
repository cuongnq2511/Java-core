import java.util.Scanner;

public class B5 {
    public static String nhapchuoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi bat ky");
        String chuoi = scanner.nextLine();
        return chuoi;
    }
    public static void hienthichuoi(String chuoi){
        System.out.println("Chuoi ban vua nhap la: " + chuoi);
    }
    public static void main(String[] args) {
        String chuoivuanhap = nhapchuoi();
        hienthichuoi(chuoivuanhap);
    }
}
