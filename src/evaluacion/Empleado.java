package evaluacion;
/**
 * @author juani
 */
public class Empleado {
    private String nombre;
    private double sueldoBase=1000;
    private int anioIngreso;

    public Empleado(String nombre, int anioIngreso){
        this.nombre=nombre;
        this.anioIngreso=anioIngreso;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre!=null && nombre.trim().length()>=1 && nombre.trim().length()<=60) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre debe tener entre 1 y 60 caracteres y no puede estar vacío.");
        }
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        if(sueldoBase<1000 || sueldoBase>50000){
            System.err.println("El salario debe ser un valor entre 1,000 a 50,000");
            return;
        }
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        if(anioIngreso<2005 || anioIngreso>2024){
            System.err.println("El año de ingreso sólo puede ser desde 2005 hasta 2024");
            return;
        }
        this.anioIngreso = anioIngreso;
    }
   
    public void incrementarSueldo(int porcentaje){
        double res= sueldoBase+(sueldoBase*porcentaje/100);
        if(res>50000 || porcentaje<0){
            System.err.println("Los valores no pueden ser negativos ni sumar mas de 50,000");
            return;
        }
        setSueldoBase(res);
    }
    
    public double sueldoTotal(){
        return sueldoBase+(.05*(2024-anioIngreso));
    }
}
