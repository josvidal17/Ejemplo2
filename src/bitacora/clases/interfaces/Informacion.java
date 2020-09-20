
package bitacora.clases.interfaces;

import java.util.Date;


public interface Informacion<T> {
    T fechaEntrada(); /*Es un metodo que retorna el objeto que lo invoca para obtener la fecha de creacion*/
    T fechaModificacion(); /*Es un metodo que retorna el objeto que lo invoca para saber la fecha de modificacion*/
    T fechaEliminacion();  /*El un metodo que retorna el obejto que lo invoca para saber su fecha de eliminacion*/
    boolean comparacion(T t); /*Para comparar si el no se repite dicho objeto*/
    /*Podemos agregar otra comparacion para poder tratar otro tipo de dato*/
    
    Date getFechaEntrada();  /*Retorna la fecha de creacion */
    Date getFechaModificacion();  /*Retorna la fecha que fue modificado*/
    Date getFechaEliminacion(); /*Retorna cuando fue eliminado el objeto*/
}
