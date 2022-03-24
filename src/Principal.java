public class Principal {    
    public static void main(String[] args) { 
        Coche c = new Coche();
               
        System.out.println("la marca es: " + c.marca);
        System.out.println("modelo: " +c.modelo);
        System.out.println("color: " +c.color);
        System.out.println("potenci del motor: " +c.caballos);
        System.out.println("numero de puertas: " +c.puertas);
        System.out.println("placa: " +c.matricula);
        c.probrar_coche();
        c.prenda();
        c.encienda();
        c.fenar();
               
    }
}
