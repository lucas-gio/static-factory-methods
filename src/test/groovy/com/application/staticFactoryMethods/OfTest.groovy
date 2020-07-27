package com.application.staticFactoryMethods

import com.application.staticFactoryMethods.relatedEntities.CustomerFrequency
import spock.lang.Specification

/**
 * Método of:
 * Método de agregación. Toma múltiples parámetros y retorna una instancia que los incorpora.
 */
class OfTest extends Specification{
    def "Prueba un metodo de agregación of(). Dado objetos de un enum, se obtiene un conjunto de ellos."(){
        when: "Se obtiene un conjunto de frecuencias de clientes"
        Set<CustomerFrequency> customerFrequenciesToVerify = EnumSet.of(
                CustomerFrequency.FIRST_TIME,
                CustomerFrequency.NOT_FREQUENT,
                CustomerFrequency.LESS_FREQUENT)

        then: "Se verifica que se obtienen los objetos esperados"
        customerFrequenciesToVerify.size() == 3
        customerFrequenciesToVerify.containsAll([
                CustomerFrequency.FIRST_TIME,
                CustomerFrequency.NOT_FREQUENT,
                CustomerFrequency.LESS_FREQUENT
        ])
    }
}
