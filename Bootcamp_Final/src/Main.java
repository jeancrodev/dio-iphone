import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1.toString());
        //System.out.println(mentoria1.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Bootcamp");
        bootcamp.setDescricao("Java Bootcamp");
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso1);

        Dev dev1 = new Dev();
        dev1.setNome("Jean");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXP());
    }
}

