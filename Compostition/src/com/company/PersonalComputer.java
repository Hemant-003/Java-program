package com.company;

public class PersonalComputer {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard motherboard;
    private String keyboard;
    private String mouse;

    public PersonalComputer(Case theCase, Monitor theMonitor, Motherboard motherboard,String keyboard,String mouse){
        this.theCase=theCase;
        this.theMonitor=theMonitor;
        this.motherboard=motherboard;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }

    public void TheCase() {
        theCase.getPowersupply();
        drawLogo();
    }
    private void drawLogo(){
        theMonitor.DrawPixelAt(200,45,"Yellow");
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public String getMouse() {
        return mouse;
    }
}
