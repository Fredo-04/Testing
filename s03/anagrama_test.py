import unittest
from anagrama import son_anagramas

class TestAnagrama(unittest.TestCase):
    def test_anagramas_iguales(self):
        self.assertTrue(son_anagramas("amor", "roma"))

    def test_anagramas_con_espacios(self):
        self.assertTrue(son_anagramas("anita lava la tina", "lavalatina anita"))

    def test_no_anagramas(self):
        self.assertFalse(son_anagramas("hola", "mundo"))

if __name__ == '__main__':
    unittest.main()
