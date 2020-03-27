import Calculadora    
import math
import pytest

testdata =[(n,math.sqrt(n)) for n in range(1,101)]

@pytest.mark.parametrize("a,expected",testdata)
def test_raiz(a,expected):
    assert Calculadora.raiz (a) == pytest.approx(expected,abs=0.000001)

def test_cuadrado():
    assert Calculadora.cuadrado(4) == 16