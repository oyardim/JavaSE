package logic;

import model.IO;
import model.Temperatur;

public class TemperaturLogic {

    Temperatur t1 = new Temperatur();

    public TemperaturLogic() {

    }

    public void cToF() {
        System.out.println("Wert in °C eingeben:");
        t1.setInput(IO.getsScan().nextDouble());
        t1.setOutput((t1.getInput() * 1.8 ) + 32);
        System.out.println("Wert in °F : " + t1.getOutput() + "\n");
    }

    public void fToC() {
        System.out.println("Wert in °F eingeben:");
        t1.setInput(IO.getsScan().nextDouble());
        t1.setOutput((t1.getInput() - 32) * 5/9);
        System.out.println("Wert in °C : " + t1.getOutput() + "\n");
    }
}
