package OOP.other;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.03.2014
 * Time: 11:08
 * To change this template use File|Setting|File Templates.
 */

    /**
     * Этот класс создает и отображает окно, содержащее область TextArea,
     * в которой визуализируется содержимое текстового файла.
     **/

    public class FileViewer extends Frame implements ActionListener {
        String directory;  // Каталог, принимаемый по умолчанию FileDialog
        TextArea textarea; // Область, в которой будет отображаться содержимое файла

        /** Вспомогательный конструктор: окно просмотра открывается пустым */
        public FileViewer() {
            this(null, null);
        }
        /** Вспомогательный конструктор: отображается файл из текущего каталога */
        public FileViewer(String filename) {
            this(null, filename);
        }

        /**
         * Настоящий конструктор. Создает объект FileViewer для отображения
         * заданного файла из заданного каталога
         **/
        public FileViewer(String directory, String filename) {
            super();  // Создается рамка

            // По требованию пользователя окно уничтожается
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { dispose(); }
            });
            // Создается область TextArea для отображения в ней содержимого файла
            //76 Глава 3. Ввод/вывод

            textarea = new TextArea("", 24, 80);
            textarea.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
            textarea.setEditable(false);
            this.add("Center", textarea);

            // Создается нижняя панель для двух кнопок
            Panel p = new Panel();
            p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
            this.add(p, "South");

            // Создаются две кнопки, и организуется обработка их нажатий
            Font font = new Font("SansSerif", Font.BOLD, 14);
            Button openfile = new Button("Open File");
            Button close = new Button("Close");
            openfile.addActionListener(this);
            openfile.setActionCommand("open");
            openfile.setFont(font);
            close.addActionListener(this);
            close.setActionCommand("close");
            close.setFont(font);
            p.add(openfile);
            p.add(close);

            this.pack();

            // Определяется каталог на основании filename или, если необходимо,
            // текущего каталога (dir)
            if (directory == null) {
                File f;
                if ((filename != null) && (f = new File(filename)).isAbsolute()) {
                    directory = f.getParent();
                    filename = f.getName();
                }
                else directory = System.getProperty("user.dir");
            }

            this.directory = directory;  // Каталог запоминается
            // для нужд FileDialog
            setFile(directory, filename); // Теперь файл загружается и отображается
        }

        /**
         * Загружается и отображается заданный файл из заданного каталога
         **/
        public void setFile(String directory, String filename) {
            if ((filename == null) || (filename.length() == 0)) return;
            File f;
            FileReader in = null;
            // Считывается и отображается содержимое файла. Поскольку читается
            // текст, применяется поток FileReader вместо FileInputStream.
            try {
                f = new File(directory, filename); // Создаются объект File
                in = new FileReader(f);        // и символьный поток для его чтения
                char[] buffer = new char[4096];    // За один прием считывается
                //Чтение и отображение текстовых файлов 77
                // 4K символов
                int len;                    // Число символов, считанных на этот раз
                textarea.setText("");       // Очистка textarea
                while((len = in.read(buffer)) != -1) { // Считывание порции символов
                    String s = new String(buffer, 0, len); // Преобразование
                    // в строку
                    textarea.append(s);                    // И отображение строк
                }
                this.setTitle("FileViewer: " + filename);  // Устанавливается
                // заголовок окна
                textarea.setCaretPosition(0);         // Переход к началу файла
            }
            // Отображаем сообщения, если чтоото не в порядке
            catch (IOException e) {
                textarea.setText(e.getClass().getName() + ": " + e.getMessage());
                this.setTitle("FileViewer: " + filename + ":"
                       + " Исключение вводa/выводa ");
            }
            // Всегда следует обеспечивать закрытие потока ввода!
            finally { try { if (in!=null) in.close(); } catch (IOException e) {} }
        }
        /**
         * Обработка нажатий кнопок
         **/
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("open")) {      // Если пользователь щелкнул
                // по кнопке “Open”
                // Создается диалоговое окно, предлагающее задать новый файл,
                // который следует отобразить
                FileDialog f = new FileDialog(this, "Open File", FileDialog.LOAD);
                f.setDirectory(directory);   // Устанавливается каталог по умолчанию
                // Отображается диалоговое окно и ожидается ответ пользователя
                f.show();
                directory = f.getDirectory();    // Запоминается принимаемый
                // по умолчанию каталог
                setFile(directory, f.getFile()); // Загружается и отображается
                // выбранный файл
                f.dispose();                     // Закрывается диалоговое окно
            }
            else if (cmd.equals("close"))     // Если пользователь щелкнул
                // по кнопке “Close”,
                this.dispose();               //окно закрывается
        }

        /**
         * Метод FileViewer может использоваться другими классами или
         * применяться самостоятельно за счет следующего метода main().
         **/
        static public void main(String[] args) throws IOException {
            //78 Глава 3. Ввод/вывод
            // Создается объект FileViewer
            Frame f = new FileViewer((args.length == 1)?args[0]:null);
            // Подготовка к выходу по закрытию окна FileViewer
            f.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) { System.exit(0); }
            });
            // Открытие окна
            f.show();
        }
    }


