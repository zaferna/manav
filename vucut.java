import java.util.Scanner;

public class vucut {
    public static void main(String[] args) {
        int kg;
        double boy,BMI;
        Scanner inp= new Scanner(System.in);
        System.out.print("Vucut agirligi Gir (kg): ");
        kg = inp.nextInt();
        System.out.print("Boy Giriniz (m) :");
        boy = inp.nextDouble();
        BMI = kg/(boy*boy);
        System.out.print(BMI);
    }
}
