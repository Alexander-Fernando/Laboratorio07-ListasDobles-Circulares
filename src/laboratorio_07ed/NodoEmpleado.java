package laboratorio_07ed;


public class NodoEmpleado {
    public Empleado dato;
    public NodoEmpleado siguiente;
    public NodoEmpleado anterior;
    
    public NodoEmpleado (Empleado empleado){
        this(empleado, null, null);
    }
    
    public NodoEmpleado(Empleado empleado, NodoEmpleado s, NodoEmpleado a){
        this.dato = empleado;
        siguiente = s;
        anterior  = a;
    }
}
