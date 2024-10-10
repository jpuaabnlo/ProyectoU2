package evaluacion;

/**
 * @author juani
 */
public class Evaluacion {
    public static void main(String[] args) {
        Empleado p=new Empleado("Alex",2015);
        System.out.println(p.getNombre());
        System.out.println(p.getSueldoBase());
        System.out.println(p.getAnioIngreso());
        p.incrementarSueldo(30);
    }
    
}
