package pooObjetos;

public class Test {
    public static void main(String[] args) {
        Auto auto=new Auto("ABC123", "AZUL", "BMW",2025,1600,true);
        System.out.println("muestre su marca"+auto.marca);
        
        auto.color="blanco";
        System.out.println("color original: " +auto.color);
        auto.dimeSiesMetalizado();
        auto.pintarAuto("plata");
        System.out.println("color nuevo" +auto.color);

        Auto a2=new Auto(null, null, null, 0, 0);
        AutoP autoP=new AutoP("xyz896", "AZUL", "BMW",2025,1600,true);
        System.out.println("placa2 : "+autoP.getPlaca());

        autoP.setCilindraje(2500);
        System.err.println("cilingraje2 : "+ autoP.getCilindraje());
    }
   

}
