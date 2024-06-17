package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MODEL.AreaFiguras.AreaCuadrado;
import MODEL.AreasFiguras3D.AreaCilindro;
import UTILS.OptAreaFiguras.OperationAreaCuadrado;
import UTILS.OptAreasFiguras3D.OperationAreaCilindro;

public class TestAreaFiguras3D {
    @Test
    public void AreaCilindro(){
        //GIVEN
        AreaCilindro areaCilindro = new AreaCilindro();
        areaCilindro.setRadio(3);
        areaCilindro.setAltura(8);

        //WHEN
        OperationAreaCilindro operationAreaCilindro = new OperationAreaCilindro(areaCilindro);

        //THEN
        assertEquals(207.2,operationAreaCilindro.OAreaCilindro(),0.2);
    }
    @Test
    public void AreaCuadrado(){
        AreaCuadrado areaCuadrado =new AreaCuadrado();
        areaCuadrado.setLado(2);

        OperationAreaCuadrado operationAreaCuadrado = new OperationAreaCuadrado(areaCuadrado);

        assertEquals(4,operationAreaCuadrado.OAreaCuadrado(),0.1);
}
}
