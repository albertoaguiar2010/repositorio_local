package com.projeto.atribuicaoreferencia;

public class main {
    public static void main(String[] args){

        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB );
        intA =2;
        System.out.println("intA=" + intA + " intB=" + intB );

        MeuObj ObjA = new MeuObj(1);
        MeuObj ObjB = ObjA;
        System.out.println("ObjA=" + ObjA + " ObjB=" + ObjB );
        ObjA.setNum(2);
        System.out.println("ObjA=" + ObjA + " ObjB=" + ObjB );
    }
}
