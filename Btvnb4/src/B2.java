import java.util.Scanner;

public class B2 {
    public static double chuvi (double Canhthunhat, double Canhthuhai, double Canhthuba){
        return Canhthunhat + Canhthuhai + Canhthuba;
    }

    public static double dientich(double Canhthunhat, double Canhthuhai, double Canhthuba){
        double nuachuvi = (Canhthunhat + Canhthuhai + Canhthuba) / 2;
        return Math.sqrt(nuachuvi * (nuachuvi - Canhthunhat) * (nuachuvi - Canhthuhai) * (nuachuvi - Canhthuba));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Canhthunhat;
        double Canhthuhai;
        double Canhthuba;

        System.out.println("Moi ban nhap canh thu nhat: ");
        Canhthunhat = scanner.nextDouble();
        System.out.println("Moi ban nhap canh thu hai: ");
        Canhthuhai = scanner.nextDouble();
        System.out.println("Moi ban nhap canh thu ba: ");
        Canhthuba = scanner.nextDouble();
        double chuvi = chuvi( Canhthunhat,  Canhthuhai,  Canhthuba);
        double dientich = dientich( Canhthunhat,  Canhthuhai,  Canhthuba);
        System.out.println("Chu vi hinh tam giac la: " + chuvi);
        System.out.println("Dien tich hinh tam giac la: " + dientich);

    }
}
