def obtenerDatosNatacion():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su nivel (principiante, intermedio o avanzado):")
    nivel = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su estilo de nado favorito")
    estilo = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nCiudad: {ciudad}"
              f"\nnivel: {nivel}\nEstilo: {estilo}\n")

    return cadena