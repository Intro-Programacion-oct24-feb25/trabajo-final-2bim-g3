def obtenerDatosCiclismo():
    print("Ingrese el nombre del participante:")
    nombre = input()

    print("Ingrese la edad del participante:")
    edad = input()
    edad = float(edad)

    print("Ingrese el tipo de ciclismo que practica (montaña, ruta, urbano):")
    tipo = input()

    print("Ingrese su ciudad de residencia")
    ciudad = input()

    print("Ingrese su marca de ciclismo favorita")
    marca = input()

    cadena = (f"\nLos datos ingresados son: "
              f"\nNombre: {nombre}\nEdad: {edad}\nTipo de disciplina: {tipo}"
              f"\nCiudad de residencia: {ciudad}\nMarca favorita: {marca}\n")

    return cadena