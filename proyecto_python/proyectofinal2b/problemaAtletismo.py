def obtenerDatosAtletismo():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese su especialidad (carreras, salto, lanzamiento):")
    especialidad = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su record personal en" + especialidad)
    estilo = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nCiudad: {ciudad}"
              f"\nnivel: {especialidad}\nEspecialiad: {estilo}\n")

    return cadena