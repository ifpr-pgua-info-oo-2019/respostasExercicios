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

        c1.abastecer(20);
        System.out.println(c1.toString());

        c1.acelerar();

        //mostrando o estado do carro
        System.out.println(c1.toString());

        //instanciando
        c2=new Carro();

        //inicializando o carro
        c2.marca="Chevrolet";
        c2.modelo="Chevet";
        c2.ano=1956;
        c2.maxTanque=35;
        c2.cor="Azul";
        c2.potencia=300.0;

        //mostrando o estado do carro
        System.out.println(c2.toString());


        //instanciando
        c3=new Carro();

        //inicializando o carro
        c3.marca="Ford";
        c3.modelo="F1000";
        c3.ano=1976;
        c3.maxTanque=60;
        c3.cor="Verde";
        c3.potencia=700.0;

        //mostrando o estado do carro
        System.out.println(c3.toString());



    }
}
