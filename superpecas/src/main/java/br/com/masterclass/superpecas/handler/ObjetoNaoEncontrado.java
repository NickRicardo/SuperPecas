package br.com.masterclass.superpecas.handler;

public class ObjetoNaoEncontrado extends RuntimeException{

    public ObjetoNaoEncontrado (String message) {
        super(message);
    }
}
