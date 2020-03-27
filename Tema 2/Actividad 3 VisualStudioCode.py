
# En este ejercicio pide al usuario dos numeros por teclado y una operación, suma, resta, multiplicación o división.
# Se evaluará los errores que se puedan introducir.
# Posteriormente mostrará el resultado de la operación.



try:
    numero1 = float(input("Introduce primer numero: "))
    numero2 = float(input("Introduce segundo numero: "))
    operacion= input("Introducir operación: ")
except  ValueError: 
    print ("Se ha introducido una letra")
else:
    if operacion == '+': 
        print (numero1+numero2)
    elif operacion == '-':
        print (numero1-numero2)
    elif operacion == '*':
        print (numero1*numero2)
    elif operacion == '/':
        print (numero1/numero2)
    else:
        print ("Error al introducir en la operación")
    