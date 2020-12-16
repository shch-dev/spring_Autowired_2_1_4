package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Needle7 {

    @Autowired
    @Qualifier("deth")
    public void setdeth8(Deth8 deth8) {
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }
}
