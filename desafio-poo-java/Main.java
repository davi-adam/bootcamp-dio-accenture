import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring");
        curso2.setDescricao("Aprendendo Spring");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirando dúvidas");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para iniciantes em Java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosInscritos());

        devDavi.progredir();
        devDavi.progredir();

        System.out.println("Conteúdos concluídos: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());

    }
}
