import math 

def isPrime(number):
    if number == 2:
        return True 
    if number<=1 or (number%2)==0: 
        return False 
    for check in range(3,int(math.sqrt(number))):    #error, debe ser 1 en lugar de 3 para corroborar correctamente
        if (number%check) == 0:   
            return False 
    return True 

def isPrime2(number):   
    ###Your isPrime2 code here. 
    pass 
def test(): 
    assert isPrime(1) == False 
    assert isPrime(2) == True 
    assert isPrime(3) == True 
    assert isPrime(4) == False
    assert isPrime(5) == True 
    assert isPrime(20) == False 
    assert isPrime(21) == False 
    assert isPrime(22) == False 
    assert isPrime(23) == True 
    assert isPrime(24) == False 
###Your test code here. 
pass 