package UTILS.OptAreaFiguras;

import MODEL.AreaFiguras.AreaCirculo;

public class OperationAreaCirculo {
    AreaCirculo areaCirculo;

    public OperationAreaCirculo(AreaCirculo areaCirculo){
        this.areaCirculo = areaCirculo;
    }

    public double OAreaCirculo(){
        return Math.PI * Math.pow(areaCirculo.getRadio(),2);
    }
}
