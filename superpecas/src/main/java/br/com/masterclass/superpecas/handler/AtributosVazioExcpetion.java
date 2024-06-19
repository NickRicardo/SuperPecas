package br.com.masterclass.superpecas.handler;

public class AtributosVazioExcpetion extends RuntimeException{

    public AtributosVazioExcpetion(){
        super ("O Atributo deve ser preenchido.");
    }

    public AtributosVazioExcpetion(String message){
        super(message);
    }
}
