package poo2021.poo.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class RegistroTelefonico extends Informacion {
    @Column
    private String numeroOrigen;

    @Column
    private String numeroDestino;

    @Column
    private Integer duracion;

    public String getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(String numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
