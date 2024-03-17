package Controls;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;


public class JPasswordBox extends JTextField
{

    public JPasswordBox(int size) {
        super(size);
        setOpaque(false); // make it unvisible (shaffaf)
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 20, 20);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.drawRoundRect(0, 0, getWidth()-2, getHeight()-2, 20, 20);
    }
    
}
