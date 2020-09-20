
package bitacora.clases;
import bitacora.clases.interfaces.Informacion;
import java.util.Date;

public class Producto implements Informacion<Producto>{

    private String nombre; /*Es el nombre de un producto*/
    private String codigo; /*Es el codigo de un producto*/
    protected Date fechaEntrada; /*La fecha de cual es creada*/
    protected Date fechaModificacion; /*La fecha cuando se hace un movimiento o modificacion de unos de sus atrivutos*/
    protected Date fechaEliminacion; /*La fecha cuando es eliminado un producto*/
    protected String codigoUsuario; /*El codigo del usuario que guardo el producto en el momento, para tener un registro*/
    
    //Metodos Get
    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getCondigoUsuario(){
        return codigoUsuario;
    }
    
    //Metodos Set
    public Producto setNombre(String nombre){
        if(nombre == null)
            throw new IllegalArgumentException("El nombre no puede ser NULL");
        if(!nombre.matches("[A-Z][a-z]*")) /*Se cambiare por saber cuantos carecteres tiene con length*/
            throw new IllegalArgumentException("No es producto valido");
        this.nombre = nombre;
        fechaModificacion();
        return this;
    }
    
    public Producto setCodigo(String codigo){
        if(codigo == null)
            throw new IllegalArgumentException("El codigo no puede ser NULL");
        this.codigo = codigo;
        fechaModificacion();
        return this;
    }
    
    @Override
    public Producto fechaEntrada(){
        Date fechaActual = new Date();
        this.fechaEntrada = fechaActual;
        return this;
    }

    @Override
    public Producto fechaModificacion(){
        Date fechaActual = new Date();
        this.fechaModificacion = fechaActual;
        return this;
    }

    @Override
    public Producto fechaEliminacion() {
        Date fechaActual = new Date();
        this.fechaEliminacion = fechaActual;
        return this;
    }

    @Override
    public boolean comparacion(Producto t) {
        if(t == null)
            throw new IllegalArgumentException("La incidencia no puede ser NULL");
        return getCodigo().equals(t.codigo);
    }
    
    @Override
    public Date getFechaModificacion(){
        return fechaModificacion;
    }
    
    @Override
    public Date getFechaEntrada(){
        return fechaEntrada;
    }
    
    @Override
    public Date getFechaEliminacion(){
        return fechaEliminacion;
    }
    
    public Producto(String nombre, String codigo){
        setNombre(nombre);
        setCodigo(codigo);
        fechaEntrada();
        /*Recordar que tenemos que poner el codigo del usuario que grabo el producto*/
    }
}
