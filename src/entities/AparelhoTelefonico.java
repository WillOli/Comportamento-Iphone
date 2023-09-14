package entities;

public class AparelhoTelefonico {

    private String estado;

    public AparelhoTelefonico() {
        estado = "Desligado";
    }

    public void ligar() {
        estado = "Ligado";
        System.out.println("Aparelho telefônico ligado.");
    }

    public void atender() {
        if (estado.equals("Ligado")) {
            System.out.println("Atendendo chamada.");
        } else {
            System.out.println("O aparelho não está ligado.");
        }
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }




}
