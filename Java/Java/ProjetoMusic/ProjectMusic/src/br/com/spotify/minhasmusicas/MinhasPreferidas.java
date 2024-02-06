package br.com.spotify.minhasmusicas;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " É da suas favoritas!");
        } else  {
            System.out.println(" Excelente opção!");
        }
    }
}
