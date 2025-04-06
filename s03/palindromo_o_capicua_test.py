import unittest
from palindromo_o_capicua import es_palindromo_o_capicua

class TestPalindromoCapicua(unittest.TestCase):
    def test_palindromo_texto(self):
        self.assertTrue(es_palindromo_o_capicua("Anita lava la tina"))

    def test_palindromo_numero(self):
        self.assertTrue(es_palindromo_o_capicua(12321))

    def test_no_palindromo_texto(self):
        self.assertFalse(es_palindromo_o_capicua("Hola Mundo"))

    def test_no_palindromo_numero(self):
        self.assertFalse(es_palindromo_o_capicua(12345))

if __name__ == '__main__':
    unittest.main()
