import java.util.Scanner;

public class B1 {
    public static double dienTichhinhthang(double Daylon , double Daynho , double Chieucao){
        return (Daylon + Daynho ) * Chieucao / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Daylon;
        double Daynho;
        double Chieucao;
        System.out.println("Moi ban nhap do dai day lon: ");
        Daylon = scanner.nextDouble();
        System.out.println("Moi ban nhap do dai day nho: ");
        Daynho = scanner.nextDouble();
        System.out.println("Moi ban nhap chieu cao: ");
        Chieucao = scanner.nextDouble();
        double Dientich = dienTichhinhthang(Daylon,Daynho,Chieucao);
        System.out.println("Dien tich hinh thang la: " + Dientich);

    }
}