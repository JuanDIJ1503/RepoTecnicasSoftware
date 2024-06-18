package UTILS;

import MODEL.Multiplicacion;

public class OperacionMultiplicacion {
    private Multiplicacion mutiplicacion;
    public OperacionMultiplicacion(Multiplicacion multiplicacion){
        this.mutiplicacion = multiplicacion ;
    }

    public int Omultiplicacion(){
        return mutiplicacion.getNum1() * mutiplicacion.getNum2();
    }


}
