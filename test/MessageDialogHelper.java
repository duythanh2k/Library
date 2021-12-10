/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author anhph
 */
public class MessageDialogHelper {

    public static void showMessageDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);

    }

    public static void showErrorDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);

    }

    public static int showConfirmDialog(Component parent, String content, String title) {
        int choose = JOptionPane.showConfirmDialog(parent, title, content,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
}
