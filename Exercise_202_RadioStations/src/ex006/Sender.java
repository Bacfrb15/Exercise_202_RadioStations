/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex006;

/**
 *
 * @author franz
 */
public class Sender {
    private String sender;
    private double frequenz;
    private boolean band;

    public Sender(String sender, double frequenz, boolean band) {
        this.sender = sender;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }

    public boolean isBand() {
        return band;
    }

    public void setBand(boolean band) {
        this.band = band;
    }
}
