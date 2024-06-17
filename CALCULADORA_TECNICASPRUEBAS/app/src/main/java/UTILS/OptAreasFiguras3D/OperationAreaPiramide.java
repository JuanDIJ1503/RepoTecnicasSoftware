package UTILS.OptAreasFiguras3D;

import MODEL.AreasFiguras3D.AreaCilindro;
import MODEL.AreasFiguras3D.AreaPiramide;

public class OperationAreaPiramide {
    private AreaPiramide areaPiramide;

    public OperationAreaPiramide(AreaPiramide areaPiramide){
        this.areaPiramide= areaPiramide ;
    }

    public double OAreaPiramide(){
        double baseArea = areaPiramide.getbase() * areaPiramide.getbase();
        double lateralArea = areaPiramide.getbase() * areaPiramide.getSlantHeight() * 2;
        double OAreaPiramide = baseArea + lateralArea;
        return OAreaPiramide ;

    }

}
