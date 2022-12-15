
package logic;

import model.IO;
import model.Waerung;

public class WaerungLogic {
    Waerung w1 = new Waerung();

    public WaerungLogic() {

    }

    public void euroToUsd() {
        System.out.println("Wert in €uro eingeben:");
        w1.setInput(IO.getsScan().nextDouble());
        w1.setOutput(w1.getInput() * 0.9897);
        System.out.println("Wert in U$D: " + w1.getOutput() + "\n");
    }

    public void usdToEuro() {
        System.out.println("Wert in U$D eingeben:");
        w1.setInput(IO.getsScan().nextDouble());
        w1.setOutput(w1.getInput() * 1.0105);
        System.out.println("Wert in €uro : " + w1.getOutput() + "\n");
    }
}

