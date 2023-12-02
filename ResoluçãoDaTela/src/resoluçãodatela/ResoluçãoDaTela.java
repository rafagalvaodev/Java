package resoluçãodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A Resolução da Tela é:" + d.width + " X " + d.height);
    }
    
}
