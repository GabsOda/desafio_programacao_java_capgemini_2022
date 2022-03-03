package com.gIssamu.question3;

public class Encryptor {

    public static String ecrypStrings(String entry) {
        String stripedString = entry.replaceAll("\\s+", "");

        int numCharacters = stripedString.length();

        int num = (int) Math.round(Math.sqrt(numCharacters));

        char[][] encryptedString = new char[num][num];

        char[] charArray = stripedString.toCharArray();

        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (count == numCharacters) {
                    break;
                }

                encryptedString[i][j] = charArray[count];

                count++;
            }
        }

        String constructedString = new String();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                constructedString += encryptedString[j][i];
            }
            constructedString += " ";
        }

        return constructedString;
    }

}
