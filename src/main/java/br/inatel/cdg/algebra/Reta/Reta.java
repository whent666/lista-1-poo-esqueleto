package br.inatel.cdg.algebra.Reta;

public class Reta {

    private Ponto p1,p2;

    public Reta(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calcCoeficienteAngular(){
        double coefAngular = 0.0;

        coefAngular = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        if(p1.getX() == p2.getX() && p1.getY() == p2.getY())
            coefAngular = 0.0;
        return coefAngular;

    }

    public double calcCoeficienteLinear(){

        double coefLinear = 0.0;

        coefLinear = p1.getY() - calcCoeficienteAngular()*p1.getX();

        return coefLinear;

    }

}