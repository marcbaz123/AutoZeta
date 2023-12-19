/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "presupuesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presupuesto.findAll", query = "SELECT p FROM Presupuesto p")
    , @NamedQuery(name = "Presupuesto.findByIdPres", query = "SELECT p FROM Presupuesto p WHERE p.idPres = :idPres")
    , @NamedQuery(name = "Presupuesto.findByFechaPres", query = "SELECT p FROM Presupuesto p WHERE p.fechaPres = :fechaPres")
    , @NamedQuery(name = "Presupuesto.findByCostoObra", query = "SELECT p FROM Presupuesto p WHERE p.costoObra = :costoObra")
    , @NamedQuery(name = "Presupuesto.findByCostoRepues", query = "SELECT p FROM Presupuesto p WHERE p.costoRepues = :costoRepues")
    , @NamedQuery(name = "Presupuesto.findByCostoTotal", query = "SELECT p FROM Presupuesto p WHERE p.costoTotal = :costoTotal")})
public class Presupuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pres")
    private Integer idPres;
    @Column(name = "fecha_pres")
    @Temporal(TemporalType.DATE)
    private Date fechaPres;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_obra")
    private Double costoObra;
    @Column(name = "costo_repues")
    private Double costoRepues;
    @Column(name = "costo_total")
    private Double costoTotal;
    @JoinColumn(name = "id_ficha", referencedColumnName = "id_ficha")
    @ManyToOne(optional = false)
    private Integer idFicha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPres")
    private Collection<ItemServicio> itemServicioCollection;

    public Presupuesto() {
    }

    public Presupuesto(Integer idPres) {
        this.idPres = idPres;
    }

    public Integer getIdPres() {
        return idPres;
    }

    public void setIdPres(Integer idPres) {
        this.idPres = idPres;
    }

    public Presupuesto(Integer idPres, Date fechaPres, Double costoObra, Double costoRepues, Double costoTotal, Integer idFicha, Collection<ItemServicio> itemServicioCollection) {
        this.idPres = idPres;
        this.fechaPres = fechaPres;
        this.costoObra = costoObra;
        this.costoRepues = costoRepues;
        this.costoTotal = costoTotal;
        this.idFicha = idFicha;
        this.itemServicioCollection = itemServicioCollection;
    }

    public Date getFechaPres() {
        return fechaPres;
    }

    public void setFechaPres(Date fechaPres) {
        this.fechaPres = fechaPres;
    }

    public Double getCostoObra() {
        return costoObra;
    }

    public void setCostoObra(Double costoObra) {
        this.costoObra = costoObra;
    }

    public Double getCostoRepues() {
        return costoRepues;
    }

    public void setCostoRepues(Double costoRepues) {
        this.costoRepues = costoRepues;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Integer getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    @XmlTransient
    public Collection<ItemServicio> getItemServicioCollection() {
        return itemServicioCollection;
    }

    public void setItemServicioCollection(Collection<ItemServicio> itemServicioCollection) {
        this.itemServicioCollection = itemServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPres != null ? idPres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presupuesto)) {
            return false;
        }
        Presupuesto other = (Presupuesto) object;
        if ((this.idPres == null && other.idPres != null) || (this.idPres != null && !this.idPres.equals(other.idPres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Presupuesto[ idPres=" + idPres + " ]";
    }
    
}
