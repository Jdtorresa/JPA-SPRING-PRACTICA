package entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedores")

public class proveedor {
    @Id
    private String nit;
    @Column(nullable = false, length = 50)
    private String razonSocial;
    @Column(nullable = false, length = 50)
    private String direccion;

    public proveedor(String nit, String razonSocial, String direccion) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    public proveedor(){

    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
