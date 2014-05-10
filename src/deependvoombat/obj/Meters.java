/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deependvoombat.obj;

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
 * @author Sergey
 */
@Entity
@Table(name = "meters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meters.findAll", query = "SELECT m FROM Meters m"),
    @NamedQuery(name = "Meters.findByIdMeters", query = "SELECT m FROM Meters m WHERE m.idMeters = :idMeters"),
    @NamedQuery(name = "Meters.findByTypemeter", query = "SELECT m FROM Meters m WHERE m.typemeter = :typemeter"),
    @NamedQuery(name = "Meters.findByPlacement", query = "SELECT m FROM Meters m WHERE m.placement = :placement"),
    @NamedQuery(name = "Meters.findByCurrentReading", query = "SELECT m FROM Meters m WHERE m.currentReading = :currentReading"),
    @NamedQuery(name = "Meters.findByPreviousReading", query = "SELECT m FROM Meters m WHERE m.previousReading = :previousReading"),
    @NamedQuery(name = "Meters.findByOwner", query = "SELECT m FROM Meters m WHERE m.owner = :owner")})
public class Meters implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMeters")
    private Integer idMeters;
    @Basic(optional = false)
    @Column(name = "Type_meter")
    private int typemeter;
    @Basic(optional = false)
    @Column(name = "placement")
    private String placement;
    @Column(name = "current_reading")
    private Integer currentReading;
    @Column(name = "previous_reading")
    private String previousReading;
    @Basic(optional = false)
    @Column(name = "owner")
    private int owner;

    public Meters() {
    }

    public Meters(Integer idMeters) {
        this.idMeters = idMeters;
    }

    public Meters(Integer idMeters, int typemeter, String placement, int owner) {
        this.idMeters = idMeters;
        this.typemeter = typemeter;
        this.placement = placement;
        this.owner = owner;
    }

    public Integer getIdMeters() {
        return idMeters;
    }

    public void setIdMeters(Integer idMeters) {
        this.idMeters = idMeters;
    }

    public int getTypemeter() {
        return typemeter;
    }

    public void setTypemeter(int typemeter) {
        this.typemeter = typemeter;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public Integer getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(Integer currentReading) {
        this.currentReading = currentReading;
    }

    public String getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(String previousReading) {
        this.previousReading = previousReading;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeters != null ? idMeters.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meters)) {
            return false;
        }
        Meters other = (Meters) object;
        if ((this.idMeters == null && other.idMeters != null) || (this.idMeters != null && !this.idMeters.equals(other.idMeters))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deependvoombat.obj.Meters[ idMeters=" + idMeters + " ]";
    }
    
}
