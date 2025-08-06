package Cinema.Ingressos;

public sealed abstract class Ingresso permits IngressoMeiaEntrada, IngressoFamilia {

    private double valor;
    private String filme;
    private boolean dublado;


    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public String getFilme(){
        return this.filme;
    }

    public void setDublado(boolean dublado){
        this.dublado = dublado;
    }

    public boolean getDublado(){
        return this.dublado;
    }



}

