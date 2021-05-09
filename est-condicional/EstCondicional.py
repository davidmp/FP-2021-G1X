def estCondicional01():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de lapices:"))
  #Proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90  
  #Datos de salida
  print("El monto a pagar es:", montoP)
def estCondicional02():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python 02")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de personas:"))
  #Proceso
  if cantidadX<=200:
    montoP=cantidadX*95
  elif cantidadX>200 and cantidadX<=300:
    montoP=cantidadX*85
  else:
    montoP=cantidadX*75
  #Datos de salida
  print("El monto a pagar es:", montoP)
def bonoDocente():
  #definir Variables
  bonoObtenido=0.0
  #Datos de Endrada
  salarioMinimo=float(input("Ingrese el salario minimo:"))
  puntuacionObtenida=float(input("Ingrese la puntuación que ha obtenido:"))
  #Proceso
  if puntuacionObtenida<=100 and puntuacionObtenida>=0:
    bonoObtenido=salarioMinimo
  elif puntuacionObtenida >=101 and puntuacionObtenida<=150:
    bonoObtenido=salarioMinimo*2
  elif puntuacionObtenida>150:
    bonoObtenido=salarioMinimo*3  
  #Datos de salida
  print("El docente obtendra un bono de:", bonoObtenido )


def paquetesJDQC():
  #Definir Variables
  resultPaqueteDmp=""
  #Datos de entrada
  montoRvDiDmpc=float(input("Ingrese el monto que recibe en diciembre:"))
  #Proceso
  if montoRvDiDmpc>=50000:
    resultPaqueteDmp="Paquete A"
  elif montoRvDiDmpc>=20000 and resultPaqueteDmp<50000:
    resultPaqueteDmp="Paquete B"
  elif montoRvDiDmpc>=10000 and montoRvDiDmpc<20000:
    resultPaqueteDmp="Paquete C"
  else:
    resultPaqueteDmp="Paquete D"
  #Datos de salida
  print("La persona comprara el: ", resultPaqueteDmp)

def paquetes():
  #Definir Variables
  resultPaquete=""
  #Datos de entrada
  montoRvDic=float(input("Ingrese el monto que recibe en diciembre:"))
  #Proceso
  if montoRvDic>=50000:
    resultPaquete="Paquete A"
  elif montoRvDic>=20000 and montoRvDic<50000:
    resultPaquete="Paquete B"
  elif montoRvDic>=10000 and montoRvDic<20000:
    resultPaquete="Paquete C"
  else:
    resultPaquete="Paquete D"
  #Datos de salida
  print("La persona comprara el: ", resultPaquete)


#estCondicional02()
#estCondicional01()
#bonoDocente()

paquetesJDQC()


#estCondicional01()
