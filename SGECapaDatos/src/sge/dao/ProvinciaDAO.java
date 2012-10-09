/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.dao;

import java.util.List;
import javax.persistence.Query;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;
import sge.entidades.Localidad;
import sge.entidades.Provincia;
import sge.exception.ConectividadException;

/**
 *
 * @author Marcos
 */
public class ProvinciaDAO extends DaoImp<Integer, Provincia> implements IProvinciaDAO  {
    public ProvinciaDAO() throws  ConectividadException {
        
    }

    @Override
    public Provincia buscarPorCodigo(Integer codigo) {
        return findById(codigo);
    }
    
    @Override
    public Provincia buscarPorNombre(String nombre) {
        Query q = entityManager.createQuery(            
        "SELECT e FROM " + entityClass.getSimpleName()  + " e WHERE e.nombre = :parnombre" );
        q.setParameter("parnombre",nombre );  
        q.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return (Provincia) q.getSingleResult();
    }

    @Override
    public List<Provincia> buscarTodas() {
                
        Query q = entityManager.createQuery(            
        "SELECT e FROM " + entityClass.getSimpleName()  + " e" );
        q.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return (List<Provincia>) q.getResultList();
    }
    
}