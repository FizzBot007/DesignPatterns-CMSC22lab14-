/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Jun
 */
public class CharacterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Character k = new King();
        
        k.setWeaponBehavior(new KnifeBehavior());
        k.fight();
        
        Character q = new Queen();
        
        q.setWeaponBehavior(new BowAndArrowBehavior());
        q.fight();
        
        Character kn = new Knight();
        
        kn.setWeaponBehavior(new SwordBehavior());
        kn.fight();
        
        Character t = new Troll();
        
        t.setWeaponBehavior(new AxeBehavior());
        t.fight();
        
        Character q2 = new Queen();
        
        q2.setWeaponBehavior(new AxeBehavior());
        q2.fight();
    }
    
}
