/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.view.menu;;

import org.example.model.FillBihavior;
import org.example.controller.state.State;
import org.example.model.FillBihavior;

/**
 *
 * @author Netbeans
 */
public class SwitchFill implements Command{

    State state;
    FillBihavior fb;

    public SwitchFill(FillBihavior fb,State state) {
        this.state = state;
        this.fb = fb;
    }

    @Override
    public void execute() {
        state.setFb(fb);
    }
}
