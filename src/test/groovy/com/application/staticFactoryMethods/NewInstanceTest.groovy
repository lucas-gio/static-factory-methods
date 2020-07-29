package com.application.staticFactoryMethods

import com.application.staticFactoryMethods.relatedEntities.Customer
import spock.lang.Specification

import java.lang.reflect.Array

/**
 * Método newInstance() o create().
 * Método de creación. Puede tomar n parámetros. Asegura que cada llamado retorna una nueva instancia.
 */
class NewInstanceTest extends Specification{
    def "Prueba de metodo de creacion newInstance(). Se obtiene una nueva instancia por cada llamado."() {
        given:"Un listado de 5000 hashcode creados con new instance"
        List<Integer> arrays = []
        5000.times{
            arrays << Array.newInstance(Integer, 500).hashCode()
        }

        expect: "Se espera que sean todas instancias diferentes"
        arrays.unique().size() == 5000
    }
}
