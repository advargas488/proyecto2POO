package proyectpoo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class tablero extends javax.swing.JFrame {
    public tablero() {
        initComponents();
        sh.setText("");
        nin.setText("");
        sh.setIcon(shooter);
        nin.setIcon(explorador);
    }
    ImageIcon explorador = new ImageIcon("explorador.png");
    ImageIcon shooter = new ImageIcon("shooter.png");
    ImageIcon def = new ImageIcon("Default.png");
    ImageIcon cruz = new ImageIcon("Cruz.png");
    ImageIcon door = new ImageIcon("Door.png");
    ImageIcon barr = new ImageIcon("Barrera.png");
    int personajeClick;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int b5 = 0;
    int b6 = 0;
    int b7 = 0;
    int b8 = 0;
    int b9 = 0;
    int b10 = 0;
    int b11 = 0;
    int b12 = 0;
    int b13 = 0;
    int b14 = 0;
    int b15 = 0;
    int b16 = 0;
    int b17 = 0;
    int b18 = 0;
    int b19 = 0;
    int b20 = 0;
    int b21 = 0;
    int b22 = 0;
    int b23 = 0;
    int b24 = 0;
    int b25 = 0;
    int b26 = 0;
    int b27 = 0;
    int b28 = 0;
    int b29 = 0;
    int b30 = 0;
    int b31 = 0;
    int b32 = 0;
    int b33 = 0;
    int b34 = 0;
    int b35 = 0;
    int b36 = 0;
    int b37 = 0;
    int b38 = 0;
    int b39 = 0;
    int b40 = 0;
    int doorIs;
    int barrIs;
    private void set_casilla(JButton casilla,ImageIcon icono){
        if(casilla.getIcon()==icono){
            if(doorIs == 1){
                casilla.setIcon(door);
                doorIs = 0;
            }else if(barrIs == 1){
                casilla.setIcon(barr);
                barrIs = 0;
            }else{
                casilla.setIcon(def);
            }
        }
    }
    private void bt4config(JButton boton,int bb,JButton btnc1,JButton btnc2,JButton btnc3,JButton btnc4){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==def){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter); 
            set_casilla(btnc4,shooter);  
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==def){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);     
            set_casilla(btnc3,explorador);  
            set_casilla(btnc4,explorador);  
        }
    }
    private void todos_cero(){
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;
        b10 = 0;
        b11 = 0;
        b12 = 0;
        b13 = 0;
        b14 = 0;
        b15 = 0;
        b16 = 0;
        b17 = 0;
        b18 = 0;
        b19 = 0;
        b20 = 0;
        b21 = 0;
        b22 = 0;
        b23 = 0;
        b24 = 0;
        b25 = 0;
        b26 = 0;
        b27 = 0;
        b28 = 0;
        b29 = 0;
        b30 = 0;
        b31 = 0;
        b32 = 0;
        b33 = 0;
        b34 = 0;
        b35 = 0;
        b36 = 0;
        b37 = 0;
        b38 = 0;
        b39 = 0;
        b40 = 0;
    }
    private void bt3config(JButton boton,int bb,JButton btnc1,JButton btnc2,JButton btnc3){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==def){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter); 
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==def){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);     
            set_casilla(btnc3,explorador);  
        }
    }
    private void bt2config(JButton boton,int bb,JButton btnc1,JButton btnc2){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==def){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==def){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);      
        }
    }
    private void bt3configdoor(JButton boton,int bb,JButton btnc1,JButton btnc2,JButton btnc3){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==door){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter); 
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==door){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);     
            set_casilla(btnc3,explorador);  
        }
    }
    private void bt3configbarr(JButton boton,int bb,JButton btnc1,JButton btnc2,JButton btnc3){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==barr){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter); 
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==barr){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);
            set_casilla(btnc3,explorador);  
        }
    }
    private void bt1configdoor(JButton boton,int bb,JButton btnc1){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && bb==1 && boton.getIcon()==door){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
        }
        else if(personajeClick == 2 && bb==1 && boton.getIcon()==door){
            nin.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        sh = new javax.swing.JLabel();
        nin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setIcon(def);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn4.setIcon(def);
        btn4.setText("jButton1");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn3.setIcon(def);
        btn3.setText("jButton1");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn2.setIcon(def);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn5.setIcon(def);
        btn5.setText("jButton1");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn6.setIcon(def);
        btn6.setText("jButton1");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setIcon(def);
        btn7.setText("jButton1");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn12.setIcon(def);
        btn12.setText("jButton1");
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn12MouseClicked(evt);
            }
        });

        btn11.setIcon(def);
        btn11.setText("jButton1");
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn11MouseClicked(evt);
            }
        });

        btn10.setIcon(def);
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn10MouseClicked(evt);
            }
        });

        btn13.setIcon(def);
        btn13.setText("jButton1");
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn13MouseClicked(evt);
            }
        });

        btn14.setIcon(def);
        btn14.setText("jButton1");
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn14MouseClicked(evt);
            }
        });

        btn15.setIcon(def);
        btn15.setText("jButton1");
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn15MouseClicked(evt);
            }
        });

        btn9.setIcon(def);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn20.setIcon(def);
        btn20.setText("jButton1");
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn20MouseClicked(evt);
            }
        });

        btn19.setIcon(cruz);
        btn19.setText("jButton1");

        btn18.setIcon(def);
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn18MouseClicked(evt);
            }
        });

        btn21.setIcon(door);
        btn21.setText("jButton1");
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn21MouseClicked(evt);
            }
        });

        btn22.setIcon(def);
        btn22.setText("jButton1");
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn22MouseClicked(evt);
            }
        });

        btn23.setIcon(def);
        btn23.setText("jButton1");
        btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn23MouseClicked(evt);
            }
        });

        btn17.setIcon(def);
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn17MouseClicked(evt);
            }
        });

        btn28.setIcon(barr);
        btn28.setText("jButton1");
        btn28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn28MouseClicked(evt);
            }
        });
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn27.setIcon(def);
        btn27.setText("jButton1");
        btn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn27MouseClicked(evt);
            }
        });

        btn26.setIcon(def);
        btn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn26MouseClicked(evt);
            }
        });

        btn29.setIcon(def);
        btn29.setText("jButton1");
        btn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn29MouseClicked(evt);
            }
        });

        btn30.setIcon(def);
        btn30.setText("jButton1");
        btn30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn30MouseClicked(evt);
            }
        });

        btn31.setIcon(cruz);
        btn31.setText("jButton1");

        btn25.setIcon(def);
        btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn25MouseClicked(evt);
            }
        });

        btn36.setIcon(cruz);
        btn36.setText("jButton1");

        btn35.setIcon(cruz);
        btn35.setText("jButton1");

        btn34.setIcon(def);
        btn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn34MouseClicked(evt);
            }
        });

        btn37.setIcon(def);
        btn37.setText("jButton1");
        btn37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn37MouseClicked(evt);
            }
        });

        btn38.setIcon(def);
        btn38.setText("jButton1");
        btn38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn38MouseClicked(evt);
            }
        });

        btn39.setIcon(door);
        btn39.setText("jButton1");
        btn39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn39MouseClicked(evt);
            }
        });

        btn33.setIcon(def);
        btn33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn33MouseClicked(evt);
            }
        });

        btn32.setIcon(def);
        btn32.setText("jButton1");
        btn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn32MouseClicked(evt);
            }
        });

        btn8.setIcon(def);
        btn8.setText("jButton1");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn40.setIcon(def);
        btn40.setText("jButton1");
        btn40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn40MouseClicked(evt);
            }
        });

        btn16.setIcon(def);
        btn16.setText("jButton1");
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn16MouseClicked(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn24.setIcon(def);
        btn24.setText("jButton1");
        btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn24MouseClicked(evt);
            }
        });

        sh.setText("shooter");
        sh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shMouseClicked(evt);
            }
        });

        nin.setText("explorador");
        nin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ninMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sh, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void shMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shMouseClicked
        todos_cero();
        personajeClick = 1;
        b1 = 1;
        b9 = 1;
        b17 = 1;
        b25 = 1;
        b33 = 1;
    }//GEN-LAST:event_shMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        bt2config(btn1,b1,btn2,btn9);
        todos_cero();
        b2 = 1;
        b9 = 1;
    }//GEN-LAST:event_btn1MouseClicked

    private void ninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninMouseClicked
        todos_cero();
        personajeClick = 2;
        b1 = 1;
        b9 = 1;
        b17 = 1;
        b25 = 1;
        b33 = 1;
    }//GEN-LAST:event_ninMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        bt3config(btn2,b2,btn1,btn3,btn10);
        todos_cero();
        b1 = 1;
        b3 = 1;
        b10 = 1;
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        bt3config(btn3,b3,btn2,btn4,btn11);
        todos_cero();
        b2 = 1;
        b4 = 1;
        b11 = 1;
    }//GEN-LAST:event_btn3MouseClicked

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        bt3config(btn4,b4,btn3,btn5,btn12);
        todos_cero();
        b3 = 1;
        b5 = 1;
        b12 = 1;
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        bt3config(btn5,b5,btn4,btn13,btn6);
        todos_cero();
        b4 = 1;
        b13 = 1;
        b6 = 1;
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        bt3config(btn6,b6,btn5,btn14,btn7);
        todos_cero();
        b5 = 1;
        b14 = 1;
        b7 = 1;
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        bt3config(btn7,b7,btn8,btn6,btn15);
        todos_cero();
        b8 = 1;
        b6 = 1;
        b15 = 1;
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
       bt2config(btn8,b8,btn7,btn16);
        todos_cero();
        b7 = 1;
        b16 = 1;
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        bt3config(btn9,b9,btn1,btn10,btn17);
        todos_cero();
        b1 = 1;
        b10 = 1;
        b17 = 1;
    }//GEN-LAST:event_btn9MouseClicked

    private void btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseClicked
        bt4config(btn10,b10,btn11,btn9,btn18,btn2);
        todos_cero();
        b9 = 1;
        b2 = 1;
        b18 = 1;
        b11 = 1;
    }//GEN-LAST:event_btn10MouseClicked

    private void btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseClicked
        bt3config(btn11,b11,btn10,btn12,btn3);
        todos_cero();
        b10 = 1;
        b12 = 1;
        b3 = 1;
    }//GEN-LAST:event_btn11MouseClicked

    private void btn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseClicked
        bt4config(btn12,b12,btn11,btn4,btn20,btn13);
        todos_cero();
        b4 = 1;
        b11 = 1;
        b20 = 1;
        b13 = 1;
    }//GEN-LAST:event_btn12MouseClicked

    private void btn13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseClicked
        bt4config(btn13,b13,btn12,btn5,btn14,btn21);
        todos_cero();
        b12 = 1;
        b5 = 1;
        b14 = 1;
        b21 = 1;
    }//GEN-LAST:event_btn13MouseClicked

    private void btn14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseClicked
        bt4config(btn14,b14,btn15,btn22,btn13,btn6);
        todos_cero();
        b15 = 1;
        b22 = 1;
        b13 = 1;
        b6 = 1;
    }//GEN-LAST:event_btn14MouseClicked

    private void btn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseClicked
        bt4config(btn15,b15,btn14,btn7,btn16,btn23);
        todos_cero();
        b14 = 1;
        b7 = 1;
        b16 = 1;
        b23 = 1;
    }//GEN-LAST:event_btn15MouseClicked

    private void btn16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseClicked
        bt3config(btn16,b16,btn15,btn8,btn24);
        todos_cero();
        b15 = 1;
        b8 = 1;
        b24 = 1;
    }//GEN-LAST:event_btn16MouseClicked

    private void btn17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseClicked
        bt3config(btn17,b17,btn9,btn25,btn18);
        todos_cero();
        b25 = 1;
        b9 = 1;
        b18 = 1;
    }//GEN-LAST:event_btn17MouseClicked

    private void btn18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseClicked
        bt3config(btn18,b18,btn17,btn10,btn26);
        todos_cero();
        b17 = 1;
        b10 = 1;
        b26 = 1;
    }//GEN-LAST:event_btn18MouseClicked

    private void btn20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseClicked
        bt3config(btn20,b20,btn12,btn21,btn28);
        todos_cero();
        b12 = 1;
        b21= 1;
        b28 = 1;
    }//GEN-LAST:event_btn20MouseClicked

    private void btn21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn21MouseClicked
        bt3configdoor(btn21,b21,btn13,btn20,btn29);
        todos_cero();
        b13 = 1;
        b20 = 1;
        b29 = 1;
        if(btn21.getIcon()!=door){
            doorIs = 1;
        }else{
            doorIs = 0;
        }
    }//GEN-LAST:event_btn21MouseClicked

    private void btn22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn22MouseClicked
        bt3config(btn22,b22,btn23,btn14,btn30);
        todos_cero();
        b23 = 1;
        b14 = 1;
        b30 = 1;
    }//GEN-LAST:event_btn22MouseClicked

    private void btn23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn23MouseClicked
        bt3config(btn23,b23,btn22,btn15,btn24);
        todos_cero();
        b22 = 1;
        b15 = 1;
        b24 = 1;
    }//GEN-LAST:event_btn23MouseClicked

    private void btn24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn24MouseClicked
        bt3config(btn24,b24,btn23,btn16,btn32);
        todos_cero();
        b23 = 1;
        b16 = 1;
        b32 = 1;
    }//GEN-LAST:event_btn24MouseClicked

    private void btn25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn25MouseClicked
        bt3config(btn25,b25,btn26,btn17,btn33);
        todos_cero();
        b26 = 1;
        b17 = 1;
        b33 = 1;
    }//GEN-LAST:event_btn25MouseClicked

    private void btn26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn26MouseClicked
        bt4config(btn26,b26,btn25,btn27,btn18,btn34);
        todos_cero();
        b25 = 1;
        b27 = 1;
        b18 = 1;
        b34 = 1;
    }//GEN-LAST:event_btn26MouseClicked

    private void btn27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn27MouseClicked
        bt2config(btn27,b27,btn26,btn28);
        todos_cero();
        b26 = 1;
        b28 = 1;
    }//GEN-LAST:event_btn27MouseClicked

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn28MouseClicked
        bt3configbarr(btn28,b28,btn27,btn20,btn29);
        todos_cero();
        b27 = 1;
        b20 = 1;
        if(btn21.getIcon()!=barr){
            barrIs = 1;
        }else{
            barrIs = 0;
        }
    }//GEN-LAST:event_btn28MouseClicked

    private void btn29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn29MouseClicked
        bt4config(btn29,b29,btn28,btn30,btn37,btn21);
        todos_cero();
        b28 = 1;
        b30 = 1;
        b37 = 1;
        b21 = 1;
    }//GEN-LAST:event_btn29MouseClicked

    private void btn30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn30MouseClicked
        bt3config(btn30,b30,btn29,btn22,btn38);
        todos_cero();
        b29 = 1;
        b22 = 1;
        b38 = 1;
    }//GEN-LAST:event_btn30MouseClicked

    private void btn32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn32MouseClicked
        bt2config(btn32,b32,btn24,btn40);
        todos_cero();
        b24 = 1;
        b40 = 1;
    }//GEN-LAST:event_btn32MouseClicked

    private void btn33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn33MouseClicked
        bt2config(btn33,b33,btn25,btn34);
        todos_cero();
        b25 = 1;
        b34 = 1;
    }//GEN-LAST:event_btn33MouseClicked

    private void btn34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn34MouseClicked
        bt2config(btn34,b34,btn26,btn33);
        todos_cero();
        b26 = 1;
        b33 = 1;
    }//GEN-LAST:event_btn34MouseClicked

    private void btn37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn37MouseClicked
        bt2config(btn37,b37,btn29,btn38);
        todos_cero();
        b29 = 1;
        b38 = 1;
    }//GEN-LAST:event_btn37MouseClicked

    private void btn38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn38MouseClicked
        bt3config(btn38,b38,btn37,btn39,btn30);
        todos_cero();
        b37 = 1;
        b39 = 1;
        b30 = 1;
    }//GEN-LAST:event_btn38MouseClicked

    private void btn39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn39MouseClicked
        bt1configdoor(btn39,b39,btn38);
        todos_cero();
        b38 = 1;
        if(btn39.getIcon()!=door){
            doorIs = 1;
        }else{
            doorIs = 0;
        }
    }//GEN-LAST:event_btn39MouseClicked

    private void btn40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn40MouseClicked
        if(btn40.getIcon()==shooter){personajeClick = 1;}
        if(btn40.getIcon()==explorador){personajeClick = 2;}
        if(personajeClick == 1 && b40==1 && btn40.getIcon()==def){
            sh.setVisible(false);
            btn40.setIcon(shooter);
            set_casilla(btn32,shooter);
        }
        else if(personajeClick == 2 && b40==1 && btn40.getIcon()==def){
            nin.setVisible(false);
            btn40.setIcon(explorador);
            set_casilla(btn32,explorador);
        }
        b32 = 1;
    }//GEN-LAST:event_btn40MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel nin;
    private javax.swing.JLabel sh;
    // End of variables declaration//GEN-END:variables
}
