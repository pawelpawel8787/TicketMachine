import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int ticketCost = 4;
        int ticketsCount;
        int sumToPay;
        int paidAmount;
        Scanner skaner = new Scanner(System.in);

        System.out.println("Ile chcesz kupic biletów?");
        ticketsCount = skaner.nextInt();

        sumToPay = ticketCost * ticketsCount;
        System.out.println("Za " + ticketsCount + " biletów musisz zapłacić " + sumToPay + " zł.");
        System.out.println("Ile chcesz wpłacić?");
        paidAmount = skaner.nextInt();


        System.out.println("Zaplaciles kwotą równą " + paidAmount + " zł.");

        int amountToBack = paidAmount - sumToPay;
        System.out.println("Reszta wyniesie " + amountToBack + " zł.");


        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;
        int G = 0;
        int H = 0;

        int a = 200;
        int b = 100;
        int c = 50;
        int d = 20;
        int e = 10;
        int f = 5;
        int g = 2;
        int h = 1;

        int cashToPay;

        do {

            if (amountToBack >= 200) {
                A = amountToBack / a;
                cashToPay = amountToBack % 200;
                amountToBack = cashToPay;


            } else if (amountToBack >= 100) {
                B = amountToBack / b;
                cashToPay = amountToBack % 100;
                amountToBack = cashToPay;


            } else if (amountToBack >= 50) {
                C = amountToBack / c;
                cashToPay = amountToBack % 50;
                amountToBack = cashToPay;

            } else if (amountToBack >= 20) {
                D = amountToBack /d;
                cashToPay = amountToBack % 20;
                amountToBack = cashToPay;

            } else if (amountToBack >= 10) {
                E = amountToBack / e;
                cashToPay = amountToBack % 10;
                amountToBack = cashToPay;

            } else if (amountToBack >= 5) {
                F = amountToBack / f;
                cashToPay = amountToBack % 5;
                amountToBack= cashToPay;

            } else if (amountToBack >= 2) {
                G = amountToBack / g;
                cashToPay = amountToBack % 2;
                amountToBack= cashToPay;

            } else if (amountToBack >= 1) {
                H = amountToBack / h;
                cashToPay = amountToBack % 1;
                amountToBack= cashToPay;

            }
        }
        while (amountToBack!=0);

        System.out.println("Nominały: " + "\n200: " + A + "\n100: " + B +  "\n50: " + C +  "\n20: " + D +  "\n10: " + E +  "\n5: " + F +  "\n2: " + G +  "\n1: " + H);
    }


}




