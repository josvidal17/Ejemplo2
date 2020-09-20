
package bitacora.clases;
import bitacora.clases.interfaces.Informacion;
import java.util.Date;
import bitacora.clases.enumerado.Estado;
import bitacora.clases.enumerado.Movimiento;
import bitacora.clases.enumerado.Prioridad;
     
public class Incidencia implements Informacion<Incidencia>{
    private String contexto; /*Contiene la infomacion en palabras para su devida informacion*/
    private String codigoTecnico = "DESCONOCIDO"; /*Contiene el codigo del Tecnico que tiene asignada*/
    private String codigoIncidencia; /*Se le asigna un codigo para su devida informacion y guardarla y buscarla*/
    private String codigoSoluiones[]; /*Es un vector para saber los codigos de las soluciones que tiene establecido*/
    protected Date fechaEntrada; /*Es la fecha con cual fue creada obteniendo la fecha del sistema*/
    protected Date fechaModificacion; /*Es la fecha de su ultima modificacion*/
    protected Date fechaEliminacion; /*Es cuando la incidencia se elimina se guarda la fecha la cual fue eliminada*/
    private Estado estado; /*Ocupamos un enumerado para poder designar un estado ya establecido*/
    private Movimiento movimiento; /*Ocupamos un enumerado para poder desingnar un movimiento establecido*/
    private Prioridad prioridad; /*Ocupamos un enumerado para poder designar una prioridad establecida*/
    private String producto; /*Ocupamos un enumerado para poder designar una producto establecido*/
    private int totalSoluciones; /*Es la cantidad de soluciones que tiene asignada, puede ser una arreglo*/
    
    //Metodos GET
    public String getContexto(){
        return contexto;
    }
    
    public String getCodigoTecnico(){
        return codigoTecnico;
    }
    
    public String getCodigoIncidencia(){
        return codigoIncidencia;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public Movimiento getMovimiento(){
        return movimiento;
    }
    
    public Prioridad getPrioridad(){
        return prioridad;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public String[] getCodigoSoluciones(){
        return codigoSoluiones;
    }
    
    public int getTotalSoluciones(){
        return totalSoluciones;
    }
    
    //Metodos SET
    public Incidencia setContexto(String contexto){
        if(contexto.length()<15)
            throw new IllegalArgumentException("Tiene pocos caracteres, tiene que agregar mas");
        this.contexto = contexto;
        fechaModificacion();
        return this;
    }
    
    public Incidencia setCodigoTecnico(String codigoTecnico){
        if(codigoTecnico==null)
            throw new IllegalArgumentException("El codigo del tecnico no puede ser NULL");
        this.codigoTecnico = codigoTecnico;
        fechaModificacion();
        return this;
    }
    
    public Incidencia setCodigoIncidencia(String codigoIncidencia){
        if(codigoIncidencia==null)
            throw new IllegalArgumentException("El codigo de la incidencia no puede ser NULL");
        this.codigoIncidencia = codigoIncidencia;
        fechaModificacion();
        return this;
    }
    
    //El estado lo pasaremos con un String para trabajar mejor
    public Incidencia setEstado(String estado){
        if(estado==null)
            throw new IllegalArgumentException("El estado no puede ser NULL");
        if(! estado.equals("estado") &&
           ! estado.equals("estado2") &&
           ! estado.equals("estado3"))
            throw new IllegalArgumentException("Valor incorrecto");
        this.estado = Estado.valueOf(estado);
        fechaModificacion();
        return this;
    }
    
    public Incidencia setMovimiento(String movimiento){
        if(estado==null)
            throw new IllegalArgumentException("El movimiento no puede ser NULL");
        if(! movimiento.equals("movi_1") &&
           ! movimiento.equals("movi_2") &&
           ! movimiento.equals("movi_3"))
            throw new IllegalArgumentException("Valor incorrecto");
        this.movimiento = Movimiento.valueOf(movimiento);
        fechaModificacion();
        return this;
    }
    
    public Incidencia setPrioridad(String prioridad){
        if(prioridad==null)
            throw new IllegalArgumentException("El prioridad no puede ser NULL");
        if(! prioridad.equals("alta") &&
           ! prioridad.equals("baja") &&
           ! prioridad.equals("media"))
            throw new IllegalArgumentException("Valor incorrecto");
        this.prioridad = Prioridad.valueOf(prioridad);
        fechaModificacion();
        return this;
    }
    
    public Incidencia setCodigoSoluciones(String[] codigoSoluciones){
        
        return this;
    }
    
    public Incidencia setProducto(String producto){
        this.producto = producto;
        return this;
    }
    
    @Override
    public Incidencia fechaEntrada(){
        Date fechaActual = new Date();
        fechaEntrada = fechaActual;
        return this;
    }
    
    @Override
    public Incidencia fechaModificacion(){
        Date fechaActual = new Date();
        fechaModificacion = fechaActual;
        return this;
    }
    
    @Override
    public Incidencia fechaEliminacion(){
        Date fechaActual = new Date();
        fechaEliminacion = fechaActual;
        return this;
    }
    
    @Override
    public boolean comparacion(Incidencia t){
        if(t == null)
            throw new IllegalArgumentException("La incidencia no puede ser NULL");
        return getCodigoIncidencia().equals(t.codigoIncidencia);
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
 
    
    public Incidencia(String contexto, String codigoTecnico, String codigoIncidencia, String estado, String movimiento,String prioridad){
        setContexto(contexto);
        setCodigoTecnico(codigoTecnico);
        setCodigoIncidencia(codigoIncidencia);
        setEstado(estado);
        setMovimiento(movimiento);
        setPrioridad(prioridad);
        fechaEntrada();
    }
    
    
    
}
