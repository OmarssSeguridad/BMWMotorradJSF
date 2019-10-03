package Modelos;

import Modelos.Pagos;
import Modelos.Productos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(DetallesPagos.class)
public class DetallesPagos_ { 

    public static volatile SingularAttribute<DetallesPagos, Date> createdAt;
    public static volatile SingularAttribute<DetallesPagos, Double> precio;
    public static volatile SingularAttribute<DetallesPagos, Long> idDetalle;
    public static volatile SingularAttribute<DetallesPagos, Pagos> idPago;
    public static volatile SingularAttribute<DetallesPagos, Integer> cantidad;
    public static volatile SingularAttribute<DetallesPagos, Productos> idProducto;
    public static volatile SingularAttribute<DetallesPagos, Date> updatedAt;

}