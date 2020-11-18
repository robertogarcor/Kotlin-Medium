package com.rgc.kotlinmedium

class Conductor(name: String, edad: Int, var aficion: String): Persona(name, edad) {

    override fun work() {
        println("Esta persona esta trabajando de conductor y tiene una aficion de $aficion")
    }



}