package Modelos;

import Modelos.DetallesPagos;
import Modelos.ModoPagos;
import Modelos.Motociclistas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-12T19:12:57")
@StaticMetamodel(Pagos.class)
public class Pagos_ { 

    public static volatile SingularAttribute<Pagos, Date> fecha;
    public static volatile SingularAttribute<Pagos, Date> createdAt;
    public static volatile CollectionAttribute<Pagos, DetallesPagos> detallesPagosCollection;
    public static volatile SingularAttribute<Pagos, Long> idPago;
    public static volatile SingularAttribute<Pagos, Motociclistas> idMotociclista;
    public static volatile SingularAttribute<Pagos, Date> updatedAt;
    public static volatile SingularAttribute<Pagos, ModoPagos> idModopago;

}