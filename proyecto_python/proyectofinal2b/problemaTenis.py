def obtenerDatosTenis():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su nivel de juego:"
                + "(principiante, intermedio, avanzado)")
    nivel = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su mano habil de juego")
    mano = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}"
              f"\nCiudad de residencia: {ciudad}\nMano habil: {mano}\n")

    return cadena