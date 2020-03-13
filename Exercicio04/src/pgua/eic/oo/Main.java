package pgua.eic.oo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declarando três carros
        Carro c1,c2,c3;

        //instanciando
        c1=new Carro();

        //inicializando o carro
        c1.marca="Volks";
        c1.modelo="Fusca";
        c1.ano=1964;
        c1.maxTanque=40;
        c1.cor="Preto";
        c1.potencia=250.0;

        //mostrando o estado do carro
        System.out.println(c1.toString());

        





    }
}
