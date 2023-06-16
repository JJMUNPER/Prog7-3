package Org.LosRemedios.Programacion.T7.Actividades.Act3;

import java.io.Serializable;

public class SelializableTest implements Serializable {

    private static final long serialVersionUID = -2222224444555213456L;

    String persona1;
    String persona2;
    String persona3;

    public SelializableTest (String persona1, String persona2, String persona3) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
    }

    public SelializableTest () {
        this.persona1 = "Alonso";
        this.persona2 = "Rossi";
        this.persona3 = "Sabina";
    }
}
