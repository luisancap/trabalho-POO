class Lampada{
    int potencia;
    String cor;
    String formato;
    int tensao;
    String tecnologia;

    void setPotencia(int potencia){
        this.potencia = potencia;
    }
    String getCor(){
        return cor;
    }
    void tostring(){
        System.out.printf("Potencia: %d, cor: %s, formato: %s, tensao: %d, tecnologia: %s", potencia, cor, formato, tensao, tecnologia);
    }

}
