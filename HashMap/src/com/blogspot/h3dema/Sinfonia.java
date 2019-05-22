package com.blogspot.h3dema;

/**
 * classe que será armazenada no HashMap
 * usaremos opus com chave única
 * @author Henrique
 */
public class Sinfonia {

    // campo privativos
    private String opus;
    private String nome;
    private String periodo;

    // construtor da classe
    Sinfonia(String opus, String nome, String periodo) {
        this.opus = opus;
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return getOpus() + " - " + getNome() + " [" + getPeriodo() + "]";
    }

    public String getOpus() {
        return opus;
    }

    public void setOpus(String opus) {
        this.opus = opus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
