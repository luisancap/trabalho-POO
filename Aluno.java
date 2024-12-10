class Aluno{
    String nome;
    String campus;
    String depressivo;
    int matricula;
    float notaFinal;

    void setNome(String nome){
        this.nome = nome;
    }
    String getCampus(){
        return campus;
    }
    void tostring(){
        System.out.printf("nome: %s, campus: %s, depressivo: %s, matricula: %i, nota final: %f", nome, campus, depressivo, matricula, notaFinal);
    }
}
