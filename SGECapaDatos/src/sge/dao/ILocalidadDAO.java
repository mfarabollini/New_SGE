/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.dao;

import java.util.List;
import sge.entidades.Cliente;
import sge.entidades.Localidad;

/**
 *
 * @author Propietario
 */
public interface ILocalidadDAO extends  IDao<Integer, Localidad> {
    Localidad buscarLocalidadPorCodigo(Integer codigo);    

}
