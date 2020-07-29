package com.application.staticFactoryMethods

import com.application.staticFactoryMethods.relatedEntities.Customer
import spock.lang.Specification

/**
 * Método valueOf: ALIAS DE FROM.
 * Método de conversión. Toma un único parámetro y retorna una instancia de su tipo.
 */
class ValueOfTest extends Specification{
    def "Prueba de metodo de conversion valueOf(). Dado un Map se convierte a nuevo customer."() {
        given: "Un mapa"
        Map customerData = [:]
        customerData.put("code", "1234")
        customerData.put("name", "nombre1")

        when: "Se crea en base a un map"
        // Por ejemplo, convertir un Map a un customer.
        Customer customer = Customer.valueOf(customerData)

        then: "Se obtiene el cliente esperado"
        customer.code == "1234"
        customer.name == "nombre1"
        customer.lastName == null
        customer.birthDate == null
        customer.registrationDate == null
        customer.lastPurchaseDate == null
        customer.isActive == null
    }
}