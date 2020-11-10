package com.rgc.kotlinmedium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes -> Clases enumeradoras
        enumClasses()

    }

    /**
     * Classe Enumeradora para declarar valores seguros o predeterminados
     * Puede tener ninguno o varios parametros de asignación
     */
    enum class Colors(val car: String, val num: Int) {

        CIAN("CA",10),
        YELLOW("YE", 20),
        MAGENTA("MG",30),
        WHITE("WH",40),
        BLACK("BL",50);

        fun description(): String {
            return when (this) {
                CIAN -> "El color es azul"
                YELLOW -> "El color es amarillo"
                MAGENTA -> "El color es rojo"
                WHITE -> "El color es blanco"
                BLACK -> "El color es negro"
            }
        }
    }

    /**
     * Enum Class en Kotlin
     */
    fun enumClasses() {

        // Asignar valores de la clase enumeradora
        var tableColor: Colors? = null
        println("La tabla es de color: $tableColor")

        tableColor = Colors.MAGENTA
        println("La tabla es de color: $tableColor")

        tableColor = Colors.CIAN
        println("La tabla es de color: $tableColor")

        // Propiedades principales por defecto
        println("Propiedad name: ${tableColor.name}") // Representa al nombre
        println("Propiedad ordinal: ${tableColor.ordinal}") // Representa a la orden/pos que posee 0...X

        // Otras propiedades
        println("Propiedad values sobre la classe : ${Colors.values()[2]}") // Retorna array valores posibles
        println("Propiedad valueOf sobre la classe : ${Colors.valueOf("MAGENTA")}")

        // Llamada a funciones
        println("La descripción es: ${tableColor.description()}")

        // Llamada a parametros de la clase enumeradora (Si tiene definidos)
        println("El parametro correspondiente al valor Entero actual es ${tableColor.num}")
        println("El parametro correspondiente al valor String actual es ${tableColor.car}")

    }

}