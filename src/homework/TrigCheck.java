package src.homework;

import java.util.Locale;
import java.util.Scanner;

public class TrigCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double h = input.nextDouble();
        double EPS = 1e-12;
        double twoPi = 2 * Math.PI;
        boolean found = false;
        double badX = 0, badA = 0, badB = 0;
        int i = 0;

        while (true){
            double x = i * h;
            if (x > twoPi + 1e-9){
                break;
            }

            double a = Math.sin(Math.cos(x));
            double b = Math.cos(Math.sin(x));

            if (a <= b + EPS){
                found = true;
                badX = x;
                badA = a;
                badB = b;
                break;
            }

            if (x >= twoPi - 1e-9){
                break;
            }

            i++;
        }
        if (!found){
            System.out.println("Утверждение верно");
        }
        else{
            System.out.println("Утверждение неверно");
            System.out.printf(Locale.US, "x=%.6f%n", badX);
            System.out.printf(Locale.US, "sin(cos(x))=%.12f%n", badA);
            System.out.printf(Locale.US, "cos(sin(x))=%.12f%n", badB);
        }
    input.close();    
    }
}
