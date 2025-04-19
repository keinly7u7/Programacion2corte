package IBMSW;

public class Test {
    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Juan Pérez", "12345678A", 25, false, 1500);
        System.out.println(emp);
        emp.clasificar();
        emp.subirSalario(10);
        System.out.println("Salario tras subir 10%: $" + emp.getSalario());

        System.out.println("\n---------------------\n");

        
        Programador prog = new Programador("Lucía Gómez", "98765432B", 30, true, 2000, 120, "Java");
        System.out.println(prog);
        prog.clasificar(); 
    }
}