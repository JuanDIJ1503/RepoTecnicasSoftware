package UTILS;

import MODEL.Suma;

public class OperationSuma {
    private Suma suma;
    public OperationSuma(Suma suma){
        this.suma = suma;
    }
    public int OSuma(){
        return suma.getNum1() + suma.getNum2();
    }
}
