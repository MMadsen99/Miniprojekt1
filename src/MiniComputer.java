import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        System.out.println("\nVelkommen til minicomputer!\n\nVælg et program med tallene:");
        System.out.println("\n1. Terninge Kast \n2. Renters Rente\n3. ASCII Kunst \n4. Konverter \n5. Rock Paper Scissors \n6. Luk Computer");

        Scanner input = new Scanner(System.in);

            int x = input.nextInt();
            Boolean flipped = true;
            while (flipped) {
                switch (x) {
                    case 1:
                        Terning.main(null);
                        break;
                    case 2:
                        RentersRente.main(null);
                        break;
                    case 3:
                        ASCII_Art.main(null);
                        break;
                    case 4:
                        Convert.main(null);
                        break;
                    case 5:
                    StenSaksPapir.main(null);
                        break;
                    case 6:
                        flipped = false;
                        break;
                    default:
                        System.out.println("Vælg et af de givne muligheder..");
                        break;
                }
                System.out.println("Farvel!");
            }
        }

    }

}


