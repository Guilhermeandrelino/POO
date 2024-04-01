public class Main {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo",
                150.0f,
                4,
                "Amarelo",
                "Terra",
                2.0f,
                "Plantas");
        System.out.println("Informações do Camelo:");
        camelo.dadosMamifero();
        System.out.println();

        Peixe tubarao = new Peixe("Tubarão",
                300.0f,
                0,
                "Cinzento",
                "Mar",
                1.5f,
                "Barbatanas e cauda");
        System.out.println("Informações do Tubarão:");
        tubarao.dadosPeixe();
        System.out.println();

        Mamifero ursocanada = new Mamifero("Urso-do-canadá",
                180.0f,
                4,
                "Vermelho",
                "Terra",
                0.5f,
                "Mel");
        System.out.println("Informações do Urso-do-canadá:");
        ursocanada.dadosMamifero();
    }
    }
