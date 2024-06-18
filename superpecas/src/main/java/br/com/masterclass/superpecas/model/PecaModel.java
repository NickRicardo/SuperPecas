package br.com.masterclass.superpecas.model;

import jakarta.persistence.*;

@Entity
public class PecaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peca_id")
    private int peca_id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "numero_serie", nullable = false)
    private String numero_serie;

    @Column(name = "fabricante", nullable = false)
    private String fabricante;

    @Column(name = "modelo_carro", nullable = false)
    private String modelo_carro;

    public int getPeca_id() {
        return peca_id;
    }

    public void setPeca_id(int peca_id) {
        this.peca_id = peca_id;
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

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }
}
