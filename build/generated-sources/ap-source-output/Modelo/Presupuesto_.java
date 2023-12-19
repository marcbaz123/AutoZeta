package Modelo;

import Modelo.ItemServicio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-10T08:13:25")
@StaticMetamodel(Presupuesto.class)
public class Presupuesto_ { 

    public static volatile SingularAttribute<Presupuesto, Integer> idFicha;
    public static volatile CollectionAttribute<Presupuesto, ItemServicio> itemServicioCollection;
    public static volatile SingularAttribute<Presupuesto, Date> fechaPres;
    public static volatile SingularAttribute<Presupuesto, Double> costoTotal;
    public static volatile SingularAttribute<Presupuesto, Double> costoRepues;
    public static volatile SingularAttribute<Presupuesto, Double> costoObra;
    public static volatile SingularAttribute<Presupuesto, Integer> idPres;

}