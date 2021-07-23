package laboratorio_07ed;

public class Empleado {
    public String nombres;
    public String apMat;
   public  String apPat;
    public double sueldoBase;
    public double ventasRea;
    public String estadoCivil;
    public int    numHijos;
    public double sueldoNeto;
    
    public Empleado(String nombres, String apMat, String apPat, double sueldoBase, double ventasRea, String estadoCivil, int numHijos, double sueldoNeto) {
        this.nombres = nombres;
        this.apMat = apMat;
        this.apPat = apPat;
        this.sueldoBase = sueldoBase;
        this.ventasRea = ventasRea;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
        this.sueldoNeto = sueldoNeto;
    }
}
