package com.rgc.kotlinmedium

/**
 * Class Anidada y Interna
 */
class MyNestedAndInnerClasses {

    private val two = 2

    /**
     * Class anidada (Nested Class)
     */
    class MyNestedClass {
        /**
         * Funcion suma
         */
        fun sum(num1: Int, num2: Int) : Int {
            return num1 + num2
        }
    }

    /**
     * Class interna (Inner Class)
     * La declaración inner es necesaria si queremos acceder a la
     * variable privada "two" declarada en un nivel superior/classe superior
     */
    inner class MyInnerClass {
        fun sumTwo(num: Int) : Int {
            return num + two;

        }
    }
}