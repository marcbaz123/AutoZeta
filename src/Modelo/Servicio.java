/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s")
    , @NamedQuery(name = "Servicio.findByIdServ", query = "SELECT s FROM Servicio s WHERE s.idServ = :idServ")
    , @NamedQuery(name = "Servicio.findByDiagnostico", query = "SELECT s FROM Servicio s WHERE s.diagnostico = :diagnostico")
    , @NamedQuery(name = "Servicio.findByManoObra", query = "SELECT s FROM Servicio s WHERE s.manoObra = :manoObra")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_serv")
    private Integer idServ;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "mano_obra")
    private String manoObra;

    public Servicio() {
    }

    public Servicio(Integer idServ) {
        this.idServ = idServ;
    }

    public Integer getIdServ() {
        return idServ;
    }

    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getManoObra() {
        return manoObra;
    }

    public void setManoObra(String manoObra) {
        this.manoObra = manoObra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServ != null ? idServ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.idServ == null && other.idServ != null) || (this.idServ != null && !this.idServ.equals(other.idServ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Servicio[ idServ=" + idServ + " ]";
    }
    
}
