package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

// gerenciador de janelas JInternalFrame

public class WindowManager {
    private static JDesktopPane jDesktopPane;
    
    public WindowManager(JDesktopPane jDesktopPane) {
            WindowManager.jDesktopPane = jDesktopPane;
    }
    
    public void openWindow(JInternalFrame jInternalFrame) {
        if(jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        } else {
            jDesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
    
    
}
