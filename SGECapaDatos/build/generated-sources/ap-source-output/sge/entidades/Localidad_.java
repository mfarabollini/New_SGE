package sge.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sge.entidades.Provincia;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-09-04T12:15:10")
@StaticMetamodel(Localidad.class)
public class Localidad_ { 

    public static volatile SingularAttribute<Localidad, Integer> id;
    public static volatile SingularAttribute<Localidad, String> nombre;
    public static volatile SingularAttribute<Localidad, String> codigoPostal;
    public static volatile SingularAttribute<Localidad, Provincia> provincia;

}