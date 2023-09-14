package entities;

public class ReprodutorMusical {
    private String estado;
    private String musicaAtual;

    public ReprodutorMusical() {
        estado = "Pausado";
        musicaAtual = "";
    }

    public void tocar() {
        if(musicaAtual.isEmpty()) {
            System.out.println("Selecione uma música antes de tocar.");
        } else {
            estado = "Tocando";
            System.out.println("Tocando música: " + musicaAtual);
        }
    }
    public void pausar() {
        estado = "Pausado";
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String muscia) {
        musicaAtual = muscia;
        System.out.println("Música selecionada: " + muscia);
    }


}
