package UTILS.OptAreasFiguras3D;

import MODEL.AreasFiguras3D.AreaEsfera;

public class OperationAreaEsfera {
    AreaEsfera areaEsfera;

    public OperationAreaEsfera(AreaEsfera areaEsfera){
        this.areaEsfera = areaEsfera;
    }

    public double OAreaEsfera(){
        return 4* Math.PI * Math.pow(areaEsfera.getRadio(),2);
    }
}
