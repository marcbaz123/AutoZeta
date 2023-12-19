/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "ficha", catalog = "autoZeta", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f")
    , @NamedQuery(name = "Ficha.findByIdFicha", query = "SELECT f FROM Ficha f WHERE f.idFicha = :idFicha")
    , @NamedQuery(name = "Ficha.findByMarca", query = "SELECT f FROM Ficha f WHERE f.marca = :marca")
    , @NamedQuery(name = "Ficha.findByModelo", query = "SELECT f FROM Ficha f WHERE f.modelo = :modelo")
    , @NamedQuery(name = "Ficha.findByMatricula", query = "SELECT f FROM Ficha f WHERE f.matricula = :matricula")
    , @NamedQuery(name = "Ficha.findByAnoFab", query = "SELECT f FROM Ficha f WHERE f.anoFab = :anoFab")
    , @NamedQuery(name = "Ficha.findByNChasis", query = "SELECT f FROM Ficha f WHERE f.nChasis = :nChasis")
    , @NamedQuery(name = "Ficha.findByTipoMotor", query = "SELECT f FROM Ficha f WHERE f.tipoMotor = :tipoMotor")
    , @NamedQuery(name = "Ficha.findByTipoCaja", query = "SELECT f FROM Ficha f WHERE f.tipoCaja = :tipoCaja")})
public class Ficha implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private Collection<Presupuesto> presupuestoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ficha", nullable = false)
    private Integer idFicha;
    @Column(name = "marca", length = 2147483647)
    private String marca;
    @Column(name = "modelo", length = 2147483647)
    private String modelo;
    @Column(name = "matricula", length = 2147483647)
    private String matricula;
    @Column(name = "ano_fab", length = 2147483647)
    private String anoFab;
    @Column(name = "n_chasis", length = 2147483647)
    private String nChasis;
    @Column(name = "tipo_motor", length = 2147483647)
    private String tipoMotor;
    @Column(name = "tipo_caja", length = 2147483647)
    private String tipoCaja;
    @JoinColumn(name = "idcli", referencedColumnName = "idcli", nullable = false)
    @ManyToOne(optional = false)
    private Integer idcli;
    @JoinColumn(name = "nom", nullable = false)
    @ManyToOne(optional = false)
    private String nom;

    public Ficha() {

    }

    public Ficha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public Integer getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public Ficha(Integer idFicha, String marca, String modelo, String matricula, String anoFab, String nChasis, String tipoMotor, String tipoCaja, String nom, Integer idcli) {
        this.idFicha = idFicha;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anoFab = anoFab;
        this.nChasis = nChasis;
        this.tipoMotor = tipoMotor;
        this.tipoCaja = tipoCaja;
        this.nom = nom;
        this.idcli = idcli;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    public String getNChasis() {
        return nChasis;
    }

    public void setNChasis(String nChasis) {
        this.nChasis = nChasis;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    
    public Integer getIdcli() {
        return idcli;
    }

    public void setIdcli(Integer idcli) {
        this.idcli = idcli;
    }

    public String getNom() {
        return nom;
    }

    public void SetNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFicha != null ? idFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.idFicha == null && other.idFicha != null) || (this.idFicha != null && !this.idFicha.equals(other.idFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Ficha[ idFicha=" + idFicha + " ]";
    }

    @XmlTransient
    public Collection<Presupuesto> getPresupuestoCollection() {
        return presupuestoCollection;
    }

    public void setPresupuestoCollection(Collection<Presupuesto> presupuestoCollection) {
        this.presupuestoCollection = presupuestoCollection;
    }

}
