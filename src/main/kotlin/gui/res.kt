package gui

import java.io.File
import java.text.SimpleDateFormat
import java.util.*

fun leerArchivo(fileName: File): MutableList<String> {

    val formatoAndroid = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault())
    val formatoCamara = SimpleDateFormat("ddMMyy_HHmmss", Locale.getDefault())
    val lista = mutableListOf<String>()
    val fotos = mutableListOf<String>()

    fileName.forEachLine { linea ->
        if (linea.startsWith("IMG_")) {
            val nombre = linea.drop(4).dropLast(4)
            val date = formatoAndroid.parse(nombre).time / 1000
            println(formatoAndroid.parse(nombre).time / 1000)
            println(formatoAndroid.parse(nombre).time)
            lista.add("$date IMG")
        }
        if (linea.startsWith("P")) {
            val nombre = linea.drop(1).dropLast(4)
            val date = formatoCamara.parse(nombre).time / 1000
            lista.add("$date P")
        }
    }

    lista.sort()

    lista.forEach { linea ->
        if (linea.endsWith(" IMG")) {
            val nombre = linea.dropLast(4)
            fotos.add( "IMG_" + formatoAndroid.format( Date(nombre.toInt() * 1000L) ).toString() + ".jpg" )
        }
        if (linea.endsWith(" P")) {
            val nombre = linea.dropLast(2)
            fotos.add( "P" + formatoAndroid.format( Date(nombre.toInt() * 1000L) ).toString() + ".jpg" )
        }
    }

    println(fotos)

    return fotos
}