# Calculadora

***Finalidad del proyecto: Entender el uso de las librerias en Java, el control de errores y uso de parámetros***

---
En java el concepto de librerías se puede entender como un conjunto de clases, que poseen una serie de métodos y atributos.

Estas librerías facilitan las operaciones en proyectos externos, en los cuales podemos reutilizar líneas de código que estas ya poseen, evitando así tener que implementar reiteradamente estas funcionalidades.

Para más información acerca de librerías, puede revisitar el siguiente [enlace.](https://www.programarya.com/Cursos/Java/Librerias)

---
### Procedimiento:

Para el caso de esta calculadora, como es obvio, se requiere de ingresar: **números** para realizar la operación, además de **pedir al usuario** la acción matemática deseada.

Estos datos  no son más que solicitudes de entrada de datos de clase **Integer**; estas líneas de código fueron importadas de la clase *EntradaSalida* mediante la adición de la librería que tiene el mismo nombre (en formato JAR).

___File > Project Structure... > Libraries > + > Seleccionar el JAR (EntradaSalida) en la ruta que lo contiene___

---
### Manejo de Errores:

Como es de esperarse, el programa debe estar preparado para reaccionar ante una entrada de información no adecuada para la operación. Para ello se empleó el uso de [excepciones.](https://jarroba.com/excepciones-exception-en-java-con-ejemplos/)

En este caso, capturamos el error en caso de que los valores (clase Integer) para operar fuesen letras (valores nulos), se visualice un mensaje reiterando esta condición.

Ahora bien, para el caso del **resultado** (clase Float), este podía arrojar el error de que sea NaN.

___NaN: significa "no es un número". Se produce "Nan" si una operación de punto flotante tiene algunos parámetros de entrada que hacen que la operación produzca algún resultado indefinido. Por ejemplo, 0,0 dividido por 0,0 no está definido aritméticamente.___

Una manera de comprobar que el resultado produzca este valor (al no ser un error de manera subjetiva), se empleó el método: .isNaN()

*Para saber más de este método, haga click [aquí.](https://www.geeksforgeeks.org/float-isnan-method-in-java-with-examples/)*

---

### Parámetros:

Los parámetros son una forma de intercambiar información con el método, por lo que pueden servir para introducir datos para ejecturar el método (entrada) o para obtener o modificar datos tras su ejecución (salida).

De aquí viene el nombre de la clase/librería que importamos en el siguiente proyecto.

---

***IMPORTANTE DESTACAR***

> Tantos los valores a operar como el resultado fueron declarados como la clase que pertenecen, de manera tal de poder contar con los métodos que estas clases poseen. Ej: el método para comprobar si el resultado es NaN

---

# CAMBIOS PARA EL EXAMEN

En esta oportunidad, hablamos de la versión 2.0 del programa, en la cual se empleó el repositorio Calculadora y se siguió el siguiente procedimiento.

Inicialmente se realizaron las modificaciones en una rama nueva llamada "raices"

>>git branch raices -> git checkout raices

En esta, una vez realizado los cambios se procede a subir la rama en el repositorio junto a sus commits.

>>git push origin raices

Aquí, para traer todas las modificaciones a la rama Main, realizamos los siguientes pasos:

>>Botón "Git" en la Barra de Navegación -> Merge... -> Etiqueta -squash (usando la rama raices a la main)

**De esta manera traemos los cambios a la main y hacemos nuestro commit**

## A DESTACAR ##

Se emplearon los mismos parámetros del método calcular, condicionando la opción que el usuario ordene, teniendo esta en cuenta en una literal con el valor "5" (el que corresponde con la operación de raíz).

Finalmente, se procede a crear una nueva etiqueta

>> 1. git tag -a v2.0 -m "my version 2.0"
>> 2. git push origin v2.0

Así, realizamos la release en GitHub con el Jar correspondiente a la nueva Calculadora


¡Este proyecto sólo acepta notas mínimas de 10! :smile:


