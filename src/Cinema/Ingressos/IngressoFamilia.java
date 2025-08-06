package Cinema.Ingressos;

public non-sealed class IngressoFamilia extends Ingresso{

    private int pessoas;

    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

    public double getVr(){

        if (pessoas >=3 ){
            return ((getValor() * pessoas) - ((getValor() * pessoas) * 0.05));
        }
        return this.getValor() * pessoas;

    }

    public void imprimeIngresso(){
        System.out.println("Ingresso Família");
        System.out.println("Filme: " + getFilme());
        if (getDublado()){
            System.out.println("Legendado");
        }else{
            System.out.println("Dublado");
        }
        System.out.println("Valor: " + this.getVr());
        System.out.println("Pessoas: " + pessoas);
    }

}
