from Prime import isPrime
from Add import add8
from Stats import stats
import builtins

def test_is_prime():
    assert isPrime(1) == False
    assert isPrime(2) == True
    assert isPrime(3) == True
    assert isPrime(4) == False
    assert isPrime(5) == True
    assert isPrime(20) == False
    assert isPrime(23) == True
    assert isPrime(29) == True
    assert isPrime(29) == True #no debe ser primo



#def test_add8():
   # result = add8(1,0,0,0,0,0,0,0, 1,0,0,0,0,0,0,0, 0)
  #  # Debería devolver una suma de 2 (0b10)
 #   assert result[:2] == (False, True)

#def test_stats(monkeypatch):
   # # Redefinir print para capturar salida
  #  output = []
 #   monkeypatch.setattr(builtins, "print", lambda x: output.append(x))
#
   # stats([1, 2, 2, 3, 4])
  #  assert any("min = 1" in str(line) for line in output)
 #   assert any("max = 4" in str(line) for line in output)
#    assert any("mode(s) = [2]" in str(line) for line in output)
