/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_producto_etiquetas", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvProductoEtiquetas.findAll", query = "SELECT i FROM InvProductoEtiquetas i")})
public class InvProductoEtiquetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_empresa")
    private String eEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(max = 2147483647)
    @Column(name = "e_costo01")
    private String eCosto01;
    @Size(max = 2147483647)
    @Column(name = "e_costo02")
    private String eCosto02;
    @Size(max = 2147483647)
    @Column(name = "e_costo03")
    private String eCosto03;
    @Size(max = 2147483647)
    @Column(name = "e_costo04")
    private String eCosto04;
    @Size(max = 2147483647)
    @Column(name = "e_costo05")
    private String eCosto05;
    @Size(max = 2147483647)
    @Column(name = "e_costo06")
    private String eCosto06;

    @Basic(optional = false)
    @NotNull
    @Size(max = 2147483647)
    @Column(name = "e_precio01")
    private String ePrecio01;
    @Size(max = 2147483647)
    @Column(name = "e_precio02")
    private String ePrecio02;
    @Size(max = 2147483647)
    @Column(name = "e_precio03")
    private String ePrecio03;
    @Size(max = 2147483647)
    @Column(name = "e_precio04")
    private String ePrecio04;
    @Size(max = 2147483647)
    @Column(name = "e_precio05")
    private String ePrecio05;
    @Size(max = 2147483647)
    @Column(name = "e_precio06")
    private String ePrecio06;
    @Size(max = 2147483647)
    @Column(name = "e_precio07")
    private String ePrecio07;
    @Size(max = 2147483647)
    @Column(name = "e_precio08")
    private String ePrecio08;
    @Size(max = 2147483647)
    @Column(name = "e_precio09")
    private String ePrecio09;
    @Size(max = 2147483647)
    @Column(name = "e_precio10")
    private String ePrecio10;
    @Size(max = 2147483647)
    @Column(name = "e_precio11")
    private String ePrecio11;
    @Size(max = 2147483647)
    @Column(name = "e_precio12")
    private String ePrecio12;
    @Size(max = 2147483647)
    @Column(name = "e_precio13")
    private String ePrecio13;
    @Size(max = 2147483647)
    @Column(name = "e_precio14")
    private String ePrecio14;
    @Size(max = 2147483647)
    @Column(name = "e_precio15")
    private String ePrecio15;
    @Size(max = 2147483647)
    @Column(name = "e_precio16")
    private String ePrecio16;
    //liquidacion
    @Size(max = 2147483647)
    @Column(name = "liq_precio01")
    private String liqPrecio01;
    @Size(max = 2147483647)
    @Column(name = "liq_precio02")
    private String liqPrecio02;
    @Size(max = 2147483647)
    @Column(name = "liq_precio03")
    private String liqPrecio03;
    @Size(max = 2147483647)
    @Column(name = "liq_precio04")
    private String liqPrecio04;
    @Size(max = 2147483647)
    @Column(name = "liq_precio05")
    private String liqPrecio05;
    @Size(max = 2147483647)
    @Column(name = "liq_precio06")
    private String liqPrecio06;

    public InvProductoEtiquetas() {
    }

    public InvProductoEtiquetas(String eEmpresa) {
        this.eEmpresa = eEmpresa;
    }

    public InvProductoEtiquetas(String eEmpresa, String eCosto01, String ePrecio01) {
        this.eEmpresa = eEmpresa;
        this.eCosto01 = eCosto01;
        this.ePrecio01 = ePrecio01;
    }

    public String getEEmpresa() {
        return eEmpresa;
    }

    public void setEEmpresa(String eEmpresa) {
        this.eEmpresa = eEmpresa;
    }

    public String getECosto01() {
        return eCosto01;
    }

    public void setECosto01(String eCosto01) {
        this.eCosto01 = eCosto01;
    }

    public String getECosto02() {
        return eCosto02;
    }

    public void setECosto02(String eCosto02) {
        this.eCosto02 = eCosto02;
    }

    public String getECosto03() {
        return eCosto03;
    }

    public void setECosto03(String eCosto03) {
        this.eCosto03 = eCosto03;
    }

    public String getECosto04() {
        return eCosto04;
    }

    public void setECosto04(String eCosto04) {
        this.eCosto04 = eCosto04;
    }

    public String getECosto05() {
        return eCosto05;
    }

    public void setECosto05(String eCosto05) {
        this.eCosto05 = eCosto05;
    }

    public String getEPrecio01() {
        return ePrecio01;
    }

    public void setEPrecio01(String ePrecio01) {
        this.ePrecio01 = ePrecio01;
    }

    public String getEPrecio02() {
        return ePrecio02;
    }

    public void setEPrecio02(String ePrecio02) {
        this.ePrecio02 = ePrecio02;
    }

    public String getEPrecio03() {
        return ePrecio03;
    }

    public void setEPrecio03(String ePrecio03) {
        this.ePrecio03 = ePrecio03;
    }

    public String getEPrecio04() {
        return ePrecio04;
    }

    public void setEPrecio04(String ePrecio04) {
        this.ePrecio04 = ePrecio04;
    }

    public String getEPrecio05() {
        return ePrecio05;
    }

    public void setEPrecio05(String ePrecio05) {
        this.ePrecio05 = ePrecio05;
    }

    public String getEPrecio06() {
        return ePrecio06;
    }

    public void setEPrecio06(String ePrecio06) {
        this.ePrecio06 = ePrecio06;
    }

    public String getEPrecio07() {
        return ePrecio07;
    }

    public void setEPrecio07(String ePrecio07) {
        this.ePrecio07 = ePrecio07;
    }

    public String getEPrecio08() {
        return ePrecio08;
    }

    public void setEPrecio08(String ePrecio08) {
        this.ePrecio08 = ePrecio08;
    }

    public String getEPrecio09() {
        return ePrecio09;
    }

    public void setEPrecio09(String ePrecio09) {
        this.ePrecio09 = ePrecio09;
    }

    public String getEPrecio10() {
        return ePrecio10;
    }

    public void setEPrecio10(String ePrecio10) {
        this.ePrecio10 = ePrecio10;
    }

    public String getEPrecio11() {
        return ePrecio11;
    }

    public void setEPrecio11(String ePrecio11) {
        this.ePrecio11 = ePrecio11;
    }

    public String getEPrecio12() {
        return ePrecio12;
    }

    public void setEPrecio12(String ePrecio12) {
        this.ePrecio12 = ePrecio12;
    }

    public String getEPrecio13() {
        return ePrecio13;
    }

    public void setEPrecio13(String ePrecio13) {
        this.ePrecio13 = ePrecio13;
    }

    public String getEPrecio14() {
        return ePrecio14;
    }

    public void setEPrecio14(String ePrecio14) {
        this.ePrecio14 = ePrecio14;
    }

    public String getEPrecio15() {
        return ePrecio15;
    }

    public void setEPrecio15(String ePrecio15) {
        this.ePrecio15 = ePrecio15;
    }

    public String getEPrecio16() {
        return ePrecio16;
    }

    public void setEPrecio16(String ePrecio16) {
        this.ePrecio16 = ePrecio16;
    }

    public String geteEmpresa() {
        return eEmpresa;
    }

    public void seteEmpresa(String eEmpresa) {
        this.eEmpresa = eEmpresa;
    }

    public String geteCosto01() {
        return eCosto01;
    }

    public void seteCosto01(String eCosto01) {
        this.eCosto01 = eCosto01;
    }

    public String geteCosto02() {
        return eCosto02;
    }

    public void seteCosto02(String eCosto02) {
        this.eCosto02 = eCosto02;
    }

    public String geteCosto03() {
        return eCosto03;
    }

    public void seteCosto03(String eCosto03) {
        this.eCosto03 = eCosto03;
    }

    public String geteCosto04() {
        return eCosto04;
    }

    public void seteCosto04(String eCosto04) {
        this.eCosto04 = eCosto04;
    }

    public String geteCosto05() {
        return eCosto05;
    }

    public void seteCosto05(String eCosto05) {
        this.eCosto05 = eCosto05;
    }

    public String geteCosto06() {
        return eCosto06;
    }

    public void seteCosto06(String eCosto06) {
        this.eCosto06 = eCosto06;
    }

    public String getePrecio01() {
        return ePrecio01;
    }

    public void setePrecio01(String ePrecio01) {
        this.ePrecio01 = ePrecio01;
    }

    public String getePrecio02() {
        return ePrecio02;
    }

    public void setePrecio02(String ePrecio02) {
        this.ePrecio02 = ePrecio02;
    }

    public String getePrecio03() {
        return ePrecio03;
    }

    public void setePrecio03(String ePrecio03) {
        this.ePrecio03 = ePrecio03;
    }

    public String getePrecio04() {
        return ePrecio04;
    }

    public void setePrecio04(String ePrecio04) {
        this.ePrecio04 = ePrecio04;
    }

    public String getePrecio05() {
        return ePrecio05;
    }

    public void setePrecio05(String ePrecio05) {
        this.ePrecio05 = ePrecio05;
    }

    public String getePrecio06() {
        return ePrecio06;
    }

    public void setePrecio06(String ePrecio06) {
        this.ePrecio06 = ePrecio06;
    }

    public String getePrecio07() {
        return ePrecio07;
    }

    public void setePrecio07(String ePrecio07) {
        this.ePrecio07 = ePrecio07;
    }

    public String getePrecio08() {
        return ePrecio08;
    }

    public void setePrecio08(String ePrecio08) {
        this.ePrecio08 = ePrecio08;
    }

    public String getePrecio09() {
        return ePrecio09;
    }

    public void setePrecio09(String ePrecio09) {
        this.ePrecio09 = ePrecio09;
    }

    public String getePrecio10() {
        return ePrecio10;
    }

    public void setePrecio10(String ePrecio10) {
        this.ePrecio10 = ePrecio10;
    }

    public String getePrecio11() {
        return ePrecio11;
    }

    public void setePrecio11(String ePrecio11) {
        this.ePrecio11 = ePrecio11;
    }

    public String getePrecio12() {
        return ePrecio12;
    }

    public void setePrecio12(String ePrecio12) {
        this.ePrecio12 = ePrecio12;
    }

    public String getePrecio13() {
        return ePrecio13;
    }

    public void setePrecio13(String ePrecio13) {
        this.ePrecio13 = ePrecio13;
    }

    public String getePrecio14() {
        return ePrecio14;
    }

    public void setePrecio14(String ePrecio14) {
        this.ePrecio14 = ePrecio14;
    }

    public String getePrecio15() {
        return ePrecio15;
    }

    public void setePrecio15(String ePrecio15) {
        this.ePrecio15 = ePrecio15;
    }

    public String getePrecio16() {
        return ePrecio16;
    }

    public void setePrecio16(String ePrecio16) {
        this.ePrecio16 = ePrecio16;
    }

    public String getLiqPrecio01() {
        return liqPrecio01;
    }

    public void setLiqPrecio01(String liqPrecio01) {
        this.liqPrecio01 = liqPrecio01;
    }

    public String getLiqPrecio02() {
        return liqPrecio02;
    }

    public void setLiqPrecio02(String liqPrecio02) {
        this.liqPrecio02 = liqPrecio02;
    }

    public String getLiqPrecio03() {
        return liqPrecio03;
    }

    public void setLiqPrecio03(String liqPrecio03) {
        this.liqPrecio03 = liqPrecio03;
    }

    public String getLiqPrecio04() {
        return liqPrecio04;
    }

    public void setLiqPrecio04(String liqPrecio04) {
        this.liqPrecio04 = liqPrecio04;
    }

    public String getLiqPrecio05() {
        return liqPrecio05;
    }

    public void setLiqPrecio05(String liqPrecio05) {
        this.liqPrecio05 = liqPrecio05;
    }

    public String getLiqPrecio06() {
        return liqPrecio06;
    }

    public void setLiqPrecio06(String liqPrecio06) {
        this.liqPrecio06 = liqPrecio06;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eEmpresa != null ? eEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProductoEtiquetas)) {
            return false;
        }
        InvProductoEtiquetas other = (InvProductoEtiquetas) object;
        if ((this.eEmpresa == null && other.eEmpresa != null) || (this.eEmpresa != null && !this.eEmpresa.equals(other.eEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoEtiquetas[ eEmpresa=" + eEmpresa + " ]";
    }

}
