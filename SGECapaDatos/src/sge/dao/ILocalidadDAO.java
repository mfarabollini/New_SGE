/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.dao;

import java.util.List;
import sge.entidades.Cliente;
import sge.entidades.Localidad;
import sge.entidades.Provincia;

/**
 *
 * @author Propietario
 */
public interface ILocalidadDAO extends  IDao<Integer, Localidad> {
    Localidad buscarLocalidadPorCodigo(Integer codigo);   
    Boolean actualizarLocalidad(Localidad aLocalidad);
 

}
