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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sergey
 */
@Entity
@Table(name = "flats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flats.findAll", query = "SELECT f FROM Flats f"),
    @NamedQuery(name = "Flats.findByIdFlat", query = "SELECT f FROM Flats f WHERE f.idFlat = :idFlat"),
    @NamedQuery(name = "Flats.findByAllArea", query = "SELECT f FROM Flats f WHERE f.allArea = :allArea"),
    @NamedQuery(name = "Flats.findByLiveArea", query = "SELECT f FROM Flats f WHERE f.liveArea = :liveArea"),
    @NamedQuery(name = "Flats.findByNumber", query = "SELECT f FROM Flats f WHERE f.number = :number"),
    @NamedQuery(name = "Flats.findByCountOfPropis", query = "SELECT f FROM Flats f WHERE f.countOfPropis = :countOfPropis"),
    @NamedQuery(name = "Flats.findByCountOfProgiv", query = "SELECT f FROM Flats f WHERE f.countOfProgiv = :countOfProgiv"),
    @NamedQuery(name = "Flats.findByFloor", query = "SELECT f FROM Flats f WHERE f.floor = :floor"),
    @NamedQuery(name = "Flats.findByIndoor", query = "SELECT f FROM Flats f WHERE f.indoor = :indoor"),
    @NamedQuery(name = "Flats.findByLenghtBath", query = "SELECT f FROM Flats f WHERE f.lenghtBath = :lenghtBath"),
    @NamedQuery(name = "Flats.findByIdhouse", query = "SELECT f FROM Flats f WHERE f.idhouse = :idhouse"),
    @NamedQuery(name = "Flats.findByCountRooms", query = "SELECT f FROM Flats f WHERE f.countRooms = :countRooms"),
    @NamedQuery(name = "Flats.findByTypeFlat", query = "SELECT f FROM Flats f WHERE f.typeFlat = :typeFlat")})
public class Flats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFlat")
    private Integer idFlat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "all_area")
    private BigDecimal allArea;
    @Column(name = "live_area")
    private BigDecimal liveArea;
    @Basic(optional = false)
    @Column(name = "number")
    private int number;
    @Lob
    @Column(name = "prim")
    private String prim;
    @Column(name = "count_of_propis")
    private Integer countOfPropis;
    @Column(name = "count_of_progiv")
    private Integer countOfProgiv;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "indoor")
    private Integer indoor;
    @Column(name = "lenght_bath")
    private Integer lenghtBath;
    @Basic(optional = false)
    @Column(name = "idhouse")
    private int idhouse;
    @Column(name = "count_rooms")
    private Integer countRooms;
    @Column(name = "type_flat")
    private String typeFlat;

    public Flats() {
    }

    public Flats(Integer idFlat) {
        this.idFlat = idFlat;
    }

    public Flats(Integer idFlat, int number, int idhouse) {
        this.idFlat = idFlat;
        this.number = number;
        this.idhouse = idhouse;
    }

    public Integer getIdFlat() {
        return idFlat;
    }

    public void setIdFlat(Integer idFlat) {
        this.idFlat = idFlat;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }

    public Integer getCountOfPropis() {
        return countOfPropis;
    }

    public void setCountOfPropis(Integer countOfPropis) {
        this.countOfPropis = countOfPropis;
    }

    public Integer getCountOfProgiv() {
        return countOfProgiv;
    }

    public void setCountOfProgiv(Integer countOfProgiv) {
        this.countOfProgiv = countOfProgiv;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getIndoor() {
        return indoor;
    }

    public void setIndoor(Integer indoor) {
        this.indoor = indoor;
    }

    public Integer getLenghtBath() {
        return lenghtBath;
    }

    public void setLenghtBath(Integer lenghtBath) {
        this.lenghtBath = lenghtBath;
    }

    public int getIdhouse() {
        return idhouse;
    }

    public void setIdhouse(int idhouse) {
        this.idhouse = idhouse;
    }

    public Integer getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(Integer countRooms) {
        this.countRooms = countRooms;
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
        hash += (idFlat != null ? idFlat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flats)) {
            return false;
        }
        Flats other = (Flats) object;
        if ((this.idFlat == null && other.idFlat != null) || (this.idFlat != null && !this.idFlat.equals(other.idFlat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deependvoombat.obj.Flats[ idFlat=" + idFlat + " ]";
    }
    
}
