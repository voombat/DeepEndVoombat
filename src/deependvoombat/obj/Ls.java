/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deependvoombat.obj;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sergey
 */
@Entity
@Table(name = "ls")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ls.findAll", query = "SELECT l FROM Ls l"),
    @NamedQuery(name = "Ls.findByIdLs", query = "SELECT l FROM Ls l WHERE l.idLs = :idLs"),
    @NamedQuery(name = "Ls.findByNumber", query = "SELECT l FROM Ls l WHERE l.number = :number"),
    @NamedQuery(name = "Ls.findByOpendate", query = "SELECT l FROM Ls l WHERE l.opendate = :opendate"),
    @NamedQuery(name = "Ls.findByClosedate", query = "SELECT l FROM Ls l WHERE l.closedate = :closedate"),
    @NamedQuery(name = "Ls.findByAreaLs", query = "SELECT l FROM Ls l WHERE l.areaLs = :areaLs"),
    @NamedQuery(name = "Ls.findByCountLiveAlways", query = "SELECT l FROM Ls l WHERE l.countLiveAlways = :countLiveAlways"),
    @NamedQuery(name = "Ls.findByCountLiveSometime", query = "SELECT l FROM Ls l WHERE l.countLiveSometime = :countLiveSometime"),
    @NamedQuery(name = "Ls.findByCountLiveAway", query = "SELECT l FROM Ls l WHERE l.countLiveAway = :countLiveAway"),
    @NamedQuery(name = "Ls.findByIdflat", query = "SELECT l FROM Ls l WHERE l.idflat = :idflat")})
public class Ls implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLs")
    private Integer idLs;
    @Basic(optional = false)
    @Column(name = "number")
    private int number;
    @Column(name = "Open_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date opendate;
    @Column(name = "Close_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "area_ls")
    private BigDecimal areaLs;
    @Basic(optional = false)
    @Lob
    @Column(name = "name_owner")
    private String nameOwner;
    @Column(name = "count_live_always")
    private Integer countLiveAlways;
    @Column(name = "count_live_sometime")
    private Integer countLiveSometime;
    @Column(name = "count_live_away")
    private Integer countLiveAway;
    @Column(name = "idflat")
    private Integer idflat;

    public Ls() {
    }

    public Ls(Integer idLs) {
        this.idLs = idLs;
    }

    public Ls(Integer idLs, int number, BigDecimal areaLs, String nameOwner) {
        this.idLs = idLs;
        this.number = number;
        this.areaLs = areaLs;
        this.nameOwner = nameOwner;
    }

    public Integer getIdLs() {
        return idLs;
    }

    public void setIdLs(Integer idLs) {
        this.idLs = idLs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public BigDecimal getAreaLs() {
        return areaLs;
    }

    public void setAreaLs(BigDecimal areaLs) {
        this.areaLs = areaLs;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Integer getCountLiveAlways() {
        return countLiveAlways;
    }

    public void setCountLiveAlways(Integer countLiveAlways) {
        this.countLiveAlways = countLiveAlways;
    }

    public Integer getCountLiveSometime() {
        return countLiveSometime;
    }

    public void setCountLiveSometime(Integer countLiveSometime) {
        this.countLiveSometime = countLiveSometime;
    }

    public Integer getCountLiveAway() {
        return countLiveAway;
    }

    public void setCountLiveAway(Integer countLiveAway) {
        this.countLiveAway = countLiveAway;
    }

    public Integer getIdflat() {
        return idflat;
    }

    public void setIdflat(Integer idflat) {
        this.idflat = idflat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLs != null ? idLs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ls)) {
            return false;
        }
        Ls other = (Ls) object;
        if ((this.idLs == null && other.idLs != null) || (this.idLs != null && !this.idLs.equals(other.idLs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deependvoombat.obj.Ls[ idLs=" + idLs + " ]";
    }
    
}
