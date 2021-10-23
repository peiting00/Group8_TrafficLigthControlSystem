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
/**
 *
 * @author user
 */
public class TrafficModel extends javax.swing.JFrame {
    String currentActiveDirection = "N";
    javax.swing.JLabel currentGreen;
    javax.swing.JLabel readyToYellow;
    javax.swing.JLabel readyToRed;
    
    public TrafficModel() {
        this.readyToYellow = yellowlight_North;
        this.readyToRed = redlight_North;
        this.currentGreen = greenlight_North; 
        
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

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        trafficLightBackground_North = new javax.swing.JPanel();
        redlight_North = new javax.swing.JLabel();
        yellowlight_North = new javax.swing.JLabel();
        greenlight_North = new javax.swing.JLabel();
        northCar1 = new javax.swing.JLabel();
        north = new javax.swing.JLabel();
        northCar2 = new javax.swing.JLabel();
        northCar3 = new javax.swing.JLabel();
        northCar4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        instruction = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        trafficLightBackground = new javax.swing.JPanel();
        redlight_West = new javax.swing.JLabel();
        yellowlight_West = new javax.swing.JLabel();
        greenlight_West = new javax.swing.JLabel();
        westCar1 = new javax.swing.JLabel();
        westCar2 = new javax.swing.JLabel();
        west = new javax.swing.JLabel();
        westCar3 = new javax.swing.JLabel();
        westCar4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        trafficLightBackground_North1 = new javax.swing.JPanel();
        redlight_East = new javax.swing.JLabel();
        yellowlight_East = new javax.swing.JLabel();
        greenlight_East = new javax.swing.JLabel();
        east = new javax.swing.JLabel();
        eastCar2 = new javax.swing.JLabel();
        eactCar1 = new javax.swing.JLabel();
        eastCar3 = new javax.swing.JLabel();
        eastCar4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tovertical = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        trafficLightBackground1 = new javax.swing.JPanel();
        redlight_South = new javax.swing.JLabel();
        yellowlight_South = new javax.swing.JLabel();
        greenlight_South = new javax.swing.JLabel();
        south = new javax.swing.JLabel();
        southCar1 = new javax.swing.JLabel();
        southCar3 = new javax.swing.JLabel();
        southCar2 = new javax.swing.JLabel();
        southCar4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Light Control System Simulation");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setDoubleBuffered(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trafficLightBackground_North.setBackground(new java.awt.Color(0, 0, 0));

        redlight_North.setBackground(new java.awt.Color(255, 255, 255));
        redlight_North.setOpaque(true);

        yellowlight_North.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_North.setOpaque(true);

        greenlight_North.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_North.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackground_NorthLayout = new javax.swing.GroupLayout(trafficLightBackground_North);
        trafficLightBackground_North.setLayout(trafficLightBackground_NorthLayout);
        trafficLightBackground_NorthLayout.setHorizontalGroup(
            trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_NorthLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(redlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(yellowlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(greenlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackground_NorthLayout.setVerticalGroup(
            trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_NorthLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(trafficLightBackground_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenlight_North, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(trafficLightBackground_North, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 60));

        northCar1.setBackground(new java.awt.Color(0, 0, 0));
        northCar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        northCar1.setOpaque(true);
        jPanel1.add(northCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 145, 40, 60));

        north.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        north.setText("NORTH");
        jPanel1.add(north, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        northCar2.setBackground(new java.awt.Color(0, 0, 0));
        northCar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        northCar2.setOpaque(true);
        jPanel1.add(northCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 145, 40, 60));

        northCar3.setForeground(new java.awt.Color(255, 255, 255));
        northCar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        northCar3.setOpaque(true);
        jPanel1.add(northCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 76, 40, 60));

        northCar4.setBackground(new java.awt.Color(0, 0, 0));
        northCar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        northCar4.setOpaque(true);
        jPanel1.add(northCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 76, 40, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("N");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 350, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        instruction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        instruction.setText("Instruction");
        instruction.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instruction)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(instruction)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 310, 280));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 300, 270));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 310, 260));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trafficLightBackground.setBackground(new java.awt.Color(0, 0, 0));

        redlight_West.setBackground(new java.awt.Color(255, 255, 255));
        redlight_West.setOpaque(true);

        yellowlight_West.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_West.setOpaque(true);

        greenlight_West.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_West.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackgroundLayout = new javax.swing.GroupLayout(trafficLightBackground);
        trafficLightBackground.setLayout(trafficLightBackgroundLayout);
        trafficLightBackgroundLayout.setHorizontalGroup(
            trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackgroundLayout.setVerticalGroup(
            trafficLightBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(redlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(yellowlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(greenlight_West, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(trafficLightBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 2, -1, 133));

        westCar1.setBackground(new java.awt.Color(0, 0, 0));
        westCar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        westCar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        westCar1.setOpaque(true);
        jPanel2.add(westCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 16, 60, 40));

        westCar2.setBackground(new java.awt.Color(0, 0, 0));
        westCar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        westCar2.setOpaque(true);
        jPanel2.add(westCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 74, 60, 40));

        west.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        west.setText("WEST");
        jPanel2.add(west, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        westCar3.setBackground(new java.awt.Color(0, 0, 0));
        westCar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        westCar3.setOpaque(true);
        jPanel2.add(westCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 18, 60, 40));

        westCar4.setBackground(new java.awt.Color(0, 0, 0));
        westCar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        westCar4.setOpaque(true);
        jPanel2.add(westCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 74, 60, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("W");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setText("___________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 50));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trafficLightBackground_North1.setBackground(new java.awt.Color(0, 0, 0));

        redlight_East.setBackground(new java.awt.Color(255, 255, 255));
        redlight_East.setOpaque(true);

        yellowlight_East.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_East.setOpaque(true);

        greenlight_East.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_East.setOpaque(true);

        javax.swing.GroupLayout trafficLightBackground_North1Layout = new javax.swing.GroupLayout(trafficLightBackground_North1);
        trafficLightBackground_North1.setLayout(trafficLightBackground_North1Layout);
        trafficLightBackground_North1Layout.setHorizontalGroup(
            trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_North1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trafficLightBackground_North1Layout.setVerticalGroup(
            trafficLightBackground_North1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trafficLightBackground_North1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(redlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(yellowlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(greenlight_East, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(trafficLightBackground_North1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 56, -1));

        east.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        east.setText("EAST");
        jPanel3.add(east, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        eastCar2.setBackground(new java.awt.Color(0, 0, 0));
        eastCar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eastCar2.setOpaque(true);
        jPanel3.add(eastCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, 40));

        eactCar1.setBackground(new java.awt.Color(0, 0, 0));
        eactCar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eactCar1.setOpaque(true);
        jPanel3.add(eactCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 40));

        eastCar3.setBackground(new java.awt.Color(0, 0, 0));
        eastCar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eastCar3.setOpaque(true);
        jPanel3.add(eastCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, 40));

        eastCar4.setBackground(new java.awt.Color(0, 0, 0));
        eastCar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eastCar4.setOpaque(true);
        jPanel3.add(eastCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("E");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        tovertical.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tovertical.setText("______________________________");
        jPanel3.add(tovertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 310, -1));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trafficLightBackground1.setBackground(new java.awt.Color(0, 0, 0));
        trafficLightBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redlight_South.setBackground(new java.awt.Color(255, 255, 255));
        redlight_South.setOpaque(true);
        trafficLightBackground1.add(redlight_South, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 35, 35));

        yellowlight_South.setBackground(new java.awt.Color(255, 255, 255));
        yellowlight_South.setOpaque(true);
        trafficLightBackground1.add(yellowlight_South, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 35, 35));

        greenlight_South.setBackground(new java.awt.Color(255, 255, 255));
        greenlight_South.setOpaque(true);
        trafficLightBackground1.add(greenlight_South, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 35, 35));

        jPanel4.add(trafficLightBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 137, 58));

        south.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        south.setText("SOUTH");
        jPanel4.add(south, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        southCar1.setBackground(new java.awt.Color(0, 0, 0));
        southCar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        southCar1.setOpaque(true);
        jPanel4.add(southCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 76, 40, 57));

        southCar3.setBackground(new java.awt.Color(0, 0, 0));
        southCar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        southCar3.setOpaque(true);
        jPanel4.add(southCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 149, 40, 57));

        southCar2.setBackground(new java.awt.Color(0, 0, 0));
        southCar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        southCar2.setOpaque(true);
        jPanel4.add(southCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 76, 40, 57));

        southCar4.setBackground(new java.awt.Color(0, 0, 0));
        southCar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        southCar4.setOpaque(true);
        jPanel4.add(southCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 149, 40, 57));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("S");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 10, 20));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 340, 250));

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getAccessibleContext().setAccessibleName("Traffic Light");

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

    public void setWhichDirectionToColor(String occupied, String color){
        Color colorToSet = color.equals("G") ? Color.green : 
                            color.equals("Y") ? Color.yellow : Color.red;
        
        if(color.equals("G")){
            if(currentGreen != null)
                currentGreen.setBackground(Color.white);
            
            if(occupied.equals("N")){
                currentGreen = greenlight_North;
                readyToYellow = yellowlight_North;
                readyToRed = redlight_North;
            }
            else if(occupied.equals("S")){
                currentGreen = greenlight_South;
                readyToYellow = yellowlight_South;
                readyToRed = redlight_South;
            }
            else if(occupied.equals("W")){
                currentGreen = greenlight_West;
                readyToYellow = yellowlight_West;
                readyToRed = redlight_West;
            }
            else{
                currentGreen = greenlight_East;
                readyToYellow = yellowlight_East;
                readyToRed = redlight_East;
            }
            currentGreen.setBackground(colorToSet);
            readyToRed.setBackground(Color.white);
            setOtherDirectionToRed(occupied);
        }
        else if(color.equals("Y")){
            currentGreen.setBackground(Color.white);
            readyToYellow.setBackground(colorToSet);
        }
        else{
            readyToYellow.setBackground(Color.white);
            readyToRed.setBackground(colorToSet);
        }
    }
    
    public void setOtherDirectionToRed(String occupied){
        if(!occupied.equals("N"))
            redlight_North.setBackground(Color.red);
        
        if(!occupied.equals("S"))
            redlight_South.setBackground(Color.red);
        
        if(!occupied.equals("W"))
            redlight_West.setBackground(Color.red);
        
        if(!occupied.equals("E"))
            redlight_East.setBackground(Color.red);
    }

    public void setInstruction(String instruction){
        this.instruction.setText(instruction);
    }
    
    public void setNorthTotalCar(int total){
        north.setText("Total Car:"+String.valueOf(total));
    }
    public void setSouthTotalCar(int total){
        south.setText("Total Car:"+String.valueOf(total));
    }
    public void setWestTotalCar(int total){
        west.setText("Total Car:"+String.valueOf(total));
    }
    public void setEastTotalCar(int total){
        east.setText("Total Car:"+String.valueOf(total));
    }
    
    
//    public void setNorthToGreen(){
//        //先set其他light 去red
//        redlight_goNorth.setBackground(Color.white);
//        yellowlight_goNorth.setBackground(Color.white);
//        greenlight_goNorth.setBackground(Color.green);
//        //set other light to red
//        redlight_goSouth.setBackground(Color.red);
//        redlight_goEast.setBackground(Color.red);
//        redlight_goWest.setBackground(Color.red);
//        //set other GREEN to WHITE
//        greenlight_goSouth.setBackground(Color.white);
//        greenlight_goEast.setBackground(Color.white);
//        greenlight_goWest.setBackground(Color.white);
//        
//    }
//    
//    public void setSouthToGreen(){
//        redlight_goSouth.setBackground(Color.white);
//        yellowlight_goSouth.setBackground(Color.white);
//        greenlight_goSouth.setBackground(Color.green);
//        //set other light to red
//        redlight_goNorth.setBackground(Color.red);
//        redlight_goEast.setBackground(Color.red);
//        redlight_goWest.setBackground(Color.red);
//        //set other GREEN to WHITE
//        greenlight_goNorth.setBackground(Color.white);
//        greenlight_goEast.setBackground(Color.white);
//        greenlight_goWest.setBackground(Color.white);
//    }
//    
//    public void setEastToGreen(){
//        redlight_goEast.setBackground(Color.white);
//        yellowlight_goEast.setBackground(Color.white);
//        greenlight_goEast.setBackground(Color.green);
//        //set other light to red
//        redlight_goNorth.setBackground(Color.red);
//        redlight_goSouth.setBackground(Color.red);
//        redlight_goWest.setBackground(Color.red);
//        //set other GREEN to WHITE
//        greenlight_goSouth.setBackground(Color.white);
//        greenlight_goNorth.setBackground(Color.white);
//        greenlight_goWest.setBackground(Color.white);
//    }
//    
//    public void setWestToGreen(){
//        redlight_goWest.setBackground(Color.white);
//        yellowlight_goWest.setBackground(Color.white);
//        greenlight_goWest.setBackground(Color.green);
//        //set other light to red
//        redlight_goNorth.setBackground(Color.red);
//        redlight_goEast.setBackground(Color.red);
//        redlight_goSouth.setBackground(Color.red);
//        //set other GREEN to WHITE
//        greenlight_goSouth.setBackground(Color.white);
//        greenlight_goNorth.setBackground(Color.white);
//        greenlight_goEast.setBackground(Color.white);
//    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //timer2.start();
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JLabel eactCar1;
    private javax.swing.JLabel east;
    private javax.swing.JLabel eastCar2;
    private javax.swing.JLabel eastCar3;
    private javax.swing.JLabel eastCar4;
    private javax.swing.JLabel greenlight_East;
    private javax.swing.JLabel greenlight_North;
    private javax.swing.JLabel greenlight_South;
    private javax.swing.JLabel greenlight_West;
    private javax.swing.JLabel instruction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel north;
    private javax.swing.JLabel northCar1;
    private javax.swing.JLabel northCar2;
    private javax.swing.JLabel northCar3;
    private javax.swing.JLabel northCar4;
    private javax.swing.JLabel redlight_East;
    private javax.swing.JLabel redlight_North;
    private javax.swing.JLabel redlight_South;
    private javax.swing.JLabel redlight_West;
    private javax.swing.JLabel south;
    private javax.swing.JLabel southCar1;
    private javax.swing.JLabel southCar2;
    private javax.swing.JLabel southCar3;
    private javax.swing.JLabel southCar4;
    private javax.swing.JLabel tovertical;
    private javax.swing.JPanel trafficLightBackground;
    private javax.swing.JPanel trafficLightBackground1;
    private javax.swing.JPanel trafficLightBackground_North;
    private javax.swing.JPanel trafficLightBackground_North1;
    private javax.swing.JLabel west;
    private javax.swing.JLabel westCar1;
    private javax.swing.JLabel westCar2;
    private javax.swing.JLabel westCar3;
    private javax.swing.JLabel westCar4;
    private javax.swing.JLabel yellowlight_East;
    private javax.swing.JLabel yellowlight_North;
    private javax.swing.JLabel yellowlight_South;
    private javax.swing.JLabel yellowlight_West;
    // End of variables declaration//GEN-END:variables

}
