package poo2021.poo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MovimientoBancario extends Informacion {
    @Column
    private String cuenta;

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
