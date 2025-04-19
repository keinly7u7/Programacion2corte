package IBMSW;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    
    public Empleado() {}

    
    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        setEdad(edad); 
        this.casado = casado;
        this.salario = salario;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    public void clasificar() {
        if (edad <= 21) {
            System.out.println("Principiante");
        } else if (edad <= 35) {
            System.out.println("Intermedio");
        } else {
            System.out.println("Senior");
        }
    }

    public void subirSalario(int porcentaje) {
        salario += salario * (porcentaje / 100.0);
    }

    
    @Override
    public String toString() {
        return "Empleado:\n" +
               "Nombre: " + nombre + "\n" +
               "DNI: " + dni + "\n" +
               "Edad: " + edad + "\n" +
               "Casado: " + (casado ? "Sí" : "No") + "\n" +
               "Salario: $" + salario;
    }
}
