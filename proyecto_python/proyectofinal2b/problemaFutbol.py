def obtenerDatosFutbol():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su posicion preferida en el campo:")
    posicion = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su equipo favorito")
    equipo = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nCiudad: {ciudad}"
              f"\nPosicion preferida: {posicion}\nEquipo favorito: {equipo}\n")

    return cadena