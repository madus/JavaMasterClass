package com.challenge;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){

       theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo(){


        //Fancy graphics

        monitor.drawPixelArt(1200,50,"green");

    }

/*    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
