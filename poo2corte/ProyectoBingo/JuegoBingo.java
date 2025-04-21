package ProyectoBingo;

import java.util.Random;

public class JuegoBingo implements Icarton {
    private int[][] carton;
    private boolean[][] tachado;
    private boolean lineaCantada;
    public JuegoBingo(int[][] carton) {
       
        if (!cartonValido(carton)) {
            throw new IllegalArgumentException("Cartón inválido.");
             //para lanzar una excepción (error controlado).
         //Es decir, detener el programa y mostrar un mensaje si ocurre algo que no debería pasar.

        }
        this.carton = carton;
        this.tachado = new boolean[3][9];
        this.lineaCantada = false;
     }
    public int[][] getCarton() {
        return carton;
    }
    public void setCarton(int[][] nuevoCarton) {
        if (cartonValido(nuevoCarton)) {
        this.carton = nuevoCarton;
        this.tachado = new boolean[3][9];
       }
    }
    public boolean isLineaCantada() {
        return lineaCantada;
    }
    public void setLineaCantada(boolean lineaCantada) {
        this.lineaCantada = lineaCantada;
    }
    //verifica si el numero esta en el carton del bingo//
    public boolean tacharNumero(int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == numero) {
                    tachado[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }
  //metodo "hay linea" es para verificar si el bingo esta completo\\
    public boolean hayLinea() {
        for (int i = 0; i < 3; i++) {
            boolean completa = true;
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] != 0 && !tachado[i][j]) {
                    completa = false;
                    break;
                }
            }
            if (completa) return true;
        }
        return false;
    }
    public boolean hayBingo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] != 0 && !tachado[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean cartonValido(int[][] carton) {
        // Validar que el tamaño es de  3x9
        if (carton.length != 3) return false;
        for (int i = 0; i < 3; i++) {
            if (carton[i].length != 9) return false;
        }
    
        // arreglo para ver si un número ya apareció
        boolean[] usados = new boolean[91]; // índices del 1 al 90
    
        // para revisar cada fila
        for (int i = 0; i < 3; i++) {
            int cantidadNumeros = 0;
    
            for (int j = 0; j < 9; j++) {
                int num = carton[i][j];
    
                if (num != 0) {
                    // Validar el rango
                    if (num < 1 || num > 90) return false;
    
                    // Verificar que no se repita
                    if (usados[num]) return false;
                    usados[num] = true;
    
                    cantidadNumeros++;
                }
            }
    
            // Cada fila debe tener 5 números
            if (cantidadNumeros != 5) return false;
        }
    
        
        return true;
    }
    public static int[][] generarCartonAleatorio() {
        int[][] carton = new int[3][9];
        Random random = new Random();
        boolean[] usados = new boolean[91]; // Para evitar repetir números
    
        // Lista de columnas por fila
        for (int fila = 0; fila < 3; fila++) {
            int numerosEnFila = 0;
            while (numerosEnFila < 5) {
                int col = random.nextInt(9);
                if (carton[fila][col] == 0) {
                    int min = col * 10 + 1;
                    int max = (col == 8) ? 90 : (col + 1) * 10;
                    int num;
    
                    do {
                        num = random.nextInt(max - min) + min;
                    } while (usados[num]);
    
                    carton[fila][col] = num;
                    usados[num] = true;
                    numerosEnFila++;
                }
            }
        }
    
        return carton;
    }
    
    // Método para mostrar el cartón
    public static void mostrarCarton(int[][] carton) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == 0) {
                    System.out.print(" \t"); // espacio vacío
                } else {
                    System.out.print(carton[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
    
}

