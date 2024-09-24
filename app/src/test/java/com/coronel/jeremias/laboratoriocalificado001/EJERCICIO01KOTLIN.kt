package com.coronel.jeremias.laboratoriocalificado001

import org.junit.Test

class EJERCICIO01KOTLIN {

    //Esta funcion es para contar la frecuencia de caracteres en una palabra
    fun contarFrecuenciaCaracteres(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>()  //Utlize mutableMapOf para crear un Mapa vacío para guardar las frecuencias de cada caracter

        for (caracter in palabra) {  //Aqui se recorrre  cada carácter de la palabra
            if (frecuencia.containsKey(caracter)) {
                //Si el carácter ya está en el mapa, aumentamos su valor en 1
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                //Si no está en el mapa, lo añadimos con valor 1
                frecuencia[caracter] = 1
            }
        }

        return frecuencia  //Aqui Devolvemos el mapa con las frecuencias
    }

    @Test
    //Aqui verificamos el funcionamiento de la funcion contarFrecuenciaCaracteres
    fun testContarFrecuenciaCaracteres() {
        val palabra = "jeremias"  //Aqui escribimos la palabra que queremos contar
        val resultado = contarFrecuenciaCaracteres(palabra)  //Aqui llamamos a la función
        println(resultado)
    }
}
