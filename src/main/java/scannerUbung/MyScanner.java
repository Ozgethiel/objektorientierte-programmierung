package scannerUbung;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int a, b;
            int sum = 0;
            for (int i = 0; i < 5; i++) {

                {

                    System.out.println(" A sayisini giriniz");
                    a = input.nextInt();
                    System.out.println(" B sayisini giriniz");
                    b = input.nextInt();
                    sum = sum + (a * b);

                    System.out.println(sum);
                }
            }
        }
    }
