public class CaesarShiftCipher {
    public String caesarCipher(String message, int shift) {
        if (message == null || message.isEmpty()) return message;

        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Asegurar que el desplazamiento esté dentro del rango de letras

        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(currentChar);
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                char shifted = (char) (currentChar + shift);
                if (shifted > 'z') {
                    shifted = (char) (shifted - 26);
                } else if (shifted < 'a') {
                    shifted = (char) (shifted + 26);
                }
                sb.append(shifted);
            } else {
                return "inválido"; // Si hay caracteres no permitidos
            }
        }

        return sb.toString();
    }
}
