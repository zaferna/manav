import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double a,e,d,m,p,af,ef,df,mf,pf,total;
        af=2.14;
        ef=3.67;
        df=1.11;
        mf=0.95;
        pf=5;
        Scanner in = new Scanner(System.in);
        System.out.print("Armut Kg Gir:");
        a= in.nextDouble();
        System.out.print("Elma Kg Gir:");
        e= in.nextDouble();
        System.out.print("Domates Kg Gir:");
        d= in.nextDouble();
        System.out.print("Muz Kg Gir:");
        m= in.nextDouble();
        System.out.print("Patlican Kg Gir:");
        p= in.nextDouble();
        total = a*af+e*ef+m*mf+d*df+p*pf;
        System.out.print(total+"  TL");
    }
}
