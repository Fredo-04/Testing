package s06.sum;

import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbersSum {
    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Crear copias para no modificar las listas originales
        ArrayList<Integer> a = new ArrayList<>(first);
        ArrayList<Integer> b = new ArrayList<>(second);
        Collections.reverse(a);
        Collections.reverse(b);

        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
            int valA = i < a.size() ? a.get(i) : 0;
            int valB = i < b.size() ? b.get(i) : 0;
            int sum = valA + valB + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }
}
