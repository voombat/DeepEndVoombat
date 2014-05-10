/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deependvoombat.obj;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "upload")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Upload.findAll", query = "SELECT u FROM Upload u"),
    @NamedQuery(name = "Upload.findByIdupLoad", query = "SELECT u FROM Upload u WHERE u.idupLoad = :idupLoad"),
    @NamedQuery(name = "Upload.findByAddr", query = "SELECT u FROM Upload u WHERE u.addr = :addr"),
    @NamedQuery(name = "Upload.findByNumFlat", query = "SELECT u FROM Upload u WHERE u.numFlat = :numFlat"),
    @NamedQuery(name = "Upload.findByLsNum", query = "SELECT u FROM Upload u WHERE u.lsNum = :lsNum"),
    @NamedQuery(name = "Upload.findByFio", query = "SELECT u FROM Upload u WHERE u.fio = :fio"),
    @NamedQuery(name = "Upload.findByAllArea", query = "SELECT u FROM Upload u WHERE u.allArea = :allArea"),
    @NamedQuery(name = "Upload.findByLiveArea", query = "SELECT u FROM Upload u WHERE u.liveArea = :liveArea"),
    @NamedQuery(name = "Upload.findByCountRooms", query = "SELECT u FROM Upload u WHERE u.countRooms = :countRooms"),
    @NamedQuery(name = "Upload.findByProp", query = "SELECT u FROM Upload u WHERE u.prop = :prop"),
    @NamedQuery(name = "Upload.findByTimepropis", query = "SELECT u FROM Upload u WHERE u.timepropis = :timepropis"),
    @NamedQuery(name = "Upload.findByBro", query = "SELECT u FROM Upload u WHERE u.bro = :bro"),
    @NamedQuery(name = "Upload.findByTypeFlat", query = "SELECT u FROM Upload u WHERE u.typeFlat = :typeFlat")})
public class Upload implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idupLoad")
    private Integer idupLoad;
    @Column(name = "addr")
    private String addr;
    @Column(name = "num_flat")
    private Integer numFlat;
    @Column(name = "ls_num")
    private String lsNum;
    @Column(name = "FIO")
    private String fio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "all_area")
    private BigDecimal allArea;
    @Column(name = "live_area")
    private BigDecimal liveArea;
    @Column(name = "count_rooms")
    private Integer countRooms;
    @Column(name = "prop")
    private String prop;
    @Column(name = "timepropis")
    private String timepropis;
    @Column(name = "bro")
    private String bro;
    @Column(name = "type_flat")
    private String typeFlat;

    public Upload() {
    }

    public Upload(Integer idupLoad) {
        this.idupLoad = idupLoad;
    }

    public Integer getIdupLoad() {
        return idupLoad;
    }

    public void setIdupLoad(Integer idupLoad) {
        this.idupLoad = idupLoad;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getNumFlat() {
        return numFlat;
    }

    public void setNumFlat(Integer numFlat) {
        this.numFlat = numFlat;
    }

    public String getLsNum() {
        return lsNum;
    }

    public void setLsNum(String lsNum) {
        this.lsNum = lsNum;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public BigDecimal getAllArea() {
        return allArea;
    }

    public void setAllArea(BigDecimal allArea) {
        this.allArea = allArea;
    }

    public BigDecimal getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(BigDecimal liveArea) {
        this.liveArea = liveArea;
    }

    public Integer getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(Integer countRooms) {
        this.countRooms = countRooms;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getTimepropis() {
        return timepropis;
    }

    public void setTimepropis(String timepropis) {
        this.timepropis = timepropis;
    }

    public String getBro() {
        return bro;
    }

    public void setBro(String bro) {
        this.bro = bro;
    }

    public String getTypeFlat() {
        return typeFlat;
    }

    public void setTypeFlat(String typeFlat) {
        this.typeFlat = typeFlat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idupLoad != null ? idupLoad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Upload)) {
            return false;
        }
        Upload other = (Upload) object;
        if ((this.idupLoad == null && other.idupLoad != null) || (this.idupLoad != null && !this.idupLoad.equals(other.idupLoad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deependvoombat.obj.Upload[ idupLoad=" + idupLoad + " ]";
    }
    
}
