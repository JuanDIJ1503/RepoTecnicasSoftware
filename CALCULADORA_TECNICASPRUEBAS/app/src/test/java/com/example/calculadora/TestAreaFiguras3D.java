package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import MODEL.AreaFiguras.AreaCuadrado;
import MODEL.AreasFiguras3D.AreaCilindro;
import MODEL.AreasFiguras3D.AreaPiramide;
import UTILS.OptAreaFiguras.OperationAreaCuadrado;
import UTILS.OptAreasFiguras3D.OperationAreaCilindro;
import UTILS.OptAreasFiguras3D.OperationAreaPiramide;

public class TestAreaFiguras3D {
    private static AreaCilindro areaCilindro;
    private static AreaCuadrado areaCuadrado;
    @BeforeAll
    static void InicializarObjeto(){
        areaCilindro = new AreaCilindro();
        areaCuadrado = new AreaCuadrado();
    }
    @Test
    public void AreaCilindro(){
        //GIVEN
        InicializarObjeto();
        areaCilindro.setRadio(3);
        areaCilindro.setAltura(8);
        //WHEN
        OperationAreaCilindro operationAreaCilindro = new OperationAreaCilindro(areaCilindro);
        //THEN
        assertEquals(207.2,operationAreaCilindro.OAreaCilindro(),0.2);
    }
    @Test
    public void AreaCuadrado(){
        //GIVEN
        InicializarObjeto();
        areaCuadrado.setLado(2);
        //WHEN
        OperationAreaCuadrado operationAreaCuadrado = new OperationAreaCuadrado(areaCuadrado);
        //THEN
        assertEquals(4,operationAreaCuadrado.OAreaCuadrado(),0.1);
}
    @Test

    public void AreaPiramide(){
        
        AreaPiramide areaPiramide = new AreaPiramide();
        areaPiramide.setbase(6);
        areaPiramide.setaltura(12);
        areaPiramide.setAlturaInclinada(14);

        OperationAreaPiramide operationAreaPiramide = new OperationAreaPiramide(areaPiramide);

        assertEquals(204,operationAreaPiramide.OAreaPiramide(),2);


    }
}
