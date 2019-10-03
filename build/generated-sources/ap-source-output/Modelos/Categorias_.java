package Modelos;

import Modelos.Productos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, Date> createdAt;
    public static volatile SingularAttribute<Categorias, String> name;
    public static volatile CollectionAttribute<Categorias, Productos> productosCollection;
    public static volatile SingularAttribute<Categorias, Long> idCategoria;
    public static volatile SingularAttribute<Categorias, String> detalle;
    public static volatile SingularAttribute<Categorias, Date> updatedAt;

}