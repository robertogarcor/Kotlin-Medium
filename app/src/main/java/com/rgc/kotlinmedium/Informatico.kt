package com.rgc.kotlinmedium

class Informatico(name: String, edad: Int): Persona(name, edad) {

    override fun work() {
        println("Esta persona esta trabajando de informatico.")
        // Es la llamada al metodo de la clase superior "Persona"
        super.work()
    }

    override fun myTiempo() {
        println("Yo como informatico, invierto my tiempo en aprender nuevas tecnologias y lenguajes.")
    }


}