public class Facade {

    public void migrarCliente(String nome, String cep) {

        System.out.println("Buscando cidade pelo CEP...");
        System.out.println("Salvando cliente: " + nome);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}
