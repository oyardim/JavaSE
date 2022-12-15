package logic;

import model.DatenMenge;
import model.IO;

public class DatenMengeLogic {

    DatenMenge dm = new DatenMenge();

    public DatenMengeLogic() {

    }

    public void kByteToByte() {
        System.out.println("Wert in kByte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() * 1000);
        System.out.println("Wert in Byte: " + dm.getOutput() + "\n");
    }

    public void kByteToMByte() {
        System.out.println("Wert in kByte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() / 1000);
        System.out.println("Wert in MByte : " + dm.getOutput() + "\n");
    }

    public void byteToKByte() {
        System.out.println("Wert in Byte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() / 1000);
        System.out.println("Wert in kByte : " + dm.getOutput() + "\n");
    }

    public void byteToMByte() {
        System.out.println("Wert in Byte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() / 100000);
        System.out.println("Wert in MByte : " + dm.getOutput() + "\n");
    }

    public void mByteToKByte() {
        System.out.println("Wert in MByte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() * 1000);
        System.out.println("Wert in kByte : " + dm.getOutput() + "\n");

    }

    public void mByteToByte() {
        System.out.println("Wert in MByte eingeben:");
        dm.setInput(IO.getsScan().nextDouble());
        dm.setOutput(dm.getInput() * 100000);
        System.out.println("Wert in Byte : " + dm.getOutput() + "\n");
    }
}
