package Modelos;

import Modelos.Pagos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-12T19:12:57")
@StaticMetamodel(ModoPagos.class)
public class ModoPagos_ { 

    public static volatile SingularAttribute<ModoPagos, Date> createdAt;
    public static volatile CollectionAttribute<ModoPagos, Pagos> pagosCollection;
    public static volatile SingularAttribute<ModoPagos, String> name;
    public static volatile SingularAttribute<ModoPagos, Long> idModopago;
    public static volatile SingularAttribute<ModoPagos, String> detalle;
    public static volatile SingularAttribute<ModoPagos, Date> updatedAt;

}