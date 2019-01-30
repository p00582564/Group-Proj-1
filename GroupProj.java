// Collaborators: Cody, Tony, Themba, Carmen
// Assignment 1 (Group 1): an example on the concept of encapsulation

// Cody's Edition
// Last Edit: 1/27/19


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.Serializable;

public class GroupProj {
   private JFrame m = new JFrame();

   /* This is the Option panel that will ask the user to input a dimension of
    *   A single number to make a perfect square and find its Area. */
   public void OptionPaneUI() {


      final JOptionPane optionPane = new JOptionPane("Welcome to Our Encapsulation Demonstration",
              JOptionPane.INFORMATION_MESSAGE,
              JOptionPane.DEFAULT_OPTION,
              null, new Object[]{}, null);

      final JDialog dialog = new JDialog();
      dialog.setTitle("Hello");
      dialog.setModal(true);

      dialog.setContentPane(optionPane);

      dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
      dialog.pack();

      Timer timer = new Timer(10000, new AbstractAction() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            dialog.dispose();
         }
      });
      timer.setRepeats(false);//the timer should only go off once

      timer.start();

      dialog.setVisible(true);

      String dimensions = JOptionPane.showInputDialog(m, "Enter Box Dimensions ");


   }

   static class Box {

      private double length, width;

      Box() {
         length = 1;
         width = 1;
      }

      Box(double inpLength, double inpWidth) {
         length = inpLength;
         width = inpWidth;
      }

      double getLength() {
         return length;
      }

      void setLength(double newLength) {
         length = newLength;
      }

      double getWidth() {
         return width;
      }

      void setWidth(double newWidth) {
         width = newWidth;
      }

      double getArea() {
         return length * width;
      }

      double getPerimeter() {
         return 2 * length + 2 * width;
      }

   }// end of Box

   public final class SystemColor extends Color implements Serializable {
      public SystemColor(int rgb) {
         super(rgb);
      }


   }
}