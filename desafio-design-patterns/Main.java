public class Main {

    public static void main(String[] args) {

        // Singleton
        Singleton singleton = Singleton.getInstancia();
        singleton.mostrarMensagem();

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Davi", "88700-000");
    }
}
