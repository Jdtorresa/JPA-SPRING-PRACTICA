package entidad;

import jakarta.persistence.*;

@Entity
@Table(name ="productos")
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    @Column(nullable = false, length = 50)
    private String referencia;
    @Column(nullable = false, length = 50)
    private Integer precio;
    @ManyToOne
    @JoinColumn(name = "nit_proveedor", referencedColumnName = "nit")
    private proveedor proveedor;


    public producto(String referencia, Integer precio, entidad.proveedor proveedor) {
        this.referencia = referencia;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public producto() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public entidad.proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(entidad.proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
