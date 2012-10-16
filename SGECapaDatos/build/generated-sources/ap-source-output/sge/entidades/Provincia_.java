package sge.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sge.entidades.Localidad;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-15T19:42:30")
@StaticMetamodel(Provincia.class)
public class Provincia_ { 

    public static volatile SingularAttribute<Provincia, Integer> id;
    public static volatile SingularAttribute<Provincia, String> nombre;
    public static volatile ListAttribute<Provincia, Localidad> localidades;
    public static volatile ListAttribute<Provincia, Localidad> locList;

}