
package win;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class Windows {
    public static void Wind() {


        JFrame windows = new JFrame("Крестики нолики");//главное окно
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // кнопка закрывающая окно
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();// ОПРЕДЕЛЕНИЕ РАЗРЕШЕНИЯ  экрана
        windows.setSize(sSize);//размер окна
        JButton start = new JButton("Старт"); // кнопка start
        windows.add(start);
        JButton score = new JButton("Счёт");// кнопка score
        windows.add(score);
        JButton exit = new JButton("Выход");// кнопка exit
        windows.add(exit);
        windows.setLayout(new BorderLayout());// менеджер компоновки

        windows.setLocationRelativeTo(null); //окно по центру
        windows.setVisible(true); //видимость окна
        windows.setExtendedState(Frame.MAXIMIZED_BOTH); // ОТКРЫТИЕ НА ПОЛНЫЙ ЭКРАН
        windows.addComponentListener( new ComponentListener() { //обработчик событий главного окна
            public void componentResized( ComponentEvent e ) { //обработчик событий главного окна изменения размеров окна
                buttons(windows,start,score,exit); // функция изменения размеров кнопок
            }
            public void componentMoved( ComponentEvent e ) {//обработчик событий главного окна изменения положения окна
            }
            public void componentShown( ComponentEvent e ) {}
            public void componentHidden( ComponentEvent e ) {}
        } );
    }

    public static void buttons(JFrame windows, JButton start, JButton score,JButton exit) {
        int Width = windows.getWidth(); //ширина игрового поля
        int Height = windows.getHeight(); //высота игрового поля
        start.setBounds(Width - 420, Height - 380, 384, 108);//x axis, y axis,
        score.setBounds(Width - 420, Height - 270, 384, 108);//x axis, y axis,
        exit.setBounds(Width - 420, Height - 160, 384, 108);//x axis, y axis,
    if (windows.getHeight() < 108)
    {
        start.setBounds(Width - 420 , 200, 384, Height);//x axis, y axis,
        score.setBounds(Width - 420 , 100, 384, Height);//x axis, y axis,
        exit.setBounds(Width - 420 , 0, 384, Height);//x axis, y axis,
    }
        if (windows.getWidth() < 384)
        {
            start.setBounds(0 , Height - 380, Width , 108);//x axis, y axis,
            score.setBounds(0 , Height - 270, Width , 108);//x axis, y axis,
            exit.setBounds(0 , Height - 160, Width , 108);//x axis, y axis,
        }
    }
}


class start implements ActionListener { //обработчик событий на кнопку start
    public void actionPerformed(ActionEvent e) {

    }
}
class score implements ActionListener {//обработчик событий на кнопку score
    public void actionPerformed(ActionEvent e) {
    }
}
class exit implements ActionListener { //обработчик событий на кнопку exit
    public void actionPerformed(ActionEvent e) {
    }
}
