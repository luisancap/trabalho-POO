public class App {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        Lampada lampada3 = new Lampada();

        lampada1.setPotencia(60);
        lampada1.cor = "Branca";
        lampada1.formato = "Redonda";
        lampada1.tensao = 110;
        lampada1.tecnologia = "LED";

        lampada2.setPotencia(75);
        lampada2.cor = "Amarela";
        lampada2.formato = "Oval";
        lampada2.tensao = 220;
        lampada2.tecnologia = "Incandescente";

        lampada3.setPotencia(40);
        lampada3.cor = "Azul";
        lampada3.formato = "Cilíndrico";
        lampada3.tensao = 110;
        lampada3.tecnologia = "Fluorescente";

        System.out.println("Lampada 1:");
        lampada1.tostring();
        System.out.println("\n");

        System.out.println("Lampada 2:");
        lampada2.tostring();
        System.out.println("\n");

        System.out.println("Lampada 3:");
        lampada3.tostring();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("João da Silva");
        aluno1.campus = "Campus A";
        aluno1.depressivo = "Não";
        aluno1.matricula = 12345;
        aluno1.notaFinal = 8.5f;

        aluno2.setNome("Maria Oliveira");
        aluno2.campus = "Campus B";
        aluno2.depressivo = "Sim";
        aluno2.matricula = 67890;
        aluno2.notaFinal = 7.2f;

        aluno3.setNome("Carlos Souza");
        aluno3.campus = "Campus C";
        aluno3.depressivo = "Não";
        aluno3.matricula = 11223;
        aluno3.notaFinal = 9.1f;

        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());

        System.out.println("\nCampus dos alunos:");
        System.out.println("Aluno 1: " + aluno1.getCampus());
        System.out.println("Aluno 2: " + aluno2.getCampus());
        System.out.println("Aluno 3: " + aluno3.getCampus());
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setCpf("123.456.789-00");
        pessoa1.rg = "MG-12.345.678";
        pessoa1.nacionalidade = "Brasileira";
        pessoa1.cidade = "Belo Horizonte";
        pessoa1.careca = "Sim";

        pessoa2.setCpf("987.654.321-00");
        pessoa2.rg = "SP-87.654.321";
        pessoa2.nacionalidade = "Brasileira";
        pessoa2.cidade = "São Paulo";
        pessoa2.careca = "Não";

        pessoa3.setCpf("555.666.777-88");
        pessoa3.rg = "RJ-55.666.777";
        pessoa3.nacionalidade = "Brasileira";
        pessoa3.cidade = "Rio de Janeiro";
        pessoa3.careca = "Sim";

        pessoa1.tostring();
        pessoa2.tostring();
        pessoa3.tostring();

        Carro ca = new Carro();
        Carro helicoptero = new Carro();
        Carro moto = new Carro();

        ca.marca = "Toyota";
        ca.placa = "ABC-1234";
        ca.modelo = "Corolla";
        ca.capacidadePassageiro = 5;
        ca.capacidadeCombustivel = 50.0f;
        ca.consumoCombustivel = 12.5f;

        helicoptero.marca = "Volkswagen";
        helicoptero.placa = "XYZ-9876";
        helicoptero.modelo = "Gol";
        helicoptero.capacidadePassageiro = 4;
        helicoptero.capacidadeCombustivel = 45.0f;
        helicoptero.consumoCombustivel = 10.0f;

        moto.marca = "Honda";
        moto.placa = "MOT-1234";
        moto.modelo = "CB 500";
        moto.capacidadePassageiro = 2;
        moto.capacidadeCombustivel = 15.0f;
        moto.consumoCombustivel = 20.0f;

        ca.exibirNegocio();
        helicoptero.exibirNegocio();
        moto.exibirNegocio();

        System.out.println("Custo benefício do carro 'ca': " + ca.custoBeneficio(50000, 2020));
        System.out.println("Custo benefício do carro 'helicoptero': " + helicoptero.custoBeneficio(35000, 2019));
        System.out.println("Custo benefício do carro 'moto': " + moto.custoBeneficio(15000, 2022));

        System.out.println("Combustível necessário para 1000 km (ca): " + ca.calcComb(1000));
        System.out.println("Combustível necessário para 1000 km (helicoptero): " + helicoptero.calcComb(1000));
        System.out.println("Combustível necessário para 1000 km (moto): " + moto.calcComb(1000));

    }
}
