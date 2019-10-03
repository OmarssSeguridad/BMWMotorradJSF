package Modelos;

import Modelos.DetallesRutas;
import Modelos.Pagos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(Motociclistas.class)
public class Motociclistas_ { 

    public static volatile SingularAttribute<Motociclistas, Date> createdAt;
    public static volatile CollectionAttribute<Motociclistas, Pagos> pagosCollection;
    public static volatile CollectionAttribute<Motociclistas, DetallesRutas> detallesRutasCollection;
    public static volatile SingularAttribute<Motociclistas, String> fecNac;
    public static volatile SingularAttribute<Motociclistas, String> direccion;
    public static volatile SingularAttribute<Motociclistas, String> name;
    public static volatile SingularAttribute<Motociclistas, Long> idMotociclista;
    public static volatile SingularAttribute<Motociclistas, String> am;
    public static volatile SingularAttribute<Motociclistas, String> telefono;
    public static volatile SingularAttribute<Motociclistas, String> email;
    public static volatile SingularAttribute<Motociclistas, String> ap;
    public static volatile SingularAttribute<Motociclistas, Date> updatedAt;

}