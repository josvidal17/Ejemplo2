
package bitacora.clases.usuarios;
import bitacora.clases.Usuario;
import bitacora.clases.enumerado.EstadoCivil;
        
public class Directivo extends Usuario{
    
    public Directivo(String pNombre, String sNombre, String pApellido,String sApellido, int edad, String correo, String movil, String dni, String estadoCivil, String codigo){
        super(pNombre, sNombre, pApellido,sApellido, edad, correo, movil, dni, estadoCivil,codigo);
    }
}
