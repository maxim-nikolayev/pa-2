import core.Dtm;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Dtm dtm = new Dtm(50);
        //dtm.runString("1100");
        //dtm.runAddition("$101100101+101=");
        //dtm.runAddition("$101100101+101101101=");
        //dtm.runSubtraction("$101100101-101=");
        dtm.runSubtraction("$101100101-101101=");
    }
}
