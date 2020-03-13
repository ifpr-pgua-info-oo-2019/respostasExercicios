package pgua.eic.oo;

public class Carro {

    public String cor;
    public String modelo;
    public String marca;
    public int ano;
    public double potencia;
    public double velocidadeAtual;
    public double qtdeCombustivel;
    public double maxTanque;



    public String toString(){

        String s="";

        s+="[Modelo:"+modelo;
        s+=" Marcar:"+marca;
        s+=" Cor:"+cor;
        s+=" Ano:"+ano;
        s+=" Potencia:"+potencia;
        s+=" Velocidade:"+velocidadeAtual;
        s+=" Qtde Combustivel:"+qtdeCombustivel;
        s+=" Máximo Tanque:"+maxTanque;
        s+="]";

        return s;
    }



}
