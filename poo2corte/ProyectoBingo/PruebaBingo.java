package ProyectoBingo;

import java.util.Scanner;

public class PruebaBingo {
    public static void main(String[] args) {
        //  para generar el cartón
        int[][] carton = JuegoBingo.generarCartonAleatorio();
        JuegoBingo juego = new JuegoBingo(carton);

        
        System.out.println(" Tu cartón se ha generado:");
        mostrarCarton(carton);

        Scanner sc = new Scanner(System.in);
        boolean bingo = false;

        
        while (!bingo) {
            System.out.print("Ingresa un número del 1 al 90: ");
            int numero = sc.nextInt();

           
            if (juego.tacharNumero(numero)) {
                System.out.println("¡Tachado!");
            } else {
                System.out.println("Ese número no está  disponible en tu  cartón.");
            }

            // Verifica si hay una línea en el bingo
            if (!juego.isLineaCantada() && juego.hayLinea()) {
                System.out.println("¡linea!");
                juego.setLineaCantada(true);
            }

            // comprueba  si hay un bingo
            if (juego.hayBingo()) {
                System.out.println("¡¡Bingo!!");
                bingo = true;
            }
        }

        
    }

    
    public static void mostrarCarton(int[][] carton) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == 0) {
                    System.out.print("  _ ");
                } else {
                    System.out.printf("%3d ", carton[i][j]);
                }
            }
            System.out.println();
            
        }

    }
}



