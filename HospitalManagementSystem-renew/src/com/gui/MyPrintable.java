/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JPanel;

public class MyPrintable implements Printable {
    private JPanel panel;

    public MyPrintable(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // Get the bounds of the printable area
        Dimension panelSize = panel.getSize();
        double scaleX = pageFormat.getImageableWidth() / panelSize.width;
        double scaleY = pageFormat.getImageableHeight() / panelSize.height;
        double scale = Math.min(scaleX, scaleY);

        // Set the scale and translate to the printable area
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        g2d.scale(scale, scale);

        // Disable double buffering
        panel.setDoubleBuffered(false);

        // Paint the panel onto the graphics object
        panel.paint(g2d);

        // Enable double buffering
        panel.setDoubleBuffered(true);

        return Printable.PAGE_EXISTS;
    }
}
