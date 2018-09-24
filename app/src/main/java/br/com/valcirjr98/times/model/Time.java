package br.com.valcirjr98.times.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Time implements Serializable {
    private String nome;
    private String pais;
    private String ano;
    private int imagemLogo;

    public Time(){

    }

    public Time(String nome, String pais, String ano, int imagemLogo) {
        this.nome = nome;
        this.pais = pais;
        this.ano = ano;
        this.imagemLogo = imagemLogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAno(){ return ano; }

    public void setAno(String ano){ this.ano = ano; }

    public int getImagemLogo() {
        return imagemLogo;
    }

    public void setImagemLogo(int imagemLogo) {
        this.imagemLogo = imagemLogo;
    }
}
