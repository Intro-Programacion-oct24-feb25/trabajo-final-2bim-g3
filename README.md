## Paulo Bustamante y Diego Espinosa
# Trabajo Final
## Segundo Bimestre

***

### Problemática a resolver

Generar una solución en Java y Python:

El objetivo es diseñar un sistema para registrar a nuevos participantes en las actividades de un club deportivo llamado "El deporte para la vida"

Las actividades que se brindan en la club son: Fútbol, Natación, Atletismo, Básquetbol, Ciclismo, Tenis, Yoga.

Los datos requeridos para cada actividad son:
* Fútbol:
    * Datos: Nombre del participante, edad, posición preferida, ciudad, equipo favorito.

* Natación:
    * Datos: Nombre del participante, edad, nivel (principiante, intermedio, avanzado), ciudad, estilo favorito.

* Atletismo:
    * Datos: Nombre del participante, edad, especialidad (carreras, salto, lanzamiento), ciudad, récord personal.

* Básquetbol:
    * Datos: Nombre del participante, edad, posición preferida, estatura, ciudad.

* Ciclismo:
    * Datos: Nombre del participante, edad, tipo de ciclismo (montaña, ruta, urbano), ciudad, marca de bicicleta preferida.

* Tenis:
    * Datos: Nombre del participante, edad, nivel (principiante, intermedio, avanzado), ciudad, mano hábil (derecha/izquierda).

* Yoga:
    * Datos: Nombre del participante, edad, nivel (principiante, intermedio, avanzado), ciudad, estilo de yoga preferido.



La aplicación debe tener los siguientes procedimientos, indicar que los procedimientos no tienen parámetros y cada uno de ellos en su cuerpo pedirá la información necesaria:

- función principal
- función registrarParticipanteFutbol
- función registrarParticipanteNatacion
- función registrarParticipanteAtletismo
- función registrarParticipanteBasquetbol
- función registrarParticipanteCiclismo
- función registrarParticipanteTenis
- función registrarParticipanteYoga

En la **función principal** se presenta un ciclo repetitivo que indica un menú de opciones:

- Si se ingresa 1 se llamará a registrarParticipanteFutbol
- Si se ingresa 2 se llamará a registrarParticipanteNatacion
- Si se ingresa 3 se llamará a registrarParticipanteAtletismo
- Si se ingresa 4 se llamará a registrarParticipanteBasquetbol
- Si se ingresa 5 se llamará a registrarParticipanteCiclismo
- Si se ingresa 6 se llamará a registrarParticipanteTenis
- Si se ingresa 7 se llamará a registrarParticipanteYoga
- Si se ingresa algo diferente de 1,2,3,4,5,6,7; se debe presentar un mensaje en pantalla: "lo sentimos, el club no tiene esa opción."

  >En cada iteración del ciclo; se pregunta al usuario si se desea salir del ciclo.

Cada procedimiento debe imprimir un resumen de las actividad creada con todos los valores ingresados.

**Considerandos importantes:**

  * **Cuando el usuario termina el ciclo repetitivo** se debe presentar un mensaje con base al número total de actividades creadas. Se debe usar el número total de actividades como argumento (entero) de una función llamada obtenerInformacion. En la función obtenerInformacion existe un parámetro. El mensaje se forma de la siguiente manera:  

  a. Si el número de cuentas creadas está en el rango de 1 a 5 el mensaje será: **Poca participación en el club, hay que mejorar**

  b. Si el número de cuentas creadas está en el rango de 6 a 15 el mensaje será: **Buena participación, sigan así.**

  c. Si el número de cuentas creadas está en el rango de 16 en adelante, el mensaje será: **Excelente campaña del club.**

  d. Si el número de cuentas creadas es igual a 0, el mensaje será: **Mala campaña, debemos mejorar**

  * **Cuando el usuario terminan el ciclo repetitivo** de debe llamar a una función que se llame obtenerReporte, mismo que debe tener dos parámetros (un arreglo de cadenas y un arreglo de enteros); con base a ello, se debe generar una cadena que tenga la siguiente estructura, como ejemplo:

  ```

  Las actividades ingresadas son:
  1. Número de Participantes de Fútbol: 3
  2. Número de Participantes de Natación: 2
  3. Número de Participantes de Atletismo: 1
  4. Número de Participantes de Basquetbol: 3
  5. Número de Participantes de Ciclismo: 5
  6. Número de Participantes de Tenis: 2
  7. Número de Participantes de Yoga: 4

  ```

***
### Importante

Se debe usar una variable acumuladora global, que permita presentar en pantalla todos los datos ingresados de los participantes, cuando se termine el ciclo repetitivo.
***

### Importante para Java

- Debe usar al menos 6 paquetes en total.

***
### Presentación del trabajo final
- En la carpeta proyecto_java, debe crear un proyecto de Netbeans. En dicho proyecto se debe generar la solución.
- En la carpeta proyecto_python, debe crear un proyecto solución para Python.

***
