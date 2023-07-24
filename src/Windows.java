import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Windows {
    public static void Wind() {



        JFrame windows = new JFrame("Крестики нолики");//главное окно
        JPanel buttonsPanel = new JPanel();// Создаём панель для кнопок табличного стиля
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // кнопка закрывающая окно
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();// ОПРЕДЕЛЕНИЕ РАЗРЕШЕНИЯ  экрана
        windows.setSize(sSize);//размер окна
        windows.setLayout(new BorderLayout());// менеджер компоновки
        windows.setLocationRelativeTo(null); //окно по центру
        windows.setVisible(true); //видимость окна
        windows.setExtendedState(Frame.MAXIMIZED_BOTH); // ОТКРЫТИЕ НА ПОЛНЫЙ ЭКРАН
            // JButton start = new JButton("Старт");
        //JButton stop = new JButton("Выход");
        // добавляем кнопки на панель
       // buttonsPanel.add(start);
        // buttonsPanel.add(stop);
        // размещаем панель на Frame (верхняя часть)

        // Draw game = new Draw();
        //windows.add(game);


    }




}

/*public class estActionsListener implements ActionListener{
    public void actionPerformed(ActionEvent e){

    }
}*/
