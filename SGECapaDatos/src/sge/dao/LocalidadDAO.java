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
import sge.entidades.Localidad;
import sge.exception.ConectividadException;

/**
 *
 * @author Propietario
 */
public class LocalidadDAO extends DaoImp<Integer, Localidad> implements ILocalidadDAO  {

    public LocalidadDAO() throws ConectividadException {  
    }
    

}
