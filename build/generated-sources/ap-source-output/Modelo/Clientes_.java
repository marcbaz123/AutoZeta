package Modelo;

import Modelo.Ficha;
import Modelo.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-10T08:13:25")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Integer> idcli;
    public static volatile SingularAttribute<Clientes, Integer> cedula;
    public static volatile SingularAttribute<Clientes, Ficha> ficha;
    public static volatile SingularAttribute<Clientes, Usuario> usuario;
    public static volatile SingularAttribute<Clientes, String> tel;
    public static volatile CollectionAttribute<Clientes, Ficha> fichaCollection;
    public static volatile SingularAttribute<Clientes, String> nom;

}