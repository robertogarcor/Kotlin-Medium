package com.rgc.kotlinmedium

/**
 * Las interfaces son clases que permiten agrupar acciones o comportamientos comunes
 * de otras clases o entidades. No permiten declarar su estado. Esto solo podra realizarse
 * a traves de las clases o entidades que implementen la interface
 * Las interfaces no pueden tener tampoco un constructor, solo una lista de variables o metodos.
 */
interface Programar {

    var lenguaje: String

    fun programando()

    fun testeando() {
        println ("Estoy testeando la aplicacion $lenguaje")
    }

}