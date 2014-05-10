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
@Table(name = "houses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Houses.findAll", query = "SELECT h FROM Houses h"),
    @NamedQuery(name = "Houses.findByIdHouse", query = "SELECT h FROM Houses h WHERE h.idHouse = :idHouse"),
    @NamedQuery(name = "Houses.findByStreet", query = "SELECT h FROM Houses h WHERE h.street = :street"),
    @NamedQuery(name = "Houses.findByNumber", query = "SELECT h FROM Houses h WHERE h.number = :number"),
    @NamedQuery(name = "Houses.findByBuilding", query = "SELECT h FROM Houses h WHERE h.building = :building"),
    @NamedQuery(name = "Houses.findByAllArea", query = "SELECT h FROM Houses h WHERE h.allArea = :allArea"),
    @NamedQuery(name = "Houses.findByLiveArea", query = "SELECT h FROM Houses h WHERE h.liveArea = :liveArea"),
    @NamedQuery(name = "Houses.findByCountFloor", query = "SELECT h FROM Houses h WHERE h.countFloor = :countFloor"),
    @NamedQuery(name = "Houses.findByStatusHouse", query = "SELECT h FROM Houses h WHERE h.statusHouse = :statusHouse"),
    @NamedQuery(name = "Houses.findByCountIndoor", query = "SELECT h FROM Houses h WHERE h.countIndoor = :countIndoor")})
public class Houses implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHouse")
    private Integer idHouse;
    @Basic(optional = false)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @Column(name = "Number")
    private int number;
    @Column(name = "Building")
    private String building;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "all_area")
    private BigDecimal allArea;
    @Column(name = "live_area")
    private BigDecimal liveArea;
    @Column(name = "count_floor")
    private Integer countFloor;
    @Column(name = "status_house")
    private String statusHouse;
    @Column(name = "count_indoor")
    private Integer countIndoor;

    public Houses() {
    }

    public Houses(Integer idHouse) {
        this.idHouse = idHouse;
    }

    public Houses(Integer idHouse, String street, int number) {
        this.idHouse = idHouse;
        this.street = street;
        this.number = number;
    }

    public Integer getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Integer idHouse) {
        this.idHouse = idHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
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

    public Integer getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(Integer countFloor) {
        this.countFloor = countFloor;
    }

    public String getStatusHouse() {
        return statusHouse;
    }

    public void setStatusHouse(String statusHouse) {
        this.statusHouse = statusHouse;
    }

    public Integer getCountIndoor() {
        return countIndoor;
    }

    public void setCountIndoor(Integer countIndoor) {
        this.countIndoor = countIndoor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHouse != null ? idHouse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Houses)) {
            return false;
        }
        Houses other = (Houses) object;
        if ((this.idHouse == null && other.idHouse != null) || (this.idHouse != null && !this.idHouse.equals(other.idHouse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deependvoombat.obj.Houses[ idHouse=" + idHouse + " ]";
    }
    
}
