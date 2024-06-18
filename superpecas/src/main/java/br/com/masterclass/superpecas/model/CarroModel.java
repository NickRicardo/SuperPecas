package br.com.masterclass.superpecas.model;

import jakarta.persistence.*;

@Entity
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carro_id")
    private int carro_id;

    @Column(name = "nome_modelo", nullable = false)
    private String nome_modelo;

    @Column(name = "fabricante", nullable = false)
    private String fabricante;

    @Column(name = "codigo_unico", nullable = false)
    private String codigo_unico;

    public int getCarro_id() {
        return carro_id;
    }

    public void setCarro_id(int carro_id) {
        this.carro_id = carro_id;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
    }
}
