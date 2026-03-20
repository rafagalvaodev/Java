import entity.Bootcamp;
import entity.Course;
import entity.Developer;
import entity.Mentoring;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course curso1 = new Course();
        curso1.setTittle("curso java");
        curso1.setDescription("descrição curso java");
        curso1.setCourseLoad(12);

        Course curso2 = new Course();
        curso2.setTittle("curso C#");
        curso2.setDescription("descrição curso C#");
        curso2.setCourseLoad(10);

        Mentoring mentoria = new Mentoring();
        mentoria.setTittle("mentoria de java");
        mentoria.setDescription("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContent().add(curso1);
        bootcamp.getContent().add(curso2);
        bootcamp.getContent().add(mentoria);

        Developer devPedrinhoMatador = new Developer();
        devPedrinhoMatador.setName("Pedrinho");
        devPedrinhoMatador.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedrinho:" + devPedrinhoMatador.getSubscriberContent());
        devPedrinhoMatador.progress();
        devPedrinhoMatador.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedrinho:" + devPedrinhoMatador.getSubscriberContent());
        System.out.println("Conteúdos Concluídos Pedrinho:" + devPedrinhoMatador.getSubscriberContent());
        System.out.println("XP:" + devPedrinhoMatador.calculateXPTotal());

        System.out.println("-------");

        Developer devJuaoFlorindo = new Developer();
        devJuaoFlorindo.setName("Joao");
        devJuaoFlorindo.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos JuaoFlorindo:" + devJuaoFlorindo.getSubscriberContent());
        devJuaoFlorindo.progress();
        devJuaoFlorindo.progress();
        //devJuaoFlorindo.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos JuaoFlorindo:" + devJuaoFlorindo.getSubscriberContent());
        System.out.println("Conteúdos Concluidos JuaoFlorindo:" + devJuaoFlorindo.getSubscriberContent());
        System.out.println("XP:" + devJuaoFlorindo.calculateXPTotal());

    }

}