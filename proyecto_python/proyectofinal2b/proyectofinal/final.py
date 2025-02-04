contador = 0
contadorFutbol = 0
contadorNatacion = 0
contadorAtletismo = 0
contadorBasquetbol = 0
contadorCiclismo = 0
contadorTenis = 0
contadorYoga = 0
bandera = True

listaFutbol = []
listaNatacion = []
listaAtletismo = []
listaBasquetbol = []
listaCiclismo = []
listaTenis = []
listaYoga = []

global cadena

from problemaBasquetball import obtenerDatosBasquetball
from problemaFutbol import obtenerDatosFutbol
from problemaTenis import obtenerDatosTenis
from problemaCiclismo import obtenerDatosCiclismo
from problemaNatacion import obtenerDatosNatacion
from problemaAtletismo import obtenerDatosAtletismo
from problemaYoga import obtenerDatosYoga

while bandera:
    print("Ingrese la disciplina a la que desea registrarse\n: "
          + "futbol(1), natacion(2), atletismo(3),"
            " basquetball(4), ciclismo(5), tenis(6), yoga(7), en caso de no querer seguir con el proceso digite (8)")
    opcion = input()
    opcion = float(opcion)

    if opcion == 1:
        cadena = obtenerDatosFutbol()
        listaFutbol.append(cadena)
        contadorFutbol += 1
        contador += 1
        print(cadena)
    elif opcion == 2:
        cadena = obtenerDatosNatacion()
        listaNatacion.append(cadena)
        contadorNatacion += 1
        contador += 1
        print(cadena)
    elif opcion == 3:
        cadena = obtenerDatosAtletismo()
        listaAtletismo.append(cadena)
        contadorAtletismo += 1
        contador += 1
        print(cadena)
    elif opcion == 4:
        cadena = obtenerDatosBasquetball()
        listaBasquetbol.append(cadena)
        contadorBasquetbol += 1
        contador += 1
        print(cadena)
    elif opcion == 5:
        cadena = obtenerDatosCiclismo()
        listaCiclismo.append(cadena)
        contadorCiclismo += 1
        contador += 1
        print(cadena)
    elif opcion == 6:
        cadena = obtenerDatosTenis()
        listaTenis.append(cadena)
        contadorTenis += 1
        contador += 1
        print(cadena)
    elif opcion == 7:
        cadena = obtenerDatosYoga()
        listaYoga.append(cadena)
        contadorYoga += 1
        contador += 1
        print(cadena)
    elif opcion == 8:
        bandera = False
    else:
        print("Opción inválida, por favor intente nuevamente.")

print("\nLas actividades ingresadas son:")
print(f"1. Numero de participantes de Futbol: {contadorFutbol}")
print(f"2. Numero de participantes de Natación: {contadorNatacion}")
print(f"3. Numero de participantes de Atletismo: {contadorAtletismo}")
print(f"4. Numero de participantes de Basquetbol: {contadorBasquetbol}")
print(f"5. Numero de participantes de Ciclismo: {contadorCiclismo}")
print(f"6. Numero de participantes de Tenis: {contadorTenis}")
print(f"7. Numero de participantes de Yoga: {contadorYoga}")

if contador == 0:
    print("Mala campaña, debemos mejorar.")
elif contador >= 1 and contador <= 5:
    print("Poca participación en el club, hay que mejorar.")
elif contador >= 6 and contador <= 15:
    print("Buena participación, sigan así.")
elif contador >= 16:
    print("Excelente campaña del club.")

print("\nDatos ingresados por disciplina:")
print("Futbol:", listaFutbol)
print("Natación:", listaNatacion)
print("Atletismo:", listaAtletismo)
print("Basquetbol:", listaBasquetbol)
print("Ciclismo:", listaCiclismo)
print("Tenis:", listaTenis)
print("Yoga:", listaYoga)
