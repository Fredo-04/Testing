package s06.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;

        // Compara los caracteres desde ambos extremos
        while (begin <= end && string.charAt(begin) == string.charAt(end)) {
            mirror += string.charAt(begin); // Agrega el carácter reflejado
            begin++;
            end--;
        }

        return mirror;
    }
}

