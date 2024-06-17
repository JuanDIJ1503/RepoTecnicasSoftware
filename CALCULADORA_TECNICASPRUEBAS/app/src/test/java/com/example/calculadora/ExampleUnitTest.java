package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

import MODEL.AreaFiguras.AreaCirculo;
import MODEL.AreaFiguras.AreaTriangulo;
import MODEL.AreasFiguras3D.AreaCilindro;
import MODEL.Suma;
import UTILS.OperationResta;
import UTILS.OperationSuma;
import UTILS.OptAreaFiguras.OperationAreaCirculo;
import UTILS.OptAreaFiguras.OperationAreaTriangulo;
import UTILS.OptAreasFiguras3D.OperationAreaCilindro;
import MODEL.Resta;

public class ExampleUnitTest {
    @Test
    public void Suma() {
        //GIVEN
        Suma suma = new Suma();
        suma.setNum2(30);
        suma.setNum1(30);

        //WHEN
        OperationSuma operationSuma = new OperationSuma(suma);

        //THEN
        assertEquals(60,operationSuma.OSuma());
    }
    @Test
    public void AreaCirculo(){
        //GIVEN
        AreaCirculo areaCirculo = new AreaCirculo();
        areaCirculo.setRadio(5);

        //WHEN
        OperationAreaCirculo operationAreaCirculo = new OperationAreaCirculo(areaCirculo);

        //THEN
        assertEquals(78.5,operationAreaCirculo.OAreaCirculo(),0.1);
    }

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

    public void Resta(){
        //Given
        Resta resta = new Resta();
        resta.setNum1(20);
        resta.setNum2(10);

        //wen
        OperationResta operationResta = new OperationResta(resta);

        //then

        assertEquals(10,operationResta.Oresta());


    }

}

