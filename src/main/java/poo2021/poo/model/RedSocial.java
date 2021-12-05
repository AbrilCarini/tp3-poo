package poo2021.poo.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class RedSocial extends Informacion {

    @Column
    private String tipo;

    @Column
    private String perfil;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
