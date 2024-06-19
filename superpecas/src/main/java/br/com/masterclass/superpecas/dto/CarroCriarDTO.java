package br.com.masterclass.superpecas.dto;

public class CarroCriarDTO {

    private String modelo;

    private String fabricante;

    private String codigoUnico;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    @Override
    public String toString() {
        return "CarroCriarDTO{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", codigoUnico='" + codigoUnico + '\'' +
                '}';
    }
}
