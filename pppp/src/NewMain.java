import javax.swing.JOptionPane;

public class newMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Realiza un programa capaz de elevar cualquier numero a la potencia
         * 100
         *
         *
         */
        JOptionPane V = new JOptionPane();

        int numIni, pot;
        String num;

        numIni = Integer.parseInt(V.showInputDialog("Ingrese el valor"));
        num = String.valueOf(numIni);
        pot = Integer.parseInt(V.showInputDialog("ingrese la potencia"));

        V.showMessageDialog(null, math(num, numIni, pot));

    }

    public static String math(String n, int ini, int pot) {
        String number = "", aux;
        int tamanio = n.length();
        int multis[] = new int[tamanio];
        int multiplo[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        if (pot != 1) {

            for (int i = (tamanio - 1); i >= 0; i--) {
                aux = "" + n.charAt(i);
                multis[i] = Integer.parseInt(aux) * ini;
            }

            for (int i = (tamanio - 1); i >= 0; i--) {

                concatValues(multiplo, multis[i], (tamanio - 1) - i);

            }
            int flag = 1;
            for (int i = 50; i >= 0; i--) {
                if (multiplo[i] != 0 || flag == 0) {
                    number = number.concat(String.valueOf(multiplo[i]));
                    flag = 0;
                }
            }

            return math(number, ini, (pot - 1));

        } else {
            return n;
        }
    }

    public static int[] concatValues(int[] vals, int num, int pos) {

        if (num >= 10000) {
            if (num % 10000 == 0) {
                vals[4] += num / 10000;
                num -= vals[4 + pos] * 10000;
                return concatValues(vals, num, pos);
            } else {
                vals[4] += 1;
                num -= 10000;
                return concatValues(vals, num, pos);
            }
        } else if (num >= 1000) {
            if (num % 1000 == 0) {
                vals[3 + pos] += num / 1000;
                num -= vals[3 + pos] * 1000;
                return concatValues(vals, num, pos);
            } else {
                vals[3 + pos] += 1;
                num -= 1000;
                return concatValues(vals, num, pos);
            }
        } else if (num >= 100) {
            if (num % 100 == 0) {
                vals[2 + pos] += num / 100;
                num -= vals[2 + pos] * 100;
                return concatValues(vals, num, pos);
            } else {
                vals[2 + pos] += 1;
                num -= 100;
                return concatValues(vals, num, pos);
            }
        } else if (num >= 10) {
            if (num % 10 == 0) {
                vals[1 + pos] += num / 10;
                num -= vals[1 + pos] * 10;
                return concatValues(vals, num, pos);
            } else {
                vals[1 + pos] += 1;
                num -= 10;
                return concatValues(vals, num, pos);
            }
        } else {
            vals[0 + pos] += num;
            return vals;
        }
    }

}