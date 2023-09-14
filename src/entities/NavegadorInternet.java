package entities;

public class NavegadorInternet {
    private String estado;

    public NavegadorInternet() {
        estado = "Inativo";
    }

    public void exibirPagina() {
        if (estado.equals("Inativo")) {
            estado = "Exibindo Página";
            System.out.println("Página web exibida");
        }else {
            System.out.println("Uma página já está sendo exibida.");
        }
    }

    public void adicionarNovaAba() {
        estado = "Inativo";
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        if(estado.equals("Exibindo página")) {
            System.out.println("Página da web atualizaa.");
        }else {
            System.out.println("Não há página para atualizar.");
        }
    }
}
