class Pessoa{
    String cpf;
    String rg;
    String nacionalidade;
    String cidade;
    String careca;

    void setCpf(String cpf){
        this.cpf = cpf;
    }
    String getNacionalidade(){
        return nacionalidade;
    }
    void tostring(){
        System.out.printf("CPF: %s, RG: %s, nacionalidade: %s, cidade: %s, careca: %s", cpf, rg, nacionalidade, cidade, careca);
    }
}
