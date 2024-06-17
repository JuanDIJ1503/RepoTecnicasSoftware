package com.example.calculadora;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

import MODEL.RaizCuadrada;
import MODEL.Suma;
import UTILS.OperationRaiz;
import UTILS.OperationResta;
import UTILS.OperationSuma;
import MODEL.Resta;

public class TestOperacionesBasicas {
    private static Suma suma;
    private static Resta resta;
    private static RaizCuadrada raizCuadrada;
    @BeforeEach
    public void InicializarObjeto(){
        suma = new Suma();
        resta = new Resta();
        raizCuadrada = new RaizCuadrada();
    }

    @Test
    public void Suma() {
        InicializarObjeto();
        //GIVEN
        suma.setNum2(30);
        suma.setNum1(30);

        //WHEN
        OperationSuma operationSuma = new OperationSuma(suma);

        //THEN
        assertEquals(60,operationSuma.OSuma());
    }
    @Test

    public void Resta(){
        InicializarObjeto();
        //Given
        resta.setNum1(20);
        resta.setNum2(10);

        //wen
        OperationResta operationResta = new OperationResta(resta);
        //then
        assertEquals(10,operationResta.Oresta());
    }

    @Test
    public void RaizCuadrada(){
        InicializarObjeto();

        raizCuadrada.setNumb(25);

        OperationRaiz operationRaiz=new OperationRaiz(raizCuadrada);

        assertEquals(5,operationRaiz.OpRaiz(),0.1);

    }

}

