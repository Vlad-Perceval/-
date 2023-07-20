import javax.swing.*;
import java.awt.*;

public class Draw extends JComponent {


    @Override
    protected  void  paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.BLUE);
        Draw(graphics);
    }
    void Draw(Graphics graphics)
    {
        int Width = getWidth(); //ширина игрового поля
        int Height = getHeight(); //высота игрового поля
        int dw = Width / 3;// ширина ячейки
        int dh = Height / 3; // высота ячейки
        graphics.setColor(Color.BLUE); // цвет сетки бирюзовый
        for(int i = 1; i < 3; i++)
        {
            graphics.drawLine(0, dh * i, Width, dh* i);
            graphics.drawLine(dw * i, 0, dw * i, Height);
        }

    }
}
