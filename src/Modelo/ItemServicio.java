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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "item_servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemServicio.findAll", query = "SELECT i FROM ItemServicio i")
    , @NamedQuery(name = "ItemServicio.findByIdCom", query = "SELECT i FROM ItemServicio i WHERE i.idCom = :idCom")
    , @NamedQuery(name = "ItemServicio.findByItemServ", query = "SELECT i FROM ItemServicio i WHERE i.itemServ = :itemServ")
    , @NamedQuery(name = "ItemServicio.findByIdServ", query = "SELECT i FROM ItemServicio i WHERE i.idServ = :idServ")})
public class ItemServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_com")
    private Integer idCom;
    @Column(name = "item_serv")
    private Integer itemServ;
    @Basic(optional = false)
    @Column(name = "id_serv")
    private int idServ;
    @JoinColumn(name = "id_pres", referencedColumnName = "id_pres")
    @ManyToOne(optional = false)
    private Presupuesto idPres;

    public ItemServicio() {
    }

    public ItemServicio(Integer idCom) {
        this.idCom = idCom;
    }

    public ItemServicio(Integer idCom, int idServ) {
        this.idCom = idCom;
        this.idServ = idServ;
    }

    public Integer getIdCom() {
        return idCom;
    }

    public void setIdCom(Integer idCom) {
        this.idCom = idCom;
    }

    public Integer getItemServ() {
        return itemServ;
    }

    public void setItemServ(Integer itemServ) {
        this.itemServ = itemServ;
    }

    public int getIdServ() {
        return idServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }

    public Presupuesto getIdPres() {
        return idPres;
    }

    public void setIdPres(Presupuesto idPres) {
        this.idPres = idPres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCom != null ? idCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemServicio)) {
            return false;
        }
        ItemServicio other = (ItemServicio) object;
        if ((this.idCom == null && other.idCom != null) || (this.idCom != null && !this.idCom.equals(other.idCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ItemServicio[ idCom=" + idCom + " ]";
    }
    
}
