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
@Table(name = "PRODUCTCATALOGUE2", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Productcatalogue2.findAll", query = "SELECT p FROM Productcatalogue2 p"),
    @NamedQuery(name = "Productcatalogue2.findByProdid", query = "SELECT p FROM Productcatalogue2 p WHERE p.prodid = :prodid"),
    @NamedQuery(name = "Productcatalogue2.findByProductname", query = "SELECT p FROM Productcatalogue2 p WHERE p.productname = :productname"),
    @NamedQuery(name = "Productcatalogue2.findByDescription", query = "SELECT p FROM Productcatalogue2 p WHERE p.description = :description"),
    @NamedQuery(name = "Productcatalogue2.findByQuantity", query = "SELECT p FROM Productcatalogue2 p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Productcatalogue2.findByDealerid", query = "SELECT p FROM Productcatalogue2 p WHERE p.dealerid = :dealerid"),
    @NamedQuery(name = "Productcatalogue2.findByPrice", query = "SELECT p FROM Productcatalogue2 p WHERE p.price = :price")})
public class Productcatalogue2 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODID")
    private Integer prodid;
    @Basic(optional = false)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "DEALERID")
    private Integer dealerid;
    @Column(name = "PRICE")
    private Integer price;

    public Productcatalogue2() {
    }

    public Productcatalogue2(Integer prodid) {
        this.prodid = prodid;
    }

    public Productcatalogue2(Integer prodid, String productname, int quantity) {
        this.prodid = prodid;
        this.productname = productname;
        this.quantity = quantity;
    }

    public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        Integer oldProdid = this.prodid;
        this.prodid = prodid;
        changeSupport.firePropertyChange("prodid", oldProdid, prodid);
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        String oldProductname = this.productname;
        this.productname = productname;
        changeSupport.firePropertyChange("productname", oldProductname, productname);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public Integer getDealerid() {
        return dealerid;
    }

    public void setDealerid(Integer dealerid) {
        Integer oldDealerid = this.dealerid;
        this.dealerid = dealerid;
        changeSupport.firePropertyChange("dealerid", oldDealerid, dealerid);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodid != null ? prodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productcatalogue2)) {
            return false;
        }
        Productcatalogue2 other = (Productcatalogue2) object;
        if ((this.prodid == null && other.prodid != null) || (this.prodid != null && !this.prodid.equals(other.prodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Productcatalogue2[ prodid=" + prodid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
