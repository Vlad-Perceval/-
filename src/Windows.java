import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


public class Windows {
    public static void Wind() {

        JFrame windows = new JFrame("Крестики нолики");//главное окно
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // кнопка закрывающая окно
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();// ОПРЕДЕЛЕНИЕ РАЗРЕШЕНИЯ  экрана
        windows.setSize(sSize);//размер окна
        JButton start = new JButton("Старт");
        windows.add(start);
        JButton score = new JButton("Счёт");
        windows.add(score);
        JButton exit = new JButton("Выход");
        windows.add(exit);
        windows.setLayout(new BorderLayout());// менеджер компоновки

        windows.setLocationRelativeTo(null); //окно по центру
        windows.setVisible(true); //видимость окна
        windows.setExtendedState(Frame.MAXIMIZED_BOTH); // ОТКРЫТИЕ НА ПОЛНЫЙ ЭКРАН
        windows.addComponentListener( new ComponentListener() {
            public void componentResized( ComponentEvent e ) {


                buttons(windows,start,score,exit);


            }
            public void componentMoved( ComponentEvent e ) {

            }
            public void componentShown( ComponentEvent e ) {}
            public void componentHidden( ComponentEvent e ) {}
        } );

        // добавляем кнопки на панель
       // buttonsPanel.add(start);
        // buttonsPanel.add(stop);
        // размещаем панель на Frame (верхняя часть)

        // Draw game = new Draw();
        //windows.add(game);


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

/*public class estActionsListener implements ActionListener{
    public void actionPerformed(ActionEvent e){

    }
}*/
