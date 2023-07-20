import javax.swing.*;
import java.awt.*;

public class Windows {
    public static void Wind() {



        JFrame windows = new JFrame("Крестики нолики");//главное окно
        JPanel buttonsPanel = new JPanel();// Создаём панель для кнопок табличного стиля
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // кнопка закрывающая окно
        windows.setSize(1920, 1080);//размер окна
        windows.setLayout(new BorderLayout());// менеджер компоновки
        windows.setLocationRelativeTo(null); //окно по центру
        windows.setVisible(true); //видимость окна
        JButton start = new JButton("Старт");
        JButton stop = new JButton("Выход");
        // добавляем кнопки на панель
        buttonsPanel.add(start);
        buttonsPanel.add(stop);
        // размещаем панель на Frame (верхняя часть)
        windows.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        windows.setVisible(true);

    }
    protected void Draw(Graphics graphics)
    {
        // int w = getWidth(); //ширина игрового поля

    }


}
