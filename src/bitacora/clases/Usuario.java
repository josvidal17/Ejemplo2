/**
 * La clase usuario es principal y de ella heredaran los distintos objetos tales como:
 * Administrador
 * Directivo 
 * Jefe de los técnicos
 * Telefonista
 * Técnico
 * 
 * Será la clase principal para ejecutar las distintos objetos
 */
package bitacora.clases;
import bitacora.clases.enumerado.EstadoCivil;

public class Usuario {
    
    /**
     * Declaramos las variables que componen a un USUARIO
    */
    
    private String pNombre; /*El primer nombre del usuario*/
    private String sNombre; /*El segundo nombre del usuario*/
    private String pApellido; /*El primer apellido del usuario*/
    private String sApellido; /*El segundo apellido del usuario*/
    private int edad; /*La edad del usuario*/
    private String correo; /*El correo del usuario*/
    private String movil; /*El movil del usuario*/
    private String dni; /*El DNI del usuario*/
    private EstadoCivil estadoCivil = EstadoCivil.soltero; /*El estado civil del usuario inicializado en soltero*/
    private String codigo; /*Es el codigo por cada uno de los usuarios*/
    /**
     * Creamos los metodos Get para mostrar los atributos de la clase
    */
    public String getPNombre(){
        return pNombre;
    }
    
    public String getSNombre(){
        return sNombre;
    }
    
    public String getPApellido(){
        return pApellido;
    }
    
    public String getSApellido(){
        return sApellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getMovil(){
        return movil;
    }
    
    public String getDni(){
        return dni;
    }
    
    public EstadoCivil getEstadoCivil(){
        return estadoCivil;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    /**
     * Creamos los metodos set para manipular de manera correcta los datos
     * proporcionado por el usuario
    */
    
     public Usuario setPNombre(String pNombre){
         if(pNombre==null)
              throw new IllegalArgumentException("El primer nombre no puede ser NULL");
         if(pNombre.length()<3) /* WARNING Podemos manejar este datos de otra manera*/
             throw new IllegalArgumentException("EL primer nombre no es una palabra");
         if(pNombre.equals(""))
            throw new IllegalArgumentException("El primer nombre no puede ser vacio");         
        this.pNombre = pNombre;
        return this;
    }
    
    public Usuario setSNombre(String sNombre){
        if(sNombre==null)
              throw new IllegalArgumentException("El segundo nombre no puede ser NULL");
         if(sNombre.length()<3)/* WARNING Podemos manejar este datos de otra manera*/
             throw new IllegalArgumentException("EL segundo nombre no es una palabra");
         if(sNombre.equals(""))
            throw new IllegalArgumentException("El segundo nombre no puede ser vacio");
        this.sNombre = sNombre;
        return this;
    }
    
    public Usuario setPApellido(String pApellido){
        if(pApellido==null)
              throw new IllegalArgumentException("El primero apellido no puede ser NULL");
         if(pApellido.length()<3)
             throw new IllegalArgumentException("EL primero apellido no es una palabra");
         if(pApellido.equals(""))
            throw new IllegalArgumentException("El primer apellido no puede ser vacio");
        this.pApellido = pApellido;
        return this;
    }
    
    public Usuario setSApellido(String sApellido){
        if(sApellido==null)
              throw new IllegalArgumentException("El segundo apellido no puede ser NULL");
        if(sApellido.length()<3)
             throw new IllegalArgumentException("EL segundo apellido no es una palabra");
        if(sApellido.equals(""))
            throw new IllegalArgumentException("El segundo apellido no puede ser vacio"); 
        this.sApellido = sApellido;
        return this;
    }
    
    public Usuario setEdad(int edad){
        if(edad<=0 || edad >120)
            throw new IllegalArgumentException("La edad tiene que ser mayor a 0 y menor que 120");
        this.edad = edad;
        return this;
    }
    
    public Usuario setCorreo(String correo){
        if(correo==null)
              throw new IllegalArgumentException("El correo no puede ser NULL");
         
        this.correo = correo;
        return this;
    }
    
    public Usuario setMovil(String movil){
        if(movil==null)
              throw new IllegalArgumentException("El movil no puede ser NULL");
        if(!movil.matches("[0-9]{9}"))
             throw new IllegalArgumentException("El numero movil consta de 9 digitos");
         
        this.movil = movil;
        return this;
    }
    
    public Usuario setDni(String dni){
        if(dni==null)
              throw new IllegalArgumentException("El DNI no puede ser NULL");
        if(!dni.matches("[aA-zZ][0-9]{6}[aA-zZ]$") && !dni.matches("[0-9]{8}[aA-zZ]$")) 
             throw new IllegalArgumentException("La documentacion no es la correcta");
        /*if(!dni.matches("[0-9]{8}[a-z]$")) 
             throw new IllegalArgumentException("EL NIE inicia con una letra A-Z y 6 numero terminado con una letra A-Z");*/
        this.dni = dni;
        return this;
    }
    
    public Usuario setEstadoCivil(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        return this;
    }
    
    //Estado civil escogido por numero
    public Usuario setEstadoCivil(int estadoCivil){
        if(estadoCivil-1<0 || estadoCivil-1>EstadoCivil.values().length)
            throw new IllegalArgumentException("1 soltero,\n 2 casado,\n 3 viudo,\n 4 divorciado,\n 5 comprometido");
          
        this.estadoCivil = EstadoCivil.values()[estadoCivil-1];
        return this;
    }    
    
    //Estado civil por String 
    public Usuario setEstadoCivil(String estadoCivil){
        if(estadoCivil==null)
            throw new IllegalArgumentException("El estado civil no puede ser NULL");
        
        if(!estadoCivil.equals("soltero") &&
           !estadoCivil.equals("casado") &&
           !estadoCivil.equals("viudo") &&
           !estadoCivil.equals("divorciado") &&
           !estadoCivil.equals("comprometido"))
            throw new IllegalArgumentException("Tiene que ser soltero-casado-viudo-divorciado-comprometido");
        
        this.estadoCivil = EstadoCivil.valueOf(estadoCivil);
        return this;
    }
    
    public Usuario setCodigo(String codigo){
        if(codigo == null)
            throw new IllegalArgumentException("El codigo no puede ser NULL");
        if(!codigo.matches("[0-9]{3}"))
            throw new IllegalArgumentException("El codigo es incorrecto");
        this.codigo = codigo;
        return this;
    }
    
    /**
     * Creamos el constructor del objeto USUARIO
    */
    
    public Usuario(String pNombre,String sNombre,String pApellido,String sApellido,int edad, String correo, String movil, String dni, String estadoCivil,String codigo){
        setPNombre(pNombre);
        setSNombre(sNombre);
        setPApellido(pApellido);
        setPApellido(sApellido);
        setEdad(edad);
        setCorreo(correo);
        setMovil(movil);
        setDni(dni);
        setEstadoCivil(estadoCivil);
        setCodigo(codigo);
    }
    
    

}
