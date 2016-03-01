/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safepass;

import java.util.Random;

/**
 *
 * @author HenriqueLinhares
 */
public class KeyGenerator {

    final private String lowerCaseCharacters = "abcdefghijklmnopqrstuvwxyz";

    final private String upperCaseCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    final private String numbers = "0123456789";
    
    private final Random randomGenerator = new Random();

    public String generateKey(int keySize, boolean useLowerCaseChars, boolean useUpperCaseChars, boolean useNumbers) {
        String key = "";

        for (int k = 1; k <= keySize; k++) {
            
            int characterType = randomGenerator.nextInt() % 3;
            
            
            
            
        }

        return key;
    }

}
