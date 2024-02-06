package br.com.spotify.principal;

import br.com.spotify.minhasmusicas.Audio;
import br.com.spotify.minhasmusicas.MinhasPreferidas;
import br.com.spotify.minhasmusicas.Musica;
import br.com.spotify.minhasmusicas.Podcast;

public class Principal extends Audio {
    public static void main(String[] args) {

    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Forever");
    minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.Curti();

        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.Curti();

        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
