package test;

import Printer.EnglishPrinter;
import Printer.OutputPrinter;
import Printer.PortuguesePrinter;
import org.junit.Test;

public class TestePrinters {
    @Test
    public void testOutputPrinter() {
        final OutputPrinter outputPrinter = new OutputPrinter();
        outputPrinter.print(5d);
    }

    @Test
    public void testPtPrint() {
        final PortuguesePrinter portuguesePrinter = new PortuguesePrinter();
        portuguesePrinter.print(1d);
    }

    @Test
    public void testEnPrint() {
        final EnglishPrinter englishPrinter = new EnglishPrinter();
        englishPrinter
                .print(2d);
    }
}
