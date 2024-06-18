package com.example.calculadora;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

import MODEL.Multiplicacion;
import MODEL.RaizCuadrada;
import MODEL.Suma;
import UTILS.OperacionMultiplicacion;
import UTILS.OperationRaiz;
import UTILS.OperationResta;
import UTILS.OperationSuma;
import MODEL.Resta;

public class TestOperacionesBasicas {
    private static Suma suma;
    private static Resta resta;
    private static RaizCuadrada raizCuadrada;
    @BeforeAll
    public void InicializarObjeto(){
        suma = new Suma();
        resta = new Resta();
        raizCuadrada = new RaizCuadrada();
    }

    @Test
    public void Suma() {
        //GIVEN
        InicializarObjeto();
        suma.setNum2(30);
        suma.setNum1(30);

        //WHEN
        OperationSuma operationSuma = new OperationSuma(suma);

        //THEN
        assertEquals(60,operationSuma.OSuma());
    }
    @Test

    public void Resta(){
        //Given
        InicializarObjeto();
        resta.setNum1(20);
        resta.setNum2(10);
        //wen
        OperationResta operationResta = new OperationResta(resta);
        //then
        assertEquals(10,operationResta.Oresta());
    }

    @Test
    public void RaizCuadrada(){
        //GIVEN
        InicializarObjeto();
        raizCuadrada.setNumb(25);
        //WHEN
        OperationRaiz operationRaiz=new OperationRaiz(raizCuadrada);
        //THEN
        assertEquals(5,operationRaiz.OpRaiz(),0.1);

    }
    @Test
    public void Multiplicacion(){
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setNum1(2);
        multiplicacion.setNum2(2);

        OperacionMultiplicacion operacionMultiplicacion = new OperacionMultiplicacion(multiplicacion);
        assertEquals(4,operacionMultiplicacion.Omultiplicacion());

    }

}

