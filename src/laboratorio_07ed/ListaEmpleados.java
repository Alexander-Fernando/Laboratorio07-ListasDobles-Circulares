package laboratorio_07ed;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListaEmpleados {
    Scanner sc = new Scanner (System.in);
    public  NodoEmpleado inicio;
    public NodoEmpleado fin;
    
    
    public ListaEmpleados(){
        inicio = fin = null;
    }
    
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    
    public void agregarAlFinal(Empleado emp){
        if(!estaVacia()){
            fin = new NodoEmpleado(emp, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new NodoEmpleado(emp);
        }
    }
    
    
    public void agregarAlInicio(Empleado emp){
        if(!estaVacia()){
            inicio = new NodoEmpleado(emp, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoEmpleado(emp);
        }
    }
    
    public void mostrarListaInicioFin(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoEmpleado auxiliar = inicio;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "] <=> ";
                auxiliar = auxiliar.siguiente;
            }
            
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostranto Empleados Inicio a Fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            String datos = " <=> ";
            NodoEmpleado auxiliar = fin;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "] <=> ";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Empleado Fin a Inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public Empleado eliminarDelInicio(){
        Empleado elemento = inicio.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    public Empleado eliminarDelFinal(){
        Empleado elemento = fin.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        
        return elemento;
    }
}
