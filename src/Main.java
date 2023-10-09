import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Manavdaki ürünler
        double cucumber = 3.14;
        double apple = 4.11;
        double pumpkin = 2.22;
        double tomato = 0.95;
        double aubergine = 7.00;

        System.out.print("Salatalık kaç kilo? ");
        double cucumberKg = scan.nextDouble();

        System.out.print("Elma kaç kilo? ");
        double appleKg = scan.nextDouble();

        System.out.print("Kabak kaç kilo? ");
        double pumpkinKg = scan.nextDouble();

        System.out.print("Domates kaç kilo? ");
        double tomatoKg = scan.nextDouble();

        System.out.print("Patlıcan kaç kilo? ");
        double aubergineKg = scan.nextDouble();

        double total = 0;
        total += (cucumber * cucumberKg);
        total += (apple * appleKg);
        total += (pumpkin * pumpkinKg);
        total += (tomato * tomatoKg);
        total += (aubergine * aubergineKg);
        System.out.println("Sepet toplamınız: " + total);
    }
}