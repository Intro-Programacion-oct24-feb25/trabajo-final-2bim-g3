def obtenerDatosBasquetball():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su posicion preferida de juego:")
    posicion = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su estatura")
    estatura = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nCiudad: {ciudad}"
              f"\nPosicion preferida: {posicion}\nEstatura: {estatura}\n")

    return cadena