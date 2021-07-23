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
    public double comision;
    public int    descSeguro;
    public double descImpuestos;
    
    public Empleado(String nombres, String apMat, String apPat, double sueldoBase, double ventasRea, String estadoCivil, int numHijos, double sueldoNeto, double comision, int descSeguro, double descImpuestos) {
        this.nombres = nombres;
        this.apMat = apMat;
        this.apPat = apPat;
        this.sueldoBase = sueldoBase;
        this.ventasRea = ventasRea;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
        this.sueldoNeto = sueldoNeto;
        this.comision = comision;
        this.descSeguro = descSeguro;
        this.descImpuestos = descImpuestos;
    }
}
