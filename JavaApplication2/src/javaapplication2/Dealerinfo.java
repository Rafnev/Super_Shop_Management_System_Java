/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rafi
 */
@Entity
@Table(name = "DEALERINFO", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Dealerinfo.findAll", query = "SELECT d FROM Dealerinfo d"),
    @NamedQuery(name = "Dealerinfo.findByDealerid", query = "SELECT d FROM Dealerinfo d WHERE d.dealerid = :dealerid"),
    @NamedQuery(name = "Dealerinfo.findByDealername", query = "SELECT d FROM Dealerinfo d WHERE d.dealername = :dealername"),
    @NamedQuery(name = "Dealerinfo.findByDealeraddress", query = "SELECT d FROM Dealerinfo d WHERE d.dealeraddress = :dealeraddress"),
    @NamedQuery(name = "Dealerinfo.findByDealerphoneno", query = "SELECT d FROM Dealerinfo d WHERE d.dealerphoneno = :dealerphoneno")})
public class Dealerinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEALERID")
    private Integer dealerid;
    @Basic(optional = false)
    @Column(name = "DEALERNAME")
    private String dealername;
    @Basic(optional = false)
    @Column(name = "DEALERADDRESS")
    private String dealeraddress;
    @Basic(optional = false)
    @Column(name = "DEALERPHONENO")
    private String dealerphoneno;

    public Dealerinfo() {
    }

    public Dealerinfo(Integer dealerid) {
        this.dealerid = dealerid;
    }

    public Dealerinfo(Integer dealerid, String dealername, String dealeraddress, String dealerphoneno) {
        this.dealerid = dealerid;
        this.dealername = dealername;
        this.dealeraddress = dealeraddress;
        this.dealerphoneno = dealerphoneno;
    }

    public Integer getDealerid() {
        return dealerid;
    }

    public void setDealerid(Integer dealerid) {
        Integer oldDealerid = this.dealerid;
        this.dealerid = dealerid;
        changeSupport.firePropertyChange("dealerid", oldDealerid, dealerid);
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        String oldDealername = this.dealername;
        this.dealername = dealername;
        changeSupport.firePropertyChange("dealername", oldDealername, dealername);
    }

    public String getDealeraddress() {
        return dealeraddress;
    }

    public void setDealeraddress(String dealeraddress) {
        String oldDealeraddress = this.dealeraddress;
        this.dealeraddress = dealeraddress;
        changeSupport.firePropertyChange("dealeraddress", oldDealeraddress, dealeraddress);
    }

    public String getDealerphoneno() {
        return dealerphoneno;
    }

    public void setDealerphoneno(String dealerphoneno) {
        String oldDealerphoneno = this.dealerphoneno;
        this.dealerphoneno = dealerphoneno;
        changeSupport.firePropertyChange("dealerphoneno", oldDealerphoneno, dealerphoneno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerid != null ? dealerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dealerinfo)) {
            return false;
        }
        Dealerinfo other = (Dealerinfo) object;
        if ((this.dealerid == null && other.dealerid != null) || (this.dealerid != null && !this.dealerid.equals(other.dealerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Dealerinfo[ dealerid=" + dealerid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
