package OOP.other;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.03.2014
 * Time: 18:59
 * To change this template use File|Setting|File Templates.
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;
import java.util.Date;

/**
 * Этот класс создает и отображает окно, содержащее список
 * файлов и подкаталогов заданного каталога. Щелчок на элементе списка
 * вызывает отображение дополнительной информации о нем.
 * Двойной щелчок вызывает отображение содержимого файла или каталога.
 * Если задан фильтр имен, FilenameFilter фильтрует отображаемый список.
 **/

public class FileLister extends Frame implements ActionListener, ItemListener {
    private List list;          // Для отображения в нем содержимого каталога
    private TextField details;   // Для отображения в нем подробной информации
    //Рис. 3.2. Окно FileLister
    //80 Глава 3. Ввод/вывод
    private Panel buttons;              // В панели находятся кнопки
    private Button up, close;           // Кнопки Up и Close
    private File currentDir;            // Текущий отображаемый каталог
    private FilenameFilter filter;      // Необязательный фильтр для каталога
    private String[] files;             // Содержимое каталога
    private DateFormat dateFormatter =  // Для правильного отображения даты
            // и времени дня
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

    /**
     * Конструктор: создает GUI и отображает начальный каталог.
     **/
    public FileLister(String directory, FilenameFilter filter) {
        super("File Lister");           // Создается окно
        this.filter = filter;           // Сохраняется фильтр, если он задан

        // По требованию пользователя уничтожается окно
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
        list = new List(12, false);        // Создается список
        list.setFont(new Font("MonoSpaced", Font.PLAIN, 14));
        list.addActionListener(this);
        list.addItemListener(this);

        details = new TextField();         // Создается область отображения
        // подробной информации о файле
        details.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
        details.setEditable(false);
        buttons = new Panel();             // Установка панели кнопок
        buttons.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 5));
        buttons.setFont(new Font("SansSerif", Font.BOLD, 14));
        up = new Button("Up a Directory"); // Установка двух кнопок
        close = new Button("Close");
        up.addActionListener(this);
        close.addActionListener(this);
        buttons.add(up);                 // Добавление кнопок к панели
        buttons.add(close);

        this.add(list, "Center");        // Заполнение окна содержимым
        this.add(details, "North");
        this.add(buttons, "South");
        this.setSize(500, 350);

        listDirectory(directory);        // А теперь отображается содержимое
        // начального каталога.
    }

    /**
     * Этот метод использует метод list() для получения всех элементов
     * каталога и затем отображает их при помощи компонента List.
     Содержимое каталога и информация о файле 81
     **/
    public void listDirectory(String directory) {
        // Строка преобразуется в объект File и выполняется проверка,
        // существует ли такой каталог
        File dir = new File(directory);
        if (!dir.isDirectory())
            throw new IllegalArgumentException("FileLister: "
                    + "нет такого каталога");
                    // Принимается (отфильтрованное) содержимое каталога
                    files = dir.list(filter);
        // Сортируется список имен файлов. До появления Java 1.2 можно было
        // воспользоваться для сортировки
        // методом com.davidflanagan.examples.classes.Sorter.sort().
        java.util.Arrays.sort(files);

        // Из списка удаляются все старые элементы и вставляются новые
        list.removeAll();
        list.add("[Up to Parent Directory]");  // Специальный элемент списка
        for(int i = 0; i < files.length; i++) list.add(files[i]);

        // В заголовке окна и в области подробной информации
        // отображается имя каталога
        this.setTitle(directory);
        details.setText(directory);

        // На будущее запоминается текущий каталог.
        currentDir = dir;
    }

    /**
     * Этот метод интерфейса ItemListener использует различные методы
     * класса File для получения информации о файле или каталоге.
     * Затем он отображает эту информацию.
     **/
    public void itemStateChanged(ItemEvent e) {
        int i = list.getSelectedIndex() - 1;  // Минус 1 для элемента
        // Up To Parent (к родительскому
        // каталогу)
        if (i < 0) return;
        String filename = files[i];        // Принимается выбранный элемент
        File f = new File(currentDir, filename);  // Преобразуется в File
        if (!f.exists())                   // Подтверждается его существование
            throw new IllegalArgumentException("FileLister: " +
                    "нет такого файла или каталога");
        // Получение подробной информации о файле или каталоге,
        // соединение ее в одну строку
        String info = filename;
        if (f.isDirectory()) info += File.separator;
        info += " " + f.length() + " байт ";
        info += dateFormatter.format(new java.util.Date(f.lastModified()));
        if (f.canRead()) info += " для чтения";
    //    82 Глава 3. Ввод/вывод
        if (f.canWrite()) info += " для записи";

        // И отображение строки с подробностями
        details.setText(info);
    }

    /**
     * Этот метод интерфейса ActionListener вызывается, когда пользователь
     * делает двойной щелчок на элементе или нажимает одну из кнопок.
     * Если двойной щелчок сделан на файле, создается FileViewer
     * для отображения этого файла. Если двойной щелчок сделан на каталоге,
     * вызывается метод ListDirectory() для отображения этого каталога
     **/
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == close) this.dispose();
        else if (e.getSource() == up) { up(); }
        else if (e.getSource() == list) {  // Двойной щелчок на элементе
            int i = list.getSelectedIndex(); // На каком элементе?
            if (i == 0) up();   // Обрабатывается первый элемент, Up To Parent
            else {              // В противном случае принимается имя файла
                String name = files[i-1];
                File f = new File(currentDir, name);    // Преобразуется в File
                String fullname = f.getAbsolutePath();
                if (f.isDirectory()) listDirectory(fullname); // Отображается
                    // содержимое каталога
                else new FileViewer(fullname).show();       // Отображается
                // содержимое файла
            }
        }
    }

    /** Вспомогательный метод для отображения содержимого
     родительского каталога */
    protected void up() {
        String parent = currentDir.getParent();
        if (parent == null) return;
        listDirectory(parent);
    }

    /** Вспомогательный метод, используемый методом main() */
    public static void usage() {
        System.out.println("Формат: java FileLister [имя каталога] " +
                "[[e расширение файла]");
        System.exit(0);
    }

    /**
     * Метод main(), обеспечивающий самостоятельный запуск FileLister. Анали陰
     * зируются аргументы, передаваемые в командной строке, и создается объект
     *  FileLister. Если задано расширение, для него создается FilenameFilter.
     *  Если никакой каталог не задан, используется текущий каталог.
     **/
    public static void main(String args[]) throws IOException {
  //      Сжатие файлов и каталогов 83
        FileLister f;
        FilenameFilter filter = null;  // Фильтр на случай, если он задан
        String directory = null;       // Заданный или текущий каталог

        // Цикл по массиву аргументов и их анализ
        for(int i = 0; i < args.length; i++) {
            if (args[i].equals("e")) {
            if (++i >= args.length) usage();
            final String suffix = args[i]; // Переменная объявлена
            // как final для возможности ее
            // использования в описанном
            // ниже безымянном классе
            // Этот класс является простым фильтром имен файлов
            // FilenameFilter.  Он определяет метод accept(), необходимый
            // для выяснения того, следует ли отображать заданный файл.
            // Файл будет отображен, если его имя оканчивается
            // заданным расширением или если он является каталогом.
            filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if (name.endsWith(suffix)) return true;
                    else return (new File(dir, name)).isDirectory();
                }
            };
        }
        else {
            if (directory != null) usage();  // Если уже задан, ошибка.
            else directory = args[i];
        }
    }

    // Если каталог не задан, используется текущий
    if (directory == null) directory = System.getProperty("user.dir");
    // Создается объект FileLister с заданным каталогом и фильтром.
    f = new FileLister(directory, filter);
    // Подготавливается завершение приложения при закрытии окна
    f.addWindowListener(new WindowAdapter() {
        public void windowClosed(WindowEvent e) { System.exit(0); }
    });
    // Наконец, выводится окно.
    f.show();
}
}
