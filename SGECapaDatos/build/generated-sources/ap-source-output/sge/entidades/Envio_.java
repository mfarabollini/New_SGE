package sge.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sge.entidades.LineaEnvio;
import sge.entidades.MedioEnvio;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-09-04T12:15:10")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, Integer> id;
    public static volatile ListAttribute<Envio, LineaEnvio> lineaEnvioList;
    public static volatile SingularAttribute<Envio, Date> fechaCreacion;
    public static volatile SingularAttribute<Envio, MedioEnvio> medio;
    public static volatile SingularAttribute<Envio, Date> fechaSalida;

}