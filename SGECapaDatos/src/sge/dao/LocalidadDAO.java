/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.dao;

import java.util.List;
import javax.persistence.Query;
import org.eclipse.persistence.config.HintValues;
//import oracle.toplink.essentials.config.HintValues;
import org.eclipse.persistence.config.QueryHints;
import sge.entidades.Envio;
import sge.entidades.Localidad;
import sge.entidades.Provincia;
import sge.exception.ConectividadException;

/**
 *
 * @author Propietario
 */
public class LocalidadDAO extends DaoImp<Integer, Localidad> implements ILocalidadDAO  {

    public LocalidadDAO() throws ConectividadException {  
    }
    
    @Override
    public Localidad buscarLocalidadPorCodigo(Integer idLocalidad) {
       return findById(idLocalidad);
    }   
    
    @Override
    public Boolean actualizarLocalidad(Localidad aLocalidad) {
        
        Localidad localidadLoc = null;
        entityManager.getTransaction().begin();
        try {

           localidadLoc = entityManager.find(Localidad.class, aLocalidad.getId());

           localidadLoc.setHabilitado(aLocalidad.getHabilitado());
           localidadLoc.setCodigoPostal(aLocalidad.getCodigoPostal());
           localidadLoc.setNombre(aLocalidad.getNombre());
           
           entityManager.getTransaction().commit();
           return true;
      } catch (Exception e) {
           e.printStackTrace();
           entityManager.getTransaction().rollback();
           return false;
       } finally {
           entityManager.close();
           
       }
        
    }
    

}
