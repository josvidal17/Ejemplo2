
package bitacora.clases;

import bitacora.clases.interfaces.Informacion;
import java.util.Date;


public class Soluciones implements Informacion <Soluciones> {

    private String inform;
    private String codigo;
    protected Date fechaEntrada;
    protected Date fechaModificacion;
    protected Date fechaEliminacion;
    
    /**
     * Podemos gestionar otros datos tales como: 
     * Priorida 
     * Movimiento
     * Estado
     * Para poder tener un mejor control sobre posibles incidencia del mismo tipo
    */
    
    
    //Metodo GET
    public String getInform(){
        return inform;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    //Metodo SET
    public Soluciones setInform(String inform){
        if(inform == null)
            throw new IllegalArgumentException("La solucion no puede ser NULL");
        /*Podemos comparar con length para saber su longitud de entrada de dato */
        this.inform = inform;
        fechaModificacion();
        return this;
    }
    
    public Soluciones setCodigo(String codigo){
        if(codigo == null)
            throw new IllegalArgumentException("El codigo no puede ser NULL");
        /*Podemos comparar que el codigo tiene una longitud con length*/
        this.codigo = codigo;
        return this;
    }
    
    @Override
    public Soluciones fechaEntrada() {
        Date fechaActual = new Date();
        this.fechaEntrada = fechaActual;
        return this;
    }

    @Override
    public Soluciones fechaModificacion() {
        Date fechaActual = new Date();
        this.fechaModificacion = fechaActual;
        return this;
    }

    @Override
    public Soluciones fechaEliminacion() {
        Date fechaActual = new Date();
        this.fechaEliminacion = fechaActual;
        return this;
    }

    @Override
    public boolean comparacion(Soluciones t) {
        if(t == null)
            throw new IllegalArgumentException("La solucion no puede ser null");
        return this.codigo.equals(t.codigo);
    }
 
   @Override
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    @Override
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }
    
}
