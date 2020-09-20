
package bitacora.clases.usuarios;
import bitacora.clases.Usuario;
import bitacora.clases.enumerado.EstadoCivil;

public class Telefonista extends Usuario{
    public Telefonista(String pNombre, String sNombre, String pApellido, String sApellido, int edad, String correo, String movil, String dni, String estadoCivil,String codigo){
        super(pNombre, sNombre, pApellido,sApellido, edad, correo, movil, dni, estadoCivil,codigo);
    }
}
