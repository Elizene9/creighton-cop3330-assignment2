package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.lang.String;

// Creates password with user input data
public class generateList {

    Random rand = new Random();

    char[] list(int length, int character, int number) {

        int j, k, q;
        int passwordLength = length + rand.nextInt(15);
        List<String> password = new ArrayList<>();
        String[] special = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "/", ";", ":"};
        int[] original_Char = new int[special.length];
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] randNum = new int[num.length];
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[]randAlpha = new int[passwordLength - (number + character)];
        String passwordDone;
        char[] arrayPassword;

        for (j = 0; j < character; j++) {
            original_Char[j] = rand.nextInt(special.length);
            password.add(special[original_Char[j]]);
        }
        for (k = 0; k < number; k++) {

            randNum[k] = rand.nextInt(num.length);
            password.add(num[randNum[k]]);

        }
        for (q = 0; q < randAlpha.length; q++) {
            randAlpha[q] = rand.nextInt(alpha.length);
            password.add(alpha[randAlpha[q]]);
        }

        Collections.shuffle(password);
        passwordDone = password.toString().replaceAll(",", "");
        arrayPassword = passwordDone.substring(1, passwordDone.length()-1).replaceAll(" ", "").toCharArray();
        return arrayPassword;
    }
}
