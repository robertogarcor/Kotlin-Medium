package com.rgc.kotlinmedium

/**
 * Persona Class, cualquier clase hereda de una classe superior "Any" -> "Object" a Java
 * Por defecto todas las clases en Kotlin son final, para poder hacer uso es necesario
 * la clausula "open"
 *
 * La clase persona a su vez hereda de una clase Abstract Pasatiempo que las clases
 * que heredan de Persona tambien pueden hacer uso o reescribir sus metodos.
 *
 * Una clase no puede heredar de varias clases igual que en Java, para ello es necesario
 * hacer uso de Interfaces.
 *
 * La clase Persona implementa la interface Programar. Esta accion da lugar a que debemos
 * implementar todas su variables y sus metodos (por obligación solo aquellos que no
 * tienen definido un estado). Aquellos metodos que tienen definido un estado pueden ser
 * implementados y asi sobreescribir su estado por defecto
 *
 */
open class Persona(name: String, edad: Int) : Pasatiempo(), Programar {

    /**
     * Metodo clase persona. Para poder sobreescribir es tambien necesario incluir
     * la clausula "open"
     */
    open fun work() {
        println("Esta persona esta trabajando.")
    }

    override fun myTiempo() {
        // TODO("Not yet implemented")
        println("My tiempo lo invierto en lo que me gusta.")
    }

    /**
     * Metodo disponible que todas las clases heredan de la clase "Any"
     */
    override fun toString(): String {
        return super.toString()
    }

    // Interface Programar
    // El metodo testeando al tener un estado no es necesario implementarlo,
    // solo si queremos sobreescribirlo

    override var lenguaje: String = "JAVA"

    override fun programando() {
        println("Estoy programado en el lenguaje $lenguaje")
    }

}