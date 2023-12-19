package Modelo;

import Modelo.Presupuesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-10T08:13:25")
@StaticMetamodel(Ficha.class)
public class Ficha_ { 

    public static volatile SingularAttribute<Ficha, Integer> idFicha;
    public static volatile SingularAttribute<Ficha, String> marca;
    public static volatile SingularAttribute<Ficha, String> anoFab;
    public static volatile SingularAttribute<Ficha, String> tipoMotor;
    public static volatile SingularAttribute<Ficha, Integer> idcli;
    public static volatile CollectionAttribute<Ficha, Presupuesto> presupuestoCollection;
    public static volatile SingularAttribute<Ficha, String> nChasis;
    public static volatile SingularAttribute<Ficha, String> matricula;
    public static volatile SingularAttribute<Ficha, String> tipoCaja;
    public static volatile SingularAttribute<Ficha, String> modelo;
    public static volatile SingularAttribute<Ficha, String> nom;

}