package com.example.whereproject;

public class CodigoInten {

    private String codigo;
    private String mostrarCodigo;

    public CodigoInten (String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        this.mostrarCodigo =  this.mostrarCodigo = codigo;
        return mostrarCodigo;
    }
}
