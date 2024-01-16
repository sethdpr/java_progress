package Bankrekening_package;

import java.util.Scanner;

public class Bankrekening {
    double standaardSaldo;
    double saldo;
    double afhalen;
    double storten;
    public Bankrekening (double standaardSaldo, double saldo){
        this.saldo = saldo;
        if (this.saldo < 0){
            this.saldo = standaardSaldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAfhalen() {
        return afhalen;
    }

    public void setAfhalen(double afhalen) {
        this.afhalen = afhalen;
    }

    public double getStorten() {
        return storten;
    }

    public void setStorten(double storten) {
        this.storten = storten;
    }
    public void afhalen(){
        Scanner scanAfhalen = new Scanner(System.in);
        double afhaalBedrag = scanAfhalen.nextDouble();
        this.saldo -= afhaalBedrag;
        if (this.saldo < -1000){
            this.saldo += afhaalBedrag;
        }

    }
    public void storten(){
        Scanner scanStorten = new Scanner(System.in);
        double stortBedrag = scanStorten.nextDouble();
        this.saldo += stortBedrag;
    }
    @Override
    public String toString(){
        return "--------------------" + "\r\n" + "Saldo: " + saldo + "\r\n" + "s: storten" + "\r\n" + "a: afhalen" + "\r\n" + "q: stoppen" + "\r\n" + "--------------------";
    }
}
