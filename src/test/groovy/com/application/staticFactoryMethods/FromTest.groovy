package com.application.staticFactoryMethods

import com.application.staticFactoryMethods.relatedEntities.Customer
import spock.lang.Specification

/**
 * Método from:
 * Método de conversión. Toma un único parámetro y retorna una instancia de su tipo.
 */
class FromTest extends Specification{
    def "Prueba de metodo de conversion from(). Dado un Map se convierte a nuevo customer."() {
        given: "Un mapa"
        Map customerData = [:]
        customerData.put("code", "1234")
        customerData.put("name", "nombre1")

        when: "Se crea en base a un map"
        // Por ejemplo, convertir un Map a un customer.
        Customer customer = Customer.from(customerData)

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