package Cinema.Ingressos;

public non-sealed class IngressoMeiaEntrada extends Ingresso{



    public double getVr(){
        return getValor() / 2;
    }

    public void imprimeIngresso(){
        System.out.println("Ingresso Meia Entrada");
        System.out.println("Filme: " + getFilme());
        if (getDublado()){
            System.out.println("Legendado");
        }else{
            System.out.println("Dublado");
        }
        System.out.println("Valor: " + getVr());
    }

}
