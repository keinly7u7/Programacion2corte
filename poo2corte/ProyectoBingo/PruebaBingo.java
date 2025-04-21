package ProyectoBingo;

import java.util.Scanner;

public class PruebaBingo {
    public static void main(String[] args) {
        //  para generar el cartón
        int[][] carton = JuegoBingo.generarCartonAleatorio();
        JuegoBingo juego = new JuegoBingo(carton);

        
        System.out.println("Cartón generado:");
        mostrarCarton(carton);

        Scanner sc = new Scanner(System.in);
        boolean bingo = false;

        // para comenzar
        while (!bingo) {
            System.out.print("Ingresa un número (1-90): ");
            int numero = sc.nextInt();

            // tachar el número
            if (juego.tacharNumero(numero)) {
                System.out.println("¡Tachado!");
            } else {
                System.out.println("Ese número no está en el cartón.");
            }

            // Verificar si hay una línea en el bingo
            if (!juego.isLineaCantada() && juego.hayLinea()) {
                System.out.println("¡LÍNEA!");
                juego.setLineaCantada(true);
            }

            // Verificar si hay un bingo
            if (juego.hayBingo()) {
                System.out.println("¡¡BINGO!!");
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



