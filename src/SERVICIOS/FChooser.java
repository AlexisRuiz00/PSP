package SERVICIOS;

import javax.swing.*;

public class FChooser extends JFrame{

    private javax.swing.JFileChooser fChooser;


        public FChooser() {
            initComponents();
        }

        private void initComponents() {

            fChooser = new javax.swing.JFileChooser();
            fChooser.addActionListener(App_Ftp.getApp());

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(fChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(fChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))

            );
            pack();
            this.setVisible(true);
    }

}
