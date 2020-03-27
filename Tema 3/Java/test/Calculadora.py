# Este es el ejercicio de calculadora de Java en Python
# Tiene similitudes con java 
# En python tendremos que crear funfiones para hacer la calculadora.
# Hemos adaptado el código en python, logicamente.


def raiz(x):
    r = x
    t = 0
    while(t != r):
        t = r
        r = 0.5 * ((x/r) + r)
    return r

def cuadrado (y):
    return y*y

print (cuadrado(4), raiz(2))

    