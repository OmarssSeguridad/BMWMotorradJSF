package Modelos;

import Modelos.DetallesRutas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(Imagenes.class)
public class Imagenes_ { 

    public static volatile SingularAttribute<Imagenes, Date> createdAt;
    public static volatile SingularAttribute<Imagenes, Long> idImagenes;
    public static volatile SingularAttribute<Imagenes, String> ruta;
    public static volatile CollectionAttribute<Imagenes, DetallesRutas> detallesRutasCollection;
    public static volatile SingularAttribute<Imagenes, String> name;
    public static volatile SingularAttribute<Imagenes, Date> updatedAt;

}