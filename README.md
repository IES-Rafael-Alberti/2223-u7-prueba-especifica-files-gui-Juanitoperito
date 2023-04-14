[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/0m_96SBN)
# Prueba especifica unidad 7

> Se evaluará el RA5

## 1. Problema 2023 (14)

A Enrique le encanta viajar con sus amigos. Le gusta descubrir nuevos lugares y tomar fotos todo el tiempo. Sin
embargo, al volver a casa, tiene que clasificar y archivar todas las fotografías que él y sus amigos han tomado, y esa
es una tarea muy larga y aburrida. Siempre hay dos tipos de archivos de fotos, los que sacan los smartphones y los
que saca la cámara réflex de Enrique. Los archivos tienen una estructura de nombres diferente, que es la siguiente:

Las cámaras de los **teléfonos inteligentes** usan el formato `IMG_YYYYMMDD_HHMMSS.jpg`, donde `YYYY` es el año,
`MM` es el mes y `DD` es el día del mes. 
Por ejemplo: `IMG_20171203_213455.jpg` corresponde a una foto tomada el 3 de diciembre de 2017 a las 21:34:55.

Los archivos de la cámara Reflex se almacenan en el formato `PDDMMYY_HHMMSS.jpg`, donde `DD` es el día del
mes, `MM` es el mes y `YY` son los dos últimos dígitos de un año (suponiendo que es un año del siglo XXI). 
Por ejemplo: `P031217_213455.jpg` corresponde a una foto tomada el 3 de diciembre de 2017, a las 21:34:55.

En ambos casos,`HHMMSS` es la marca de tiempo, con `HH` para la hora (0 a 23), `MM` para el minuto (0 a 59) y `SS` para
los segundos (0 a 59).

Dados estos dos formatos diferentes, es imposible ordenar los archivos automáticamente por nombre, ya que todos los
`IMG_` se colocarían antes que los `P_`. A Enrique le gustaría obtener un script de Linux para cambiar el nombre de todos
los archivos de manera que incluyan el nombre del lugar que visitaron, seguido de un contador de tres dígitos, que
comienza desde `000` para la imagen más antigua y crece una unidad para cada siguiente foto, ordenadas por fecha y
hora en que fueron tomadas. El comando de Linux `mv` es lo suficientemente bueno para cambiar el nombre de los
archivos de esta manera.

> Nota: la sintaxis del comando `mv` es:
> `mv <origen> <destino>`

> Nota: habrá menos de 1000 fotos en cada colección.

### Entrada

La entrada constará de 3 líneas:

- El nombre del lugar visitado en el viaje. Siempre será una palabra.
- Una lista de los archivos de fotos provenientes de las cámaras del smartphone, separados por un espacio.
- Una lista de los archivos de fotos provenientes de la cámara réflex, separados por un espacio.

### Salida

El resultado será la lista de comandos `mv` a ejecutar para cambiar el nombre de todos los archivos. Enrique también quiere que la lista esté ordenada por el nuevo nombre del archivo, por lo que el primer comando debe ser el que convierta la foto más antigua.

### Ejemplos

![](./.OrdenaFotos_images/8d2ac3f0.png)
![](./.OrdenaFotos_images/2e21bdc7.png)

## 2. ¿Qué se pide?

1. Poder elegir el fichero y lectura de este. Menú item `Abrir` e icono de lapiz.

   ![img.png](./.OrdenaFotos_images/img.png)
2. Procesar el fichero para que muestre el resultado de salida. Menú item `Procesar`. No se podrá procesar si no hay archivo seleccionado. Permaneciendo inactivo mientras tanto.

   ![img.png](./.OrdenaFotos_images/img2.png)
3. Exportar el resultado a un archivo con el mismo path y nombre que el de entrada, con extensión `.sh`.

4. Menú item `Exportar` y botón `Exportar`. Solo permitirá exportar si previamente se ha procesado, permaneciendo inactivo mientras tanto.

## 3. Ejecución y test

Para probar la práctica se utilizarán los archivos `.in` que hay en el directorio `examples` y otro archivos similares.

- Deberá cargar adecuadamente el archivo.
- Deberá procesar la entrada y generar el resultado correcto.
- Deberá exportar el resultado a un archivo.

## 4. Evaluación

### Carga y exporta correctamente el archivo
### La IU funciona como se describe y añade la funcionalidad necesaria
### Procesa adecuadamente el archivo según el problema descrito.

Además, se tendrá en cuenta otras cosas como:
- Hace gestión de errores adecuados
- Se hace uso de estructuras de datos propias y trabajadas: List, Maps, etc
- Separa la lógica en archivos y paquetes en función de las responsabilidades
- Usas clases adecuadamente, respectando responsabilidades
- Usa herencia y polimorfismo
- Utiliza TDD, test de unidad, mocks
- Genera documentación sobre mayoría de las clases (Kdoc)
- El código tiene comentarios
- Estilo. nombres adecuados y correctos en clases, metodos, variables. Codigo limpio
- El código realizado es óptimo.
- Se cumple requisitos de entrega.

## 5. Condiciones de entrega

Se entrega la URL al repositorio.

## 4. Bibliografía
