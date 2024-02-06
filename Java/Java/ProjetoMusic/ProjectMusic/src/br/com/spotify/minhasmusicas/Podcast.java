package br.com.spotify.minhasmusicas;

public class Podcast extends Audio{
    private String apresentador;
    private String Descricao;



    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
    }else {
        return 8;
    }

    }
}
