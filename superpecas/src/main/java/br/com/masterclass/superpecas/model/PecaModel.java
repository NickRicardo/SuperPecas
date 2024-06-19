package br.com.masterclass.superpecas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pecas")
public class PecaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pecaID")
    private int pecaID;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "numeroSerie", nullable = false)
    private String numeroSerie;

    @Column(name = "fabricante", nullable = false)
    private String fabricante;

    @Column(name = "modeloCarro", nullable = false)
    private String modeloCarro;

    public int getPecaID() {
        return pecaID;
    }

    public void setPecaID(int pecaID) {
        this.pecaID = pecaID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
}
