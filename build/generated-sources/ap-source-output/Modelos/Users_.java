package Modelos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-10-01T10:35:10")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, Date> createdAt;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Date> emailVerifiedAt;
    public static volatile SingularAttribute<Users, String> tipoUser;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, Long> id;
    public static volatile SingularAttribute<Users, String> rememberToken;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, Date> updatedAt;

}