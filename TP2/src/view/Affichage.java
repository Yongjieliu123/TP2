package view;

import model.Etat;
import model.Parcours;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Affichage extends JPanel {
    public static final int LARG = 600;//c'est le longeur de l'ecran du jeu
    public static final int HAUT = 400;//c'est le hauteur de l'ecran du jeu
    public static final int widht = 40;//c'est le longeur de l'oval
    public static final int height = 40;//c'est le hauteur de l'oval
    public static final int OvalX=100;
    //c'est un ecart pour deplacer l'oval de chaque clic.
    Etat etat;//creer un objet etat
    Parcours parcours;
    /** construiteur pour obtenir meme model.Etat */
    public Affichage(Etat etat,Parcours parcours) {
        setPreferredSize(new Dimension(LARG, HAUT));
      this.etat=etat;
      this.parcours=parcours;
    }
    /** affichage */
    public void paint(Graphics g){
            super.paint(g);
            g.drawOval(OvalX,etat.getHauteur(),widht,height);
        ArrayList<Point> L =this.parcours.getParcours();
        for(int i=0;i<L.size()-1;i++){
            g.drawLine(L.get(i).x,L.get(i).y,L.get(i+1).x,L.get(i+1).y);
            g.drawString("Score"+parcours.getter(),20,20);
        }


    }
}
