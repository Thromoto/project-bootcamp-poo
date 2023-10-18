import br.com.projeto.dominio.Bootcamp;
import br.com.projeto.dominio.Curso;
import br.com.projeto.dominio.Dev;
import br.com.projeto.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNome1 = new Dev();
        devNome1.setNome("João");
        devNome1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devNome1.getConteudosInscritos());
        devNome1.progredir();
        devNome1.progredir();
        devNome1.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos" + devNome1.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devNome1.getConteudosConcluidos());
        System.out.println("XP " + devNome1.calcularTotalXp());

        System.out.println("-----------------");

        Dev devNome2 = new Dev();
        devNome2.setNome("Camila");
        devNome2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devNome2.getConteudosInscritos());
        devNome2.progredir();
        devNome2.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos" + devNome2.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devNome2.getConteudosConcluidos());
        System.out.println("XP " + devNome2.calcularTotalXp());
    }
}
