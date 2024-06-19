package br.com.masterclass.superpecas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carros")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarroID")
    private Integer carroID;

    @Column(name = "NomeModelo", nullable = false)
    private String nomeModelo;

    @Column(name = "Fabricante", nullable = false)
    private String fabricante;

    @Column(name = "CodigoUnico", nullable = false, unique = true)
    private String codigoUnico;

    public Integer getCarroID() {
        return carroID;
    }

//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @OneToMany(mappedBy = "carro", fetch = FetchType.LAZY)
//    private Set<PecasModel> pecas = new HashSet<>();

    public void setCarroID(Integer carroID) {
        this.carroID = carroID;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }
}
