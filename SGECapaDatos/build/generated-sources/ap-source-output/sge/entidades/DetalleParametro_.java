package sge.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sge.entidades.Parametro;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-09-04T12:15:10")
@StaticMetamodel(DetalleParametro.class)
public class DetalleParametro_ { 

    public static volatile SingularAttribute<DetalleParametro, Long> id;
    public static volatile SingularAttribute<DetalleParametro, Boolean> habilitado;
    public static volatile SingularAttribute<DetalleParametro, String> codKey;
    public static volatile SingularAttribute<DetalleParametro, String> valor;
    public static volatile SingularAttribute<DetalleParametro, Parametro> parametro;
    public static volatile SingularAttribute<DetalleParametro, String> descripcion;

}