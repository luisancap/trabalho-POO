class Carro{
    String marca;
    String placa;
    String modelo;
    int capacidadePassageiro;
    float capacidadeCombustivel;
    float consumoCombustivel;
    void exibirNegocio(){
         float x = this.capacidadeCombustivel * this.consumoCombustivel;
         System.out.println(x);
    }
    float calcComb(float comb){
        return comb/this.consumoCombustivel;
    }
    float custoBeneficio(int preco, int ano){
        return preco/ano;
    }
}
