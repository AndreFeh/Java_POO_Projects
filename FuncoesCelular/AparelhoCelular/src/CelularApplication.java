import com.celular.model.AparelhoTelefonico;
import com.celular.model.NavegarInternet;
import com.celular.model.ReprodutorMusical;

public class CelularApplication {
    public static void main(String[] args) {
        System.out.println("\nTelefone");
        AparelhoTelefonico ligacao = new AparelhoTelefonico();
        ligacao.atender();
        ligacao.ligar();
        ligacao.iniciarCorreioVoz();

        System.out.println("\nInternet");
        NavegarInternet internet = new NavegarInternet();
        internet.adicionarNovaAba();
        internet.exibirPagina();
        internet.atualizarPagina();

        System.out.println("\nMusica");
        ReprodutorMusical musica = new ReprodutorMusical();
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
    }
}