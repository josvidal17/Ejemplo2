
package bitacora.clases.usuarios;
import bitacora.clases.Usuario;
import bitacora.clases.enumerado.EstadoCivil;

public class Administrador extends Usuario{
    
    public Administrador(String pNombre, String sNombre, String pApellido,String sApellido, 
            int edad, String correo, String movil, String dni, String estadoCivil,String codigo) {
        
        super(pNombre, sNombre, pApellido,sApellido, edad, correo, movil, dni, estadoCivil,codigo);
    }
    
    public boolean comparar(Administrador a){
        return super.getCodigo().equals(a.getCodigo());
    }
            
    @Override
    public String toString(){
        return "Nombre completo: "+super.getPNombre()+" "+super.getSNombre()+" "+
                                   super.getPApellido()+" "+super.getSApellido()+"\n"+
                "Edad: "+super.getEdad()+"\n"+
                "Correo: "+getCorreo()+"\n"+
                "Movil: "+getMovil()+"\n"+
                "DNI: "+getDni()+"\n"+
                "Estado Civil: "+getEstadoCivil()+"\n"+
                "Codigo: "+getCodigo();
    }
}
