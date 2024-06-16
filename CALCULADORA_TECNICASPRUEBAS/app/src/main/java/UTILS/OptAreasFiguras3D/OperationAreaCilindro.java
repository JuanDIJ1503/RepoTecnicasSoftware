package UTILS.OptAreasFiguras3D;

import MODEL.AreaFiguras.AreaCirculo;
import MODEL.AreasFiguras3D.AreaCilindro;

public class OperationAreaCilindro {

    private AreaCilindro areaCilindro;

    public OperationAreaCilindro(AreaCilindro areaCilindro){
        this.areaCilindro = areaCilindro;
    }

    public double OAreaCilindro(){
        return 2 * Math.PI * areaCilindro.getRadio() * (areaCilindro.getRadio() + areaCilindro.getAltura());
    }
}
