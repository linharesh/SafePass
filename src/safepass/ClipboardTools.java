/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safepass;

import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 *
 * @author HenriqueLinhares
 */
public class ClipboardTools {

    public static void copyStringToClipboard(String myString) {
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }

}
