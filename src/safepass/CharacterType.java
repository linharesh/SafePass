/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safepass;

/**
 *
 * @author HenriqueLinhares
 */
public class CharacterType {
    
    public static final short lowerCaseChars = 0;
    public static final short upperCaseChars = 1;
    public static final short numbers = 2;
    
    public short value;

    public CharacterType(short value) {
        this.value = value;
    }
    
    public CharacterType() {
        
    }
    
    
}
