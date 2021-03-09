package GB.Java.st;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
}
