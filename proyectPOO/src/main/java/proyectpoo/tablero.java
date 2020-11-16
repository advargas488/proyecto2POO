package proyectpoo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class tablero extends javax.swing.JFrame {
    public tablero() {
        initComponents();
        sh.setText("");
        nin.setText("");
        sh.setIcon(shooter);
        nin.setIcon(ninja);
        explo.setIcon(explorador);
        zombie = zombiebase;
        spawn.setIcon(zombie);
        atack.setVisible(false);
        
    }
    //definicion personajes
    explorador explorador1 = new explorador(20,100,"NO",1,1,0,0);
    tirador tirador1 = new tirador(25,100,"NO",2,0,0,1);
    ninja ninja1 = new ninja(30,100,"NO",1,0,0,0);
    //definicion de los zombies
    tankZombie tank = new tankZombie(80,10,"Filo Infinito",20,5);
    flashZombie flash = new flashZombie(80,10,"Pistola Hextech",2,1);
    superZombie superz = new superZombie(80,10,"Espada de Doran",25,10);
    //definicion de armas
    Armas pistola = new Armas("Pistola Hextech",30,1,2);
    Armas espada = new Armas("Filo infinito",10,0,1);
    //para ir generando zombies distintos
    int defz = 1;
    //imagenes para la creacion del tablero, los personajes, las armas, los zombies, etc
    ImageIcon sword = new ImageIcon("espada.png");
    ImageIcon gun = new ImageIcon("pistola.png");
    ImageIcon zombie = new ImageIcon();
    ImageIcon zombiebase = new ImageIcon("zombie.png");
    ImageIcon tankzombie = new ImageIcon("tankzombie.png");
    ImageIcon megazombie = new ImageIcon("superz.png");
    ImageIcon explorador = new ImageIcon("explorador.png");
    ImageIcon shooter = new ImageIcon("shooter.png");
    ImageIcon ninja = new ImageIcon("ninja.png");
    ImageIcon def = new ImageIcon("Default.png");
    ImageIcon cruz = new ImageIcon("Cruz.png");
    ImageIcon door = new ImageIcon("Door.png");
    ImageIcon barr = new ImageIcon("Barrera.png");
    //para el control de turnos
    int turno1 = 1;
    int turno2 = 1;
    int turno3 = 1;
    //determina sobre cual personaje se hizo click
    int personajeClick;
    //para saber sobre cual boton se pueden mover los personajes
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
    int zaatacar;
    int btonspawn = 1;
    //para el control de los puntos de spawn
    JButton setspawn;
    //para saber cuantos zombies hay en el tablero
    int znum = 0;
    JButton botnfrentez;
    int mover = 0;
    private JButton casillasZ(ImageIcon zombieamover){
        if(btn2.getIcon() == zombieamover){
                botnfrentez = btn2;
            }
        else if(btn3.getIcon() == zombieamover){
                botnfrentez = btn3;
            }
        else if(btn4.getIcon() == zombieamover){
               botnfrentez = btn4;
                
            }
        else if(btn5.getIcon() == zombieamover){
                botnfrentez = btn5;
                
            }
        else if(btn6.getIcon() == zombieamover){
                botnfrentez = btn6;
                
            }
        else if(btn7.getIcon() == zombieamover){
                botnfrentez = btn7;
                
            }
        else if(btn8.getIcon() == zombieamover){
                botnfrentez = btn8;
                
            }
        if(btn10.getIcon() == zombieamover){
                botnfrentez = btn10;
                
            }
        else if(btn11.getIcon() == zombieamover){
                botnfrentez = btn11;
                
            }
        else if(btn12.getIcon() == zombieamover){
                botnfrentez = btn12;
                
            }
        else if(btn13.getIcon() == zombieamover){
                botnfrentez = btn13;
                
            }
        else if(btn14.getIcon() == zombieamover){
               botnfrentez = btn14;
                
            }
        else if(btn15.getIcon() == zombieamover){
                botnfrentez = btn15;
                
            }
        else if(btn16.getIcon() == zombieamover){
                botnfrentez = btn16;
                
            }
        if(btn22.getIcon() == zombieamover){
                botnfrentez = btn22;
                
            }
        else if(btn23.getIcon() == zombieamover){
               botnfrentez = btn23;
               
            }
        else if(btn24.getIcon() == zombieamover){
                botnfrentez = btn24;
                
            }
        if(btn32.getIcon() == zombieamover){
                botnfrentez = btn32;
                
            }
        if(btn40.getIcon() == zombieamover){
                botnfrentez = btn40;
                
            }
        return botnfrentez;
    }//devuelve la casilla en el que n zombie se encuentra
    private void movzombien(ImageIcon zombieamover){
        if(btn2.getIcon() == zombieamover && btn1.getIcon() == def){
                btn1.setIcon(zombieamover);
                set_casilla(btn2,zombieamover); 
                mover = 1;
            }
        else if(btn3.getIcon() == zombieamover&& btn2.getIcon() == def){
                btn2.setIcon(zombieamover);
                set_casilla(btn3,zombieamover);
                mover = 1;
            }
        else if(btn4.getIcon() == zombieamover&& btn3.getIcon() == def){
                btn3.setIcon(zombieamover);
                set_casilla(btn4,zombieamover);
                mover = 1;
            }
        else if(btn5.getIcon() == zombieamover&& btn4.getIcon() == def){
                btn4.setIcon(zombieamover);
                set_casilla(btn5,zombieamover);
                mover = 1;
            }
        else if(btn6.getIcon() == zombieamover&& btn5.getIcon() == def){
                btn5.setIcon(zombieamover);
                set_casilla(btn6,zombieamover);
                mover = 1;
            }
        else if(btn7.getIcon() == zombieamover&& btn6.getIcon() == def){
                btn6.setIcon(zombieamover);
                set_casilla(btn7,zombieamover);
                mover = 1;
            }
        else if(btn8.getIcon() == zombieamover&& btn7.getIcon() == def){
                btn7.setIcon(zombieamover);
                set_casilla(btn8,zombieamover);
                mover = 1;
            }
        if(btn10.getIcon() == zombieamover&& btn9.getIcon() == def){
                btn9.setIcon(zombieamover);
                set_casilla(btn10,zombieamover);
                mover = 1;
            }
        else if(btn11.getIcon() == zombieamover&& btn10.getIcon() == def){
                btn10.setIcon(zombieamover);
                set_casilla(btn11,zombieamover);
                mover = 1;
            }
        else if(btn12.getIcon() == zombieamover&& btn11.getIcon() == def){
                btn11.setIcon(zombieamover);
                set_casilla(btn12,zombieamover);
                mover = 1;
            }
        else if(btn13.getIcon() == zombieamover&& btn12.getIcon() == def){
                btn12.setIcon(zombieamover);
                set_casilla(btn13,zombieamover);
                mover = 1;
            }
        else if(btn14.getIcon() == zombieamover&& btn13.getIcon() == def){
                btn13.setIcon(zombieamover);
                set_casilla(btn14,zombieamover);
                mover = 1;
            }
        else if(btn15.getIcon() == zombieamover&& btn14.getIcon() == def){
                btn14.setIcon(zombieamover);
                set_casilla(btn15,zombieamover);
                mover = 1;
            }
        else if(btn16.getIcon() == zombieamover&& btn16.getIcon() == def){
                btn15.setIcon(zombieamover);
                set_casilla(btn16,zombieamover);
                mover = 1;
            }
        if(btn22.getIcon() == zombieamover&& btn14.getIcon() == def){
                btn14.setIcon(zombieamover);
                set_casilla(btn22,zombieamover);
                mover = 1;
                
            }
        else if(btn23.getIcon() == zombieamover&& btn22.getIcon() == def){
                btn22.setIcon(zombieamover);
                set_casilla(btn23,zombieamover);
                mover = 1;
               
            }
        else if(btn24.getIcon() == zombieamover&& btn23.getIcon() == def){
                btn23.setIcon(zombieamover);
                set_casilla(btn24,zombieamover);
                mover = 1;
                
            }
        if(btn32.getIcon() == zombieamover&& btn24.getIcon() == def){
                btn24.setIcon(zombieamover);
                set_casilla(btn32,zombieamover);
                mover = 1;
                
            }
        if(btn40.getIcon() == zombieamover&& btn32.getIcon() == def){
                btn32.setIcon(zombieamover);
                set_casilla(btn40,zombieamover);
                mover = 1;
            }
    }
    private void zombieAtack(){
        //flashzombie
        if(casillasZ(zombiebase) == btn2 && btn1.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn3 && btn2.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn4 && btn3.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn5 && btn4.getIcon() == shooter){
            tirador1.vida = (tirador1.vida - (flash.dano * flash.dañodoble));
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn6 && btn5.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn7 && btn6.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn8 && btn7.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn10 && btn9.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn11 && btn10.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn12 && btn11.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn13 && btn12.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn14 && btn13.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn15 && btn14.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn16 && btn15.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn18 && btn17.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn23 && btn22.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn24 && btn23.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn26 && btn25.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn27 && btn26.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn30 && btn29.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            if(tirador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
        else if(casillasZ(zombiebase) == btn2 && btn1.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn3 && btn2.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(tirador1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn4 && btn3.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn5 && btn4.getIcon() == explorador){
            explorador1.vida = (explorador1.vida - (flash.dano * flash.dañodoble));
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn6 && btn5.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn7 && btn6.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn8 && btn7.getIcon() == explorador){
            explorador1.vida = tirador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn10 && btn9.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn11 && btn10.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn12 && btn11.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn13 && btn12.getIcon() ==explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn14 && btn13.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn15 && btn14.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn16 && btn15.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn18 && btn17.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn23 && btn22.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn24 && btn23.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn26 && btn25.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn27 && btn26.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn30 && btn29.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (flash.dano * flash.dañodoble);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
        if(casillasZ(zombiebase) == btn2 && btn1.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn3 && btn2.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn4 && btn3.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn5 && btn4.getIcon() == ninja){
            ninja1.vida = (ninja1.vida - (flash.dano * flash.dañodoble));
            if(ninja1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn6 && btn5.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn7 && btn6.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn8 && btn7.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn10 && btn9.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(zombiebase) == btn11 && btn10.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn12 && btn11.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn13 && btn12.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn14 && btn13.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn15 && btn14.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn16 && btn15.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn18 && btn17.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn23 && btn22.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn24 && btn23.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn26 && btn25.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn27 && btn26.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (flash.dano * flash.dañodoble);
            if(ninja1.vida <= 0){
                btn4.setIcon(def);
            }
        }
         else if(casillasZ(zombiebase) == btn30 && btn29.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //tankzombie
        //
        //
        if(casillasZ(tankzombie) == btn2 && btn1.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn3 && btn2.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn4 && btn3.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn5 && btn4.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn6 && btn5.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn7 && btn6.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn8 && btn7.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn10 && btn9.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn11 && btn10.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn12 && btn11.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn13 && btn12.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn14 && btn13.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn15 && btn14.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn16 && btn15.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn18 && btn17.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn23 && btn22.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn24 && btn23.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn26 && btn25.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn27 && btn26.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn30 && btn29.getIcon() == shooter){
            tirador1.vida = tirador1.vida - tank.dano;
            if(tirador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
        else if(casillasZ(tankzombie) == btn2 && btn1.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn3 && btn2.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(tirador1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn4 && btn3.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn5 && btn4.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn6 && btn5.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn7 && btn6.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn8 && btn7.getIcon() == explorador){
            explorador1.vida = tirador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn10 && btn9.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn11 && btn10.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn12 && btn11.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn13 && btn12.getIcon() ==explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn14 && btn13.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn15 && btn14.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn16 && btn15.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn18 && btn17.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn23 && btn22.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn24 && btn23.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn26 && btn25.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn27 && btn26.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn30 && btn29.getIcon() == explorador){
            explorador1.vida = explorador1.vida - tank.dano;
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
         else if(casillasZ(tankzombie) == btn2 && btn1.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn3 && btn2.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn4 && btn3.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn5 && btn4.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn6 && btn5.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn7 && btn6.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn8 && btn7.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn10 && btn9.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(tankzombie) == btn11 && btn10.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn12 && btn11.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn13 && btn12.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn14 && btn13.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn15 && btn14.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn16 && btn15.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn18 && btn17.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn23 && btn22.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn24 && btn23.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn26 && btn25.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn27 && btn26.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(tankzombie) == btn30 && btn29.getIcon() == ninja){
            ninja1.vida = ninja1.vida - tank.dano;
            if(ninja1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //superzombie
        //
        //
         if(casillasZ(megazombie) == btn2 && btn1.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn3 && btn2.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn4 && btn3.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn5 && btn4.getIcon() == shooter){
            tirador1.vida = (tirador1.vida - (superz.dano + superz.fuerza));
            if(tirador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn6 && btn5.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn7 && btn6.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn8 && btn7.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn10 && btn9.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn11 && btn10.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn12 && btn11.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn13 && btn12.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn14 && btn13.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn15 && btn14.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn16 && btn15.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn18 && btn17.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn23 && btn22.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn24 && btn23.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn26 && btn25.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn27 && btn26.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn30 && btn29.getIcon() == shooter){
            tirador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            if(tirador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
        else if(casillasZ(megazombie) == btn2 && btn1.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn3 && btn2.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(tirador1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn4 && btn3.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn5 && btn4.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn6 && btn5.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn7 && btn6.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn8 && btn7.getIcon() == explorador){
            explorador1.vida = tirador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn10 && btn9.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn11 && btn10.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn12 && btn11.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn13 && btn12.getIcon() ==explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn14 && btn13.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn15 && btn14.getIcon() == explorador1){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn16 && btn15.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn18 && btn17.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn23 && btn22.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn24 && btn23.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn26 && btn25.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn27 && btn26.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn30 && btn29.getIcon() == explorador){
            explorador1.vida = explorador1.vida - (superz.dano + superz.fuerza);
            explorador1.vida += explorador1.regeneracionVida;
            if(explorador1.vida <= 0){
                btn29.setIcon(def);
            }
        }
        //
        //
        if(casillasZ(megazombie) == btn2 && btn1.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn1.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn3 && btn2.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn2.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn4 && btn3.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn3.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn5 && btn4.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn4.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn6 && btn5.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn5.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn7 && btn6.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn6.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn8 && btn7.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn7.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn10 && btn9.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn9.setIcon(def);
            }
        }
        else if(casillasZ(megazombie) == btn11 && btn10.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn10.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn12 && btn11.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn11.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn13 && btn12.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn12.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn14 && btn13.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn13.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn15 && btn14.getIcon() == ninja1){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn14.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn16 && btn15.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn15.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn18 && btn17.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn17.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn23 && btn22.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn22.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn24 && btn23.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn23.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn26 && btn25.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn25.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn27 && btn26.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn26.setIcon(def);
            }
        }
         else if(casillasZ(megazombie) == btn30 && btn29.getIcon() == ninja){
            ninja1.vida = ninja1.vida - (superz.dano + superz.fuerza);
            if(ninja1.vida <= 0){
                btn29.setIcon(def);
            }
        }
    }
    private void determinarZombie(ImageIcon zombien, JButton spawn){
        if(spawn.getIcon()==def){
                spawn.setIcon(zombien);
                znum++;
        }
    }
    private void moverzombie(){
        if(turno1 == 0 && turno2 == 0 && turno3 == 0){
            if(btonspawn == 4){btonspawn=1;}
            switch (btonspawn) {
                case 1 -> setspawn = btn8;
                case 2 -> setspawn = btn24;
                case 3 -> setspawn = btn40;
                default -> {
                }
            }
            if(defz == 4){defz = 1;}
            switch (defz) {
                case 1 -> zombie = zombiebase;
                case 2 -> zombie = tankzombie;
                case 3 -> zombie = megazombie;
                default -> {
                }
            }
            movzombien(zombiebase);
            movzombien(tankzombie);
            movzombien(megazombie);
            zombieAtack();
            if(znum != 3){
               determinarZombie(zombie,setspawn);
            }
            defz++;
            btonspawn++;
            turno1 = 1;
            turno2 = 1;
            turno3 = 1;
            
        }
        setestats();
    }
    private void setestats(){
        if(personajeClick == 1){
            vida.setText("Vida: " + tirador1.vida);
            dano.setText("Daño: " + tirador1.ataque);
            h1.setText("Tiros extra: " + tirador1.tiroExtra);
            h2.setText("Critico" + tirador1.critico);
        }
        if(personajeClick == 2){
            vida.setText("Vida: " + ninja1.vida);
            dano.setText("Daño: " + ninja1.ataque);
            h1.setText("Daño extra: " + ninja1.dañoExtra);
            h2.setText("Daño por sangrado: " + ninja1.sangrado);
        }
        if(personajeClick == 3){
            vida.setText("Vida: " + explorador1.vida);
            dano.setText("Daño: " + explorador1.ataque);
            h1.setText("Casillas para avanzar: " + explorador1.casillasAvanzar);
            h2.setText("Regeneracion de vida: " + explorador1.regeneracionVida);
        }
        if(zaatacar == 1){
            zvida.setText("Vida: " + flash.vida);
            zdano.setText("Daño: "+ flash.dano);
        }  
        if(zaatacar == 2){
            zvida.setText("Vida: " + tank.vida);
            zdano.setText("Daño: "+ tank.dano);
        }
        if(zaatacar == 3){
            zvida.setText("Vida: " + superz.vida);
            zdano.setText("Daño: "+ superz.dano);
        }
    }
    private void set_casilla(JButton casilla,ImageIcon icono){
        if(casilla.getIcon()==icono){
              casilla.setIcon(def);
        }
    }
    private void set_casillasd(){
        if(btn28.getIcon()==def){
              btn28.setIcon(barr);
        }
        if(btn21.getIcon()==def){
              btn21.setIcon(door);
        }
        if(btn39.getIcon()==def){
              btn39.setIcon(door);
        }
    }
    private void bt4config(JButton boton,int bb,JButton btnc1,JButton btnc2,JButton btnc3,JButton btnc4){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(boton.getIcon()== zombiebase){zaatacar=1;}
        if(boton.getIcon()== tankzombie){zaatacar=2;}
        if(boton.getIcon()== megazombie){zaatacar=3;}
        else if(personajeClick == 1 && bb==1 && turno1 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter); 
            set_casilla(btnc4,shooter);  
            turno1 = 0;
        }
        else if(personajeClick == 3 && bb==1 && turno3 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            explo.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);     
            set_casilla(btnc3,explorador);  
            set_casilla(btnc4,explorador);
            turno3 = 0;
        }
        else if(personajeClick == 2 && bb==1 && turno2 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            nin.setVisible(false);
            boton.setIcon(ninja);
            set_casilla(btnc1,ninja);
            set_casilla(btnc2,ninja);     
            set_casilla(btnc3,ninja);  
            set_casilla(btnc4,ninja);
            turno2 = 0;
        }
        set_casillasd();
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
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(boton.getIcon()== zombiebase){zaatacar=1;}
        if(boton.getIcon()== tankzombie){zaatacar=2;}
        if(boton.getIcon()== megazombie){zaatacar=3;}
        else if(personajeClick == 1 && bb==1 && turno1 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            set_casilla(btnc3,shooter);
            turno1 = 0;
        }
        else if(personajeClick == 3 && bb==1 && turno3 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            explo.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);     
            set_casilla(btnc3,explorador);  
            turno3 = 0;
        }
        else if(personajeClick == 2 && bb==1 && turno2 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            nin.setVisible(false);
            boton.setIcon(ninja);
            set_casilla(btnc1,ninja);
            set_casilla(btnc2,ninja);     
            set_casilla(btnc3,ninja);  
            turno2 = 0;
        }
        set_casillasd();
    }
    private void bt2config(JButton boton,int bb,JButton btnc1,JButton btnc2){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(boton.getIcon()== zombiebase){zaatacar=1;}
        if(boton.getIcon()== tankzombie){zaatacar=2;}
        if(boton.getIcon()== megazombie){zaatacar=3;}
        else if(personajeClick == 1 && bb==1 && turno1 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            set_casilla(btnc2,shooter);
            turno1 = 0;
        }
        else if(personajeClick == 3 && bb==1 && turno3 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            explo.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);
            set_casilla(btnc2,explorador);      
            turno3 = 0;
        }
        else if(personajeClick == 2 && bb==1 && turno2 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            nin.setVisible(false);
            boton.setIcon(ninja);
            set_casilla(btnc1,ninja);
            set_casilla(btnc2,ninja);       
            turno2 = 0;
        }
        set_casillasd();
    }
    private void bt1config(JButton boton,int bb,JButton btnc1){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(boton.getIcon()== zombiebase){zaatacar=1;}
        if(boton.getIcon()== tankzombie){zaatacar=2;}
        if(boton.getIcon()== megazombie){zaatacar=3;}
        else if(personajeClick == 1 && bb==1 && turno1 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            sh.setVisible(false);
            boton.setIcon(shooter);
            set_casilla(btnc1,shooter);
            turno1 = 0;
        }
        else if(personajeClick == 3 && bb==1 && turno3 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            explo.setVisible(false);
            boton.setIcon(explorador);
            set_casilla(btnc1,explorador);     
            turno3 = 0;
        }
        else if(personajeClick == 2 && bb==1 && turno2 == 1 && boton.getIcon()!=ninja && boton.getIcon()!=explorador && boton.getIcon()!=shooter
                && boton.getIcon()!=zombiebase && boton.getIcon()!=tankzombie && boton.getIcon()!=megazombie){
            nin.setVisible(false);
            boton.setIcon(ninja);
            set_casilla(btnc1,ninja);
            turno2 = 0;
        }
        set_casillasd();
    }
    private void bt4Atackconfig(JButton boton,int bb1,int bb2,int bb3,int bb4,JButton btnc1,JButton btnc2,JButton btnc3,JButton btnc4){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(btnc1.getIcon() == zombiebase && bb1 == 1|| btnc2.getIcon() == zombiebase && bb2 == 1
                || btnc3.getIcon() == zombiebase && bb3 == 1 || btnc4.getIcon() == zombiebase && bb4 == 1){
            zaatacar = 1;
            atack.setVisible(true);
        }
        else if(btnc1.getIcon() == tankzombie && bb1 == 1 || btnc2.getIcon() == tankzombie && bb2 == 1
                || btnc3.getIcon() == tankzombie && bb3 == 1|| btnc4.getIcon() == tankzombie && bb4 == 1){
            zaatacar = 2;
            atack.setVisible(true);
        }
        else if(btnc1.getIcon() == megazombie && bb1 == 1|| btnc2.getIcon() == megazombie && bb2 == 1
                || btnc3.getIcon() == megazombie && bb3 == 1 || btnc4.getIcon() == megazombie && bb4 == 1){
            zaatacar = 3;
            atack.setVisible(true);
        }
        else{
            atack.setVisible(false);
        }
    }
    private void bt3Atackconfig(JButton boton,int bb1,int bb2, int bb3,JButton btnc1,JButton btnc2,JButton btnc3){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(btnc1.getIcon() == zombiebase && bb1 == 1 || btnc2.getIcon() == zombiebase && bb2 == 1|| btnc3.getIcon() == zombiebase && bb3 == 1){
            atack.setVisible(true);
        }
        else if(btnc1.getIcon() == tankzombie && bb1 == 1 || btnc2.getIcon() == tankzombie && bb2 == 1 || btnc3.getIcon() == tankzombie && bb3 == 1){
            atack.setVisible(true);
        }
         else if(btnc1.getIcon() == megazombie && bb1 == 1 || btnc2.getIcon() == megazombie && bb2 == 1|| btnc3.getIcon() == megazombie&& bb3 == 1){
            atack.setVisible(true);
        }
        else{
            atack.setVisible(false);
        }
    }
    private void bt2Atackconfig(JButton boton,int bb1, int bb2,JButton btnc1,JButton btnc2){
        if(boton.getIcon()==shooter){personajeClick = 1;}
        if(boton.getIcon()==ninja){personajeClick = 2;}
        if(boton.getIcon()==explorador){personajeClick = 3;}
        if(btnc1.getIcon() == zombiebase && bb1 == 1 || btnc2.getIcon() == zombiebase && bb2 ==1){
            zaatacar = 1;
            atack.setVisible(true);
        }
        else if(btnc1.getIcon() == tankzombie && bb1 == 1 || btnc2.getIcon() == tankzombie && bb2 ==1){
            zaatacar = 2;
            atack.setVisible(true);
        }
         else if(btnc1.getIcon() == megazombie && bb1 == 1 || btnc2.getIcon() == megazombie && bb2 ==1){
            zaatacar = 3;
            atack.setVisible(true);
        }
        else{
            atack.setVisible(false);
        }
    }
    private void equiparitem(JButton boton){
        if(boton.getIcon() == sword && personajeClick == 1){
            tirador1.ataque += espada.getAtaque();
            boton.setIcon(def);
        }
        else if(boton.getIcon() == sword && personajeClick == 2){
            ninja1.ataque += espada.getAtaque();
            boton.setIcon(def);
        }
        else if(boton.getIcon() == sword && personajeClick == 3){
            explorador1.ataque += espada.getAtaque();
            boton.setIcon(def);
        }
        else if(boton.getIcon() == gun && personajeClick == 1){
            tirador1.ataque += pistola.getAtaque();
            boton.setIcon(def);
        }
        else if(boton.getIcon() == gun && personajeClick == 2){
            ninja1.ataque += pistola.getAtaque();
            boton.setIcon(def);
        }
        else if(boton.getIcon() == gun && personajeClick == 3){
            explorador1.ataque += pistola.getAtaque();
            boton.setIcon(def);
        }
        setestats();
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
        spawn = new javax.swing.JButton();
        explo = new javax.swing.JLabel();
        atack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vida = new javax.swing.JLabel();
        dano = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        zvida = new javax.swing.JLabel();
        zdano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setIcon(def);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn4.setIcon(def);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn3.setIcon(def);
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
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn6.setIcon(def);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setIcon(def);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn12.setIcon(def);
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn12MouseClicked(evt);
            }
        });

        btn11.setIcon(def);
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
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn13MouseClicked(evt);
            }
        });

        btn14.setIcon(def);
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn14MouseClicked(evt);
            }
        });

        btn15.setIcon(def);
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
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn20MouseClicked(evt);
            }
        });

        btn19.setIcon(cruz);

        btn18.setIcon(def);
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn18MouseClicked(evt);
            }
        });

        btn21.setIcon(door);
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn21MouseClicked(evt);
            }
        });

        btn22.setIcon(def);
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn22MouseClicked(evt);
            }
        });

        btn23.setIcon(def);
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
        btn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn29MouseClicked(evt);
            }
        });

        btn30.setIcon(def);
        btn30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn30MouseClicked(evt);
            }
        });

        btn31.setIcon(cruz);

        btn25.setIcon(def);
        btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn25MouseClicked(evt);
            }
        });

        btn36.setIcon(cruz);

        btn35.setIcon(cruz);

        btn34.setIcon(def);
        btn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn34MouseClicked(evt);
            }
        });

        btn37.setIcon(def);
        btn37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn37MouseClicked(evt);
            }
        });

        btn38.setIcon(def);
        btn38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn38MouseClicked(evt);
            }
        });

        btn39.setIcon(door);
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
        btn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn32MouseClicked(evt);
            }
        });

        btn8.setIcon(def);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn40.setIcon(def);
        btn40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn40MouseClicked(evt);
            }
        });

        btn16.setIcon(def);
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
        btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn24MouseClicked(evt);
            }
        });

        sh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shMouseClicked(evt);
            }
        });

        nin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ninMouseClicked(evt);
            }
        });

        spawn.setIcon(def);
        spawn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spawnMouseClicked(evt);
            }
        });
        spawn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spawnActionPerformed(evt);
            }
        });

        explo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exploMouseClicked(evt);
            }
        });

        atack.setBackground(new java.awt.Color(255, 0, 0));
        atack.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        atack.setForeground(new java.awt.Color(204, 204, 0));
        atack.setText("ATACK!");
        atack.setToolTipText("");
        atack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atack.setContentAreaFilled(false);
        atack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atack.setName(""); // NOI18N
        atack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atackMouseClicked(evt);
            }
        });

        jLabel1.setText("PLAYER STATS:");

        jLabel2.setText("ZOMBIE STATS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atack, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(explo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nin, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spawn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(zvida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zdano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(nin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(explo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spawn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zvida, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(zdano, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                    .addComponent(dano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(atack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void shMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shMouseClicked
        todos_cero();
        personajeClick = 1;
        setestats();
        b1 = 1;
        b9 = 1;
        b17 = 1;
        b25 = 1;
        b33 = 1;
    }//GEN-LAST:event_shMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        equiparitem(btn1);
        bt2config(btn1,b1,btn2,btn9);
        setestats();
        todos_cero();
        b2 = 1;
        b9 = 1;
        if(personajeClick == 3){
            b3 =1;
            b17 =1;
        }
        bt2Atackconfig(btn1,b2,b9,btn2,btn9);
        moverzombie();
    }//GEN-LAST:event_btn1MouseClicked

    private void ninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninMouseClicked
        todos_cero();
        setestats();
        personajeClick = 2;
        b1 = 1;
        b9 = 1;
        b17 = 1;
        b25 = 1;
        b33 = 1;
        moverzombie();
    }//GEN-LAST:event_ninMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        equiparitem(btn2);
        bt3config(btn2,b2,btn1,btn3,btn10);
        setestats();
        todos_cero();
        b1 = 1;
        b3 = 1;
        b10 = 1;
        if(personajeClick == 3){
            b4 =1;
            b18 =1;
        }
        bt3Atackconfig(btn2,b1,b3,b10,btn1,btn3,btn10);
        moverzombie();
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        equiparitem(btn3);
        bt3config(btn3,b3,btn2,btn4,btn11);
        setestats();
        todos_cero();
        b2 = 1;
        b4 = 1;
        b11 = 1;
        if(personajeClick == 3){
            b5 =1;
        }
        bt3Atackconfig(btn3,b2,b4,b11,btn2,btn4,btn11);
        moverzombie();
    }//GEN-LAST:event_btn3MouseClicked

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        equiparitem(btn4);
        bt3config(btn4,b4,btn3,btn5,btn12);
        setestats();
        todos_cero();
        b3 = 1;
        b5 = 1;
        b12 = 1;
        if(personajeClick == 3){
            b3 =1;
            b17 =1;
        }
        bt3Atackconfig(btn4,b3,b5,b12,btn3,btn5,btn12);
        moverzombie();
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        equiparitem(btn5);
        bt3config(btn5,b5,btn4,btn13,btn6);
        setestats();
        todos_cero();
        b4 = 1;
        b13 = 1;
        b6 = 1;
        bt3Atackconfig(btn5,b4,b13,b6,btn4,btn13,btn6);
        moverzombie();
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        equiparitem(btn6);
        bt3config(btn6,b6,btn5,btn14,btn7);
        setestats();
        todos_cero();
        b5 = 1;
        b14 = 1;
        b7 = 1;
        bt3Atackconfig(btn6,b5,b14,b7,btn5,btn14,btn7);
        moverzombie();
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        equiparitem(btn7);
        bt3config(btn7,b7,btn8,btn6,btn15);
        setestats();
        todos_cero();
        b8 = 1;
        b6 = 1;
        b15 = 1;
        bt3Atackconfig(btn7,b8,b6,b15,btn8,btn6,btn15);
        moverzombie();
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
       equiparitem(btn8);
       bt2config(btn8,b8,btn7,btn16);
       setestats();
       todos_cero();
       b7 = 1;
       b16 = 1;
       bt2Atackconfig(btn8,b8,b16,btn7,btn16);
       moverzombie();
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        equiparitem(btn9);
        bt3config(btn9,b9,btn1,btn10,btn17);
        setestats();
        todos_cero();
        b1 = 1;
        b10 = 1;
        b17 = 1;
        bt3Atackconfig(btn9,b1,b10,b17,btn1,btn10,btn17);
        moverzombie();
    }//GEN-LAST:event_btn9MouseClicked

    private void btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseClicked
        equiparitem(btn10);
        bt4config(btn10,b10,btn11,btn9,btn18,btn2);
        setestats();
        todos_cero();
        b9 = 1;
        b2 = 1;
        b18 = 1;
        b11 = 1;
        bt4Atackconfig(btn10,b11,b9,b18,b2,btn11,btn9,btn18,btn2);
        moverzombie();
    }//GEN-LAST:event_btn10MouseClicked

    private void btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseClicked
        equiparitem(btn11);
        bt3config(btn11,b11,btn10,btn12,btn3);
        setestats();
        todos_cero();
        b10 = 1;
        b12 = 1;
        b3 = 1;
        bt3Atackconfig(btn11,b10,b12,b3,btn10,btn12,btn3);
        moverzombie();
    }//GEN-LAST:event_btn11MouseClicked

    private void btn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseClicked
        equiparitem(btn12);
        bt4config(btn12,b12,btn11,btn4,btn20,btn13);
        setestats();
        todos_cero();
        b4 = 1;
        b11 = 1;
        b20 = 1;
        b13 = 1;
        bt4Atackconfig(btn12,b11,b4,b20,b13,btn11,btn4,btn20,btn13);
        moverzombie();
    }//GEN-LAST:event_btn12MouseClicked

    private void btn13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseClicked
        equiparitem(btn13);
        bt4config(btn13,b13,btn12,btn5,btn14,btn21);
        setestats();
        todos_cero();
        b12 = 1;
        b5 = 1;
        b14 = 1;
        b21 = 1;
        bt4Atackconfig(btn13,b12,b5,b14,b21,btn12,btn5,btn14,btn21);
        moverzombie();
    }//GEN-LAST:event_btn13MouseClicked

    private void btn14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseClicked
        equiparitem(btn14);
        bt4config(btn14,b14,btn15,btn22,btn13,btn6);
        setestats(); 
        todos_cero();
        b15 = 1;
        b22 = 1;
        b13 = 1;
        b6 = 1;
        bt4Atackconfig(btn14,b15,b22,b13,b6,btn15,btn22,btn13,btn6);
        moverzombie();
    }//GEN-LAST:event_btn14MouseClicked

    private void btn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseClicked
        equiparitem(btn15);
        bt4config(btn15,b15,btn14,btn7,btn16,btn23);
        setestats();
        todos_cero();
        b14 = 1;
        b7 = 1;
        b16 = 1;
        b23 = 1;
        bt4Atackconfig(btn15,b14,b7,b16,b23,btn14,btn7,btn16,btn23);
        moverzombie();
    }//GEN-LAST:event_btn15MouseClicked

    private void btn16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseClicked
        equiparitem(btn16);
        bt3config(btn16,b16,btn15,btn8,btn24);
        setestats();
        todos_cero();
        b15 = 1;
        b8 = 1;
        b24 = 1;
        bt3Atackconfig(btn16,b15,b8,b24,btn15,btn8,btn24);
        moverzombie();
    }//GEN-LAST:event_btn16MouseClicked

    private void btn17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseClicked
        equiparitem(btn17);
        bt3config(btn17,b17,btn9,btn25,btn18);
        setestats();
        todos_cero();
        b25 = 1;
        b9 = 1;
        b18 = 1;
        bt3Atackconfig(btn17,b9,b25,b18,btn9,btn25,btn18);
        moverzombie();
    }//GEN-LAST:event_btn17MouseClicked

    private void btn18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseClicked
        equiparitem(btn18);
        bt3config(btn18,b18,btn17,btn10,btn26);
        setestats();
        todos_cero();
        b17 = 1;
        b10 = 1;
        b26 = 1;
        bt3Atackconfig(btn18,b17,b10,b26,btn17,btn10,btn26);
        moverzombie();
    }//GEN-LAST:event_btn18MouseClicked

    private void btn20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseClicked
        equiparitem(btn20);
        bt3config(btn20,b20,btn12,btn21,btn28);
        setestats();
        todos_cero();
        b12 = 1;
        b21= 1;
        b28 = 1;
        bt3Atackconfig(btn20,b12,b21,b28,btn12,btn21,btn28);
        moverzombie();
    }//GEN-LAST:event_btn20MouseClicked

    private void btn21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn21MouseClicked
        equiparitem(btn21);
        bt3config(btn21,b21,btn13,btn20,btn29);
        setestats();
        todos_cero();
        b13 = 1;
        b20 = 1;
        b29 = 1;
        bt3Atackconfig(btn21,b13,b20,b29,btn13,btn20,btn29);
        moverzombie();
    }//GEN-LAST:event_btn21MouseClicked

    private void btn22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn22MouseClicked
        equiparitem(btn22);
        bt3config(btn22,b22,btn23,btn14,btn30);
        setestats();
        todos_cero();
        b23 = 1;
        b14 = 1;
        b30 = 1;
        bt3Atackconfig(btn22,b23,b14,b30,btn23,btn14,btn30);
        moverzombie();
    }//GEN-LAST:event_btn22MouseClicked

    private void btn23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn23MouseClicked
        equiparitem(btn23);
        bt3config(btn23,b23,btn22,btn15,btn24);
        setestats();
        todos_cero();
        b22 = 1;
        b15 = 1;
        b24 = 1;
        bt3Atackconfig(btn23,b22,b15,b24,btn22,btn15,btn24);
        moverzombie();
    }//GEN-LAST:event_btn23MouseClicked

    private void btn24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn24MouseClicked
        equiparitem(btn24);
        bt3config(btn24,b24,btn23,btn16,btn32);
        setestats();
        todos_cero();
        b23 = 1;
        b16 = 1;
        b32 = 1;
        bt3Atackconfig(btn24,b23,b16,b32,btn23,btn16,btn32);
        moverzombie();
    }//GEN-LAST:event_btn24MouseClicked

    private void btn25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn25MouseClicked
        equiparitem(btn25);
        bt3config(btn25,b25,btn26,btn17,btn33);
        setestats();
        todos_cero();
        b26 = 1;
        b17 = 1;
        b33 = 1;
        bt3Atackconfig(btn25,b26,b17,b33,btn26,btn17,btn33);
        moverzombie();
    }//GEN-LAST:event_btn25MouseClicked

    private void btn26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn26MouseClicked
        equiparitem(btn26);
        bt4config(btn26,b26,btn25,btn27,btn18,btn34);
        setestats();
        todos_cero();
        b25 = 1;
        b27 = 1;
        b18 = 1;
        b34 = 1;
        bt4Atackconfig(btn26,b25,b27,b18,b34,btn25,btn27,btn18,btn34);
        moverzombie();
    }//GEN-LAST:event_btn26MouseClicked

    private void btn27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn27MouseClicked
        equiparitem(btn27);
        bt2config(btn27,b27,btn26,btn28);
        setestats();
        todos_cero();
        b26 = 1;
        b28 = 1;
        bt2Atackconfig(btn27,b26,b28,btn26,btn28);
        moverzombie();
    }//GEN-LAST:event_btn27MouseClicked

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn28MouseClicked
        equiparitem(btn28);
        bt3config(btn28,b28,btn27,btn20,btn29);
        setestats();
        todos_cero();
        b27 = 1;
        b20 = 1;
        bt3Atackconfig(btn28,b27,b20,b29,btn27,btn20,btn29);
        moverzombie();
    }//GEN-LAST:event_btn28MouseClicked

    private void btn29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn29MouseClicked
        equiparitem(btn29);
        bt4config(btn29,b29,btn28,btn30,btn37,btn21);
        setestats();
        todos_cero();
        b28 = 1;
        b30 = 1;
        b37 = 1;
        b21 = 1;
        bt4Atackconfig(btn29,b28,b30,b37,b21,btn28,btn30,btn37,btn21);
        moverzombie();
    }//GEN-LAST:event_btn29MouseClicked

    private void btn30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn30MouseClicked
        equiparitem(btn30);
        bt3config(btn30,b30,btn29,btn22,btn38);
        setestats();
        todos_cero();
        b29 = 1;
        b22 = 1;
        b38 = 1;
        bt3Atackconfig(btn30,b29,b22,b38,btn29,btn22,btn38);
        moverzombie();
    }//GEN-LAST:event_btn30MouseClicked

    private void btn32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn32MouseClicked
        equiparitem(btn32);
        bt2config(btn32,b32,btn24,btn40);
        setestats();
        todos_cero();
        b24 = 1;
        b40 = 1;
        bt2Atackconfig(btn32,b24,b40,btn24,btn40);
        moverzombie();
    }//GEN-LAST:event_btn32MouseClicked

    private void btn33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn33MouseClicked
        equiparitem(btn33);
        bt2config(btn33,b33,btn25,btn34);
        setestats();
        todos_cero();
        b25 = 1;
        b34 = 1;
        bt2Atackconfig(btn33,b25,b34,btn25,btn34);
        moverzombie();
    }//GEN-LAST:event_btn33MouseClicked

    private void btn34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn34MouseClicked
        equiparitem(btn34);
        bt2config(btn34,b34,btn26,btn33);
        setestats();
        todos_cero();
        b26 = 1;
        b33 = 1;
        bt2Atackconfig(btn34,b26,b33,btn26,btn33);
        moverzombie();
    }//GEN-LAST:event_btn34MouseClicked

    private void btn37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn37MouseClicked
        equiparitem(btn37);
        bt2config(btn37,b37,btn29,btn38);
        setestats();
        todos_cero();
        b29 = 1;
        b38 = 1;
        bt2Atackconfig(btn37,b29,b38,btn29,btn38);
        moverzombie();
    }//GEN-LAST:event_btn37MouseClicked

    private void btn38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn38MouseClicked
        equiparitem(btn38);
        bt3config(btn38,b38,btn37,btn39,btn30);
        setestats();
        todos_cero();
        b37 = 1;
        b39 = 1;
        b30 = 1;
        bt3Atackconfig(btn38,b37,b39,b30,btn37,btn39,btn30);
        moverzombie();
    }//GEN-LAST:event_btn38MouseClicked

    private void btn39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn39MouseClicked
        equiparitem(btn39);
        bt1config(btn39,b39,btn38);
        setestats();
        todos_cero();
        b38 = 1;
        moverzombie();
    }//GEN-LAST:event_btn39MouseClicked

    private void btn40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn40MouseClicked
        equiparitem(btn40);
        bt1config(btn40,b40,btn32);
        setestats();
        todos_cero();
        b32 = 1;
        moverzombie();
    }//GEN-LAST:event_btn40MouseClicked

    private void spawnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spawnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spawnMouseClicked

    private void spawnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spawnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spawnActionPerformed

    private void exploMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploMouseClicked
        todos_cero();
        personajeClick = 3;
        setestats();
        b1 = 1;
        b9 = 1;
        b17 = 1;
        b25 = 1;
        b33 = 1;
    }//GEN-LAST:event_exploMouseClicked

    private void atackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atackMouseClicked
        if(personajeClick == 1 && zaatacar == 1 && turno1 == 1){
            flash.vida = flash.vida - (tirador1.ataque + tirador1.critico);
            if(tirador1.tiroExtra==1){
                flash.vida = flash.vida - (tirador1.ataque + tirador1.critico);
            }
            flash.vida = flash.vida + flash.regeneracion;
            atack.setVisible(false);
            if(flash.vida <= 0){
                flash.vida = 50;
                znum = znum - 1;
                casillasZ(zombiebase);
                botnfrentez.setIcon(gun);
                botnfrentez = btn8;
            }
            turno1 = 0;
        }
        else if(personajeClick == 1 && zaatacar == 2 && turno1 == 1){
            tank.vida = tank.vida - (tirador1.ataque + tirador1.critico - tank.armadura);
            if(tirador1.tiroExtra==1){
                tank.vida = tank.vida - (tirador1.ataque + tirador1.critico - tank.armadura);
            }
            atack.setVisible(false);
            if(tank.vida <= 0){
                tank.vida = 50;
                znum = znum - 1;
                casillasZ(tankzombie);
                botnfrentez.setIcon(sword);
                botnfrentez = btn24;
            }
            turno1 = 0;
        }
        else if(personajeClick == 1 && zaatacar == 3 && turno1 == 1){
            superz.vida = superz.vida - (tirador1.ataque + tirador1.critico);
            if(tirador1.tiroExtra==1){
                superz.vida = superz.vida - (tirador1.ataque + tirador1.critico);
            }
            atack.setVisible(false);
            if(superz.vida <= 0){
                superz.vida = 60 + superz.vidaExtra;
                znum = znum - 1;
                casillasZ(megazombie);
                botnfrentez.setIcon(def);
                botnfrentez = btn40;
            }
            turno1 = 0;
        }
        else if(personajeClick == 2 && zaatacar == 1 && turno2 == 1){
            flash.vida = flash.vida - (ninja1.ataque + ninja1.dañoExtra + ninja1.sangrado);
            flash.vida = flash.vida + flash.regeneracion;
            atack.setVisible(false);
            if(flash.vida <= 0){
            flash.vida = 50;
            znum = znum - 1;
            casillasZ(zombiebase);
            botnfrentez.setIcon(gun);
            botnfrentez = btn8;
            }
            turno2 = 0;
        }
        else if(personajeClick == 2 && zaatacar == 2 && turno2 == 1){
            tank.vida = tank.vida - ((ninja1.ataque + ninja1.dañoExtra + ninja1.sangrado) - tank.armadura);
            atack.setVisible(false);
            if(tank.vida <= 0){
                tank.vida = 50;
                znum = znum - 1;
                casillasZ(tankzombie);
                botnfrentez.setIcon(sword);
                botnfrentez = btn24;
            }
            turno2 = 0;
        }
        else if(personajeClick == 2 && zaatacar == 3 && turno2 == 1){
            superz.vida = superz.vida - (ninja1.ataque + ninja1.dañoExtra + ninja1.sangrado);
            atack.setVisible(false);
            if(superz.vida <= 0){
                superz.vida = 60 + superz.vidaExtra;
                znum = znum - 1;
                casillasZ(megazombie);
                botnfrentez.setIcon(def);
                botnfrentez = btn40;
            }
            turno2 = 0;
        }
        else if(personajeClick == 3 && zaatacar == 1 && turno3 == 1){
            flash.vida = flash.vida - explorador1.ataque;
            flash.vida = flash.vida + flash.regeneracion;
            atack.setVisible(false);
            if(flash.vida <= 0){
                flash.vida = 50;
                znum = znum - 1;
                casillasZ(zombiebase);
                botnfrentez.setIcon(gun);
                botnfrentez = btn8;
            }
            turno3 = 0;
        }
        else if(personajeClick == 3 && zaatacar == 2 && turno3 == 1){
            tank.vida = tank.vida - (explorador1.ataque - tank.armadura);
            atack.setVisible(false);
            if(tank.vida <= 0){
                tank.vida = 50;
                znum = znum - 1;
                casillasZ(tankzombie);
                botnfrentez.setIcon(sword);
                botnfrentez = btn24;
            }
            turno3 = 0;
        }
        else if(personajeClick == 3 && zaatacar == 3 && turno3 == 1){
            superz.vida = superz.vida - explorador1.ataque;
            atack.setVisible(false);
            if(superz.vida <= 0){
                superz.vida = 60 + superz.vidaExtra;
                znum = znum - 1;
                casillasZ(megazombie);
                botnfrentez.setIcon(def);
                botnfrentez = btn40;
            }
            turno3 = 0;
        }
        setestats();
    }//GEN-LAST:event_atackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atack;
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
    private javax.swing.JLabel dano;
    private javax.swing.JLabel explo;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nin;
    private javax.swing.JLabel sh;
    private javax.swing.JButton spawn;
    private javax.swing.JLabel vida;
    private javax.swing.JLabel zdano;
    private javax.swing.JLabel zvida;
    // End of variables declaration//GEN-END:variables
}
