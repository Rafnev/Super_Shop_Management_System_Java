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
@Table(name = "STAFFINFO", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Staffinfo.findAll", query = "SELECT s FROM Staffinfo s"),
    @NamedQuery(name = "Staffinfo.findByStaffid", query = "SELECT s FROM Staffinfo s WHERE s.staffid = :staffid"),
    @NamedQuery(name = "Staffinfo.findByStaffname", query = "SELECT s FROM Staffinfo s WHERE s.staffname = :staffname"),
    @NamedQuery(name = "Staffinfo.findByStaffaddress", query = "SELECT s FROM Staffinfo s WHERE s.staffaddress = :staffaddress"),
    @NamedQuery(name = "Staffinfo.findByStaffphoneno", query = "SELECT s FROM Staffinfo s WHERE s.staffphoneno = :staffphoneno")})
public class Staffinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STAFFID")
    private Integer staffid;
    @Basic(optional = false)
    @Column(name = "STAFFNAME")
    private String staffname;
    @Basic(optional = false)
    @Column(name = "STAFFADDRESS")
    private String staffaddress;
    @Basic(optional = false)
    @Column(name = "STAFFPHONENO")
    private String staffphoneno;

    public Staffinfo() {
    }

    public Staffinfo(Integer staffid) {
        this.staffid = staffid;
    }

    public Staffinfo(Integer staffid, String staffname, String staffaddress, String staffphoneno) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.staffaddress = staffaddress;
        this.staffphoneno = staffphoneno;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        Integer oldStaffid = this.staffid;
        this.staffid = staffid;
        changeSupport.firePropertyChange("staffid", oldStaffid, staffid);
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        String oldStaffname = this.staffname;
        this.staffname = staffname;
        changeSupport.firePropertyChange("staffname", oldStaffname, staffname);
    }

    public String getStaffaddress() {
        return staffaddress;
    }

    public void setStaffaddress(String staffaddress) {
        String oldStaffaddress = this.staffaddress;
        this.staffaddress = staffaddress;
        changeSupport.firePropertyChange("staffaddress", oldStaffaddress, staffaddress);
    }

    public String getStaffphoneno() {
        return staffphoneno;
    }

    public void setStaffphoneno(String staffphoneno) {
        String oldStaffphoneno = this.staffphoneno;
        this.staffphoneno = staffphoneno;
        changeSupport.firePropertyChange("staffphoneno", oldStaffphoneno, staffphoneno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffid != null ? staffid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staffinfo)) {
            return false;
        }
        Staffinfo other = (Staffinfo) object;
        if ((this.staffid == null && other.staffid != null) || (this.staffid != null && !this.staffid.equals(other.staffid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Staffinfo[ staffid=" + staffid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
