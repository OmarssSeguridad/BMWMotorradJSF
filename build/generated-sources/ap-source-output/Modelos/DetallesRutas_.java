package Modelos;

import Modelos.Imagenes;
import Modelos.Motociclistas;
import Modelos.Rutas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(DetallesRutas.class)
public class DetallesRutas_ { 

    public static volatile SingularAttribute<DetallesRutas, Date> createdAt;
    public static volatile SingularAttribute<DetallesRutas, Imagenes> idImagenes;
    public static volatile SingularAttribute<DetallesRutas, Motociclistas> idMotociclista;
    public static volatile SingularAttribute<DetallesRutas, Long> idDetalleruta;
    public static volatile SingularAttribute<DetallesRutas, Rutas> idRuta;
    public static volatile SingularAttribute<DetallesRutas, String> status;
    public static volatile SingularAttribute<DetallesRutas, Date> updatedAt;

}