package UTILS;
import MODEL.RaizCuadrada;
public class OperationRaiz {
    private  RaizCuadrada raizCuadrada;

    public OperationRaiz(RaizCuadrada raizCuadrada){this.raizCuadrada=raizCuadrada;}
    public double OpRaiz(){return Math.sqrt(raizCuadrada.getNumb());}


}
