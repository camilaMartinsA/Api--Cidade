package com.github.camilaMartinsA.citiesapi;

import  javax.persistence.Column ;
import  javax.persistence.Entity ;
import  javax.persistence.Id ;
import  javax.persistence.Table ;

@Entity ( name  =  " Country " )
@Table ( name  =  " pais " )

public class Country {
    @Identificação
    ID longa privada ;

    @Column ( name  =  " nome " )
    nome da string privada ;

    @Column ( name  =  " nome_pt " )
    private  String portugueseName;

    @Column ( name  =  " sigla " )
    código String privado ;

    bacen inteiro privado ;

    public  Country () {
    }

    public  Long  getId () {
        return id;
    }

    public  String  getName () {
        nome de retorno ;
    }

    public  String  getPortugueseName () {
        return portugueseName;
    }

    public  String  getCode () {
        código de retorno ;
    }

    public  Integer  getBacen () {
        return bacen;
    }
}
}
