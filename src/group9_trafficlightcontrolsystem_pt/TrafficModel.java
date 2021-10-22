/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem_pt;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
/**
 *
 * @author user
 */
public class TrafficModel extends javax.swing.JFrame {

    public TrafficModel() {
        initComponents();
        this.setLocationRelativeTo(null);//center form in the screen
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trafficLightBackground_North = new javax.swing.JPanel();
        redlight_goSouth = new javax.swing.JLabel();
        yellowlight_goSouth = new javax.swing.JLabel();
        greenlight_goSouth = new javax.swing.JLabel();
        trafficLightBackground1 = new javax.swing.JPanel();
        redlight_goNorth = new javax.swing.JLabel();
        yellowlight_goNorth = new javax.swing.JLabel();
        greenlight_goNorth = new javax.swing.JLabel();
        trafficLightBackground_North1 = new javax.swing.JPanel();
        redlight_goWest = new javax.swing.JLabel();
        yellowlight_goWest = new javax.swing.JLabel();
        greenlight_goWest = new javax.swing.JLabel();
        jPanel_roadWest = new javax.swing.JPanel();
        jPanel_roadNorth = new javax.swing.JPanel();
        jPanel_roadEast = new javax.swing.JPanel();
        jPanel_roadSouth = new javax.swing.JPanel();
        trafficLightBackground = new javax.swing.JPanel();
        redlight_goEast = new javax.swing.JLabel();
        yellowlight_goEast = new javax.swing.JLabel();
        greenlight_goEast = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jFrame_main");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        trafficLightBackground_North.setBackground(new java.awt.Color(0, 0, 0));

        redlight_goSouth.setBackground(new java.awt.Color(255, 255, 255));
        redlight_goSouth.setOpaque(true);
        redlight_goSouth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redlight_goSouthMouseClicked(evt);
            }
        });

        yellowlight_goSouth.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_goSouth.setOpaque(true);

        greenlight_goSouth.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_goSouth.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackground_NorthLayout = new javax.swing.GroupLayout(trafficLightBackground_North);
        trafficLightBackground_North.setLayout(trafficLightBackground_NorthLayout);
        trafficLightBackground_NorthLayout.setHorizontalGroup(
            trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_NorthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yellowlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(greenlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackground_NorthLayout.setVerticalGroup(
            trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_NorthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_goSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trafficLightBackground1.setBackground(new java.awt.Color(0, 0, 0));

        redlight_goNorth.setBackground(new java.awt.Color(255, 255, 255));
        redlight_goNorth.setOpaque(true);

        yellowlight_goNorth.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_goNorth.setOpaque(true);

        greenlight_goNorth.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_goNorth.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackground1Layout = new javax.swing.GroupLayout(trafficLightBackground1);
        trafficLightBackground1.setLayout(trafficLightBackground1Layout);
        trafficLightBackground1Layout.setHorizontalGroup(
            trafficLightBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yellowlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(greenlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        trafficLightBackground1Layout.setVerticalGroup(
            trafficLightBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trafficLightBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greenlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_goNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trafficLightBackground_North1.setBackground(new java.awt.Color(0, 0, 0));

        redlight_goWest.setBackground(new java.awt.Color(255, 255, 255));
        redlight_goWest.setOpaque(true);

        yellowlight_goWest.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_goWest.setOpaque(true);

        greenlight_goWest.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_goWest.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackground_North1Layout = new javax.swing.GroupLayout(trafficLightBackground_North1);
        trafficLightBackground_North1.setLayout(trafficLightBackground_North1Layout);
        trafficLightBackground_North1Layout.setHorizontalGroup(
            trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_North1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackground_North1Layout.setVerticalGroup(
            trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_North1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yellowlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greenlight_goWest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_roadWest.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_roadWestLayout = new javax.swing.GroupLayout(jPanel_roadWest);
        jPanel_roadWest.setLayout(jPanel_roadWestLayout);
        jPanel_roadWestLayout.setHorizontalGroup(
            jPanel_roadWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
        jPanel_roadWestLayout.setVerticalGroup(
            jPanel_roadWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jPanel_roadNorth.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_roadNorthLayout = new javax.swing.GroupLayout(jPanel_roadNorth);
        jPanel_roadNorth.setLayout(jPanel_roadNorthLayout);
        jPanel_roadNorthLayout.setHorizontalGroup(
            jPanel_roadNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_roadNorthLayout.setVerticalGroup(
            jPanel_roadNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        jPanel_roadEast.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_roadEastLayout = new javax.swing.GroupLayout(jPanel_roadEast);
        jPanel_roadEast.setLayout(jPanel_roadEastLayout);
        jPanel_roadEastLayout.setHorizontalGroup(
            jPanel_roadEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanel_roadEastLayout.setVerticalGroup(
            jPanel_roadEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jPanel_roadSouth.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_roadSouthLayout = new javax.swing.GroupLayout(jPanel_roadSouth);
        jPanel_roadSouth.setLayout(jPanel_roadSouthLayout);
        jPanel_roadSouthLayout.setHorizontalGroup(
            jPanel_roadSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel_roadSouthLayout.setVerticalGroup(
            jPanel_roadSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        trafficLightBackground.setBackground(new java.awt.Color(0, 0, 0));

        redlight_goEast.setBackground(new java.awt.Color(255, 255, 255));
        redlight_goEast.setOpaque(true);

        yellowlight_goEast.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_goEast.setOpaque(true);

        greenlight_goEast.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_goEast.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackgroundLayout = new javax.swing.GroupLayout(trafficLightBackground);
        trafficLightBackground.setLayout(trafficLightBackgroundLayout);
        trafficLightBackgroundLayout.setHorizontalGroup(
            trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackgroundLayout.setVerticalGroup(
            trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yellowlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greenlight_goEast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel_roadEast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trafficLightBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trafficLightBackground_North, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel_roadSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_roadNorth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(trafficLightBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(trafficLightBackground_North1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_roadWest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel_roadSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel_roadEast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel_roadWest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trafficLightBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(trafficLightBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel_roadNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trafficLightBackground_North, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(trafficLightBackground_North1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel_roadWest.getAccessibleContext().setAccessibleName("panel_roadSouth");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//int a=0;
//int b =0;
//Timer carTimer = new Timer(10,new ActionListener(){
//   public void actionPerformed(ActionEvent e)
//   {
//       b++;
//       car.setLocation(b,250);
//       if(b==300){
//           b=0;
//       }
//   }
//});
//
//Timer timer2 = new Timer(1000,new ActionListener(){
//   public void actionPerformed(ActionEvent e)
//   {
//       a++;
//       switch(a){
//           case 2:
//           {
//               greenlight_goEast.setBackground(Color.white);
//               redlight_goEast.setBackground(Color.red);
//               carTimer.stop();
//               break;
//           }
//           case 4:
//           {
//               redlight_goEast.setBackground(Color.white);
//               yellowlight_goEast.setBackground(Color.yellow);
//               break;
//           }
//           case 6:
//           {
//               yellowlight_goEast.setBackground(Color.white);
//               greenlight_goEast.setBackground(Color.green);
//               carTimer.start();
//               break;
//           }
//       }
//       if(a==6){
//           a=0;
//       }
//   }
//});

    /**
     *
     */
    public void setNorthToGreen(){
        redlight_goNorth.setBackground(Color.white);
        yellowlight_goNorth.setBackground(Color.white);
        greenlight_goNorth.setBackground(Color.green);
        //set other light to red
        redlight_goSouth.setBackground(Color.red);
        redlight_goEast.setBackground(Color.red);
        redlight_goWest.setBackground(Color.red);
        //set other GREEN to WHITE
        greenlight_goSouth.setBackground(Color.white);
        greenlight_goEast.setBackground(Color.white);
        greenlight_goWest.setBackground(Color.white);
        
    }
    
    public void setSouthToGreen(){
        redlight_goSouth.setBackground(Color.white);
        yellowlight_goSouth.setBackground(Color.white);
        greenlight_goSouth.setBackground(Color.green);
        //set other light to red
        redlight_goNorth.setBackground(Color.red);
        redlight_goEast.setBackground(Color.red);
        redlight_goWest.setBackground(Color.red);
        //set other GREEN to WHITE
        greenlight_goNorth.setBackground(Color.white);
        greenlight_goEast.setBackground(Color.white);
        greenlight_goWest.setBackground(Color.white);
    }
    
    public void setEastToGreen(){
        redlight_goEast.setBackground(Color.white);
        yellowlight_goEast.setBackground(Color.white);
        greenlight_goEast.setBackground(Color.green);
        //set other light to red
        redlight_goNorth.setBackground(Color.red);
        redlight_goSouth.setBackground(Color.red);
        redlight_goWest.setBackground(Color.red);
        //set other GREEN to WHITE
        greenlight_goSouth.setBackground(Color.white);
        greenlight_goNorth.setBackground(Color.white);
        greenlight_goWest.setBackground(Color.white);
    }
    
    public void setWestToGreen(){
        redlight_goWest.setBackground(Color.white);
        yellowlight_goWest.setBackground(Color.white);
        greenlight_goWest.setBackground(Color.green);
        //set other light to red
        redlight_goNorth.setBackground(Color.red);
        redlight_goEast.setBackground(Color.red);
        redlight_goSouth.setBackground(Color.red);
        //set other GREEN to WHITE
        greenlight_goSouth.setBackground(Color.white);
        greenlight_goNorth.setBackground(Color.white);
        greenlight_goEast.setBackground(Color.white);
    }

    public void addCarToNorth(String carID){
         System.out.println("Reach here");
         
        JLabel car = new JLabel();
        car.setLocation(177,92);
        car.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        car.setForeground(Color.white);
        car.setText(carID);
        jPanel_roadNorth.add(car);
       
        
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //timer2.start();
    }//GEN-LAST:event_formWindowOpened

    private void redlight_goSouthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redlight_goSouthMouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_redlight_goSouthMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrafficModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greenlight_goEast;
    private javax.swing.JLabel greenlight_goNorth;
    private javax.swing.JLabel greenlight_goSouth;
    private javax.swing.JLabel greenlight_goWest;
    private javax.swing.JPanel jPanel_roadEast;
    private javax.swing.JPanel jPanel_roadNorth;
    private javax.swing.JPanel jPanel_roadSouth;
    private javax.swing.JPanel jPanel_roadWest;
    private javax.swing.JLabel redlight_goEast;
    private javax.swing.JLabel redlight_goNorth;
    private javax.swing.JLabel redlight_goSouth;
    private javax.swing.JLabel redlight_goWest;
    private javax.swing.JPanel trafficLightBackground;
    private javax.swing.JPanel trafficLightBackground1;
    private javax.swing.JPanel trafficLightBackground_North;
    private javax.swing.JPanel trafficLightBackground_North1;
    private javax.swing.JLabel yellowlight_goEast;
    private javax.swing.JLabel yellowlight_goNorth;
    private javax.swing.JLabel yellowlight_goSouth;
    private javax.swing.JLabel yellowlight_goWest;
    // End of variables declaration//GEN-END:variables
}
