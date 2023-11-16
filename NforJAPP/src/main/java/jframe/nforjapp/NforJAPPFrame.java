/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe.nforjapp;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author homec
 */

public class NforJAPPFrame extends JFrame {

    public NforJAPPFrame() {
        setTitle("TradingPlatform");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add your components or customization for the JFrame
        JLabel welcomeLabel = new JLabel("Welcome to Metatrader4!");
        add(welcomeLabel);
    }
}