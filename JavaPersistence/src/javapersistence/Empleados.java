/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapersistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "empleados")
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "numemp")
    private Integer numemp;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "edad")
    private int edad;
    
    @Column(name = "puesto")
    private String puesto;
    
    @Column(name = "contrato")
    @Temporal(TemporalType.DATE)
    private Date contrato;
    
//    @JoinColumn(name = "oficina", referencedColumnName = "oficina")
//    @ManyToOne(optional = false)
//    private Oficinas oficina;

    public Empleados() {
    }

    public Empleados(Integer numemp) {
        this.numemp = numemp;
    }

    public Empleados(Integer numemp, String nombre, int edad, String puesto) {
        this.numemp = numemp;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Integer getNumemp() {
        return numemp;
    }

    public void setNumemp(Integer numemp) {
        this.numemp = numemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }

//    public Oficinas getOficina() {
//        return oficina;
//    }
//
//    public void setOficina(Oficinas oficina) {
//        this.oficina = oficina;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numemp != null ? numemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.numemp == null && other.numemp != null) || (this.numemp != null && !this.numemp.equals(other.numemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javapersistence.Empleados[ numemp=" + numemp + " ]";
    }
    
}
