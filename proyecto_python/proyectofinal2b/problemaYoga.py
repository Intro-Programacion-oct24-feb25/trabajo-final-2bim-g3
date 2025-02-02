def obtenerDatosYoga():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su nivel:"
                + "(principiante, intermedio, avanzado)")
    nivel = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su estilo de yoga favorito")
    estilo = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}"
              f"\nCiudad de residencia: {ciudad}\nEstilo favorito: {estilo}\n")

    return cadena