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
    final private Random randomGenerator = new Random();

    public String generateKey(int keySize, boolean useLowerCaseChars, boolean useUpperCaseChars, boolean useNumbers) {
        char[] key = new char[keySize];

        for (int k = 0; k < keySize; k++) {
            CharacterType charType = generateCharacterType(useLowerCaseChars, useUpperCaseChars, useNumbers);
            
            int random = randomGenerator.nextInt(Integer.SIZE - 1);
            
            switch (charType.value) {
                case CharacterType.lowerCaseChars:
                    {
                        random = random % 26 ;
                        key[k] = lowerCaseCharacters.charAt(random);
                        break;
                    }
                case CharacterType.upperCaseChars:
                    {
                        random = random % 26 ;
                        key[k] = upperCaseCharacters.charAt(random);
                        break;
                    }
                case CharacterType.numbers:
                    {
                        random = random % 10 ;
                        key[k] = numbers.charAt(random);
                        break;
                    }
                default:
                    break;
            }
            
        }
        
        return String.valueOf(key);
    }
    
    private CharacterType generateCharacterType(boolean useLowerCaseChars, boolean useUpperCaseChars, boolean useNumbers){
    
           CharacterType returningType = new CharacterType();
            
           boolean isValidType = false;
            do {
                int randomType = randomGenerator.nextInt() % 3;

                if (randomType == CharacterType.lowerCaseChars && useLowerCaseChars) {
                    returningType = new CharacterType(CharacterType.lowerCaseChars);
                    isValidType = true;
                }
                
                if (randomType == CharacterType.upperCaseChars && useUpperCaseChars) {
                    returningType = new CharacterType(CharacterType.upperCaseChars);
                    isValidType = true;
                }
                
                if (randomType == CharacterType.numbers && useNumbers) {
                    returningType = new CharacterType(CharacterType.numbers);
                    isValidType = true;
                }

            } while (isValidType == false);
    
        return returningType;
    }

}
