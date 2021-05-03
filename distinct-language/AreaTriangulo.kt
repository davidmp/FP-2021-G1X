fun main() {
//Definir Variables y otros
println("Ajercicio 01: Area de un Triangulo\n")
var h: Int?
var area: Int?
//Datos de Entrada
print("Ingrese Base:")
var b=readLine()?.toIntOrNull()!!
print("Ingrese Altura:")
h=readLine()?.toIntOrNull()!!
//Proceso
area=(b*h)/2
//Datos de salida
println("El Area del Triangulo es: $area")
}