/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author saleh
 */
public class SalehsDarkMagic extends DnDWeapon{
     public SalehsDarkMagic() {
         //weapon's name and type
        super("Dark Magic",ItemTypes.FISTS, 3);
    }

    @Override
    //how many dice rolls and damage bounus
    public int rollDamage() {
        return Roll.d10() + damageBonus;
    }
    
}
