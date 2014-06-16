package OOP.week3.homework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:06.02.14
 * Time: 10:16.
 * To change this template use File|Settings|File Templates.
 */
public class DentalOffice implements Comparable<DentalOffice> {
    ArrayList<Patient> patients = new ArrayList<Patient>();
    List<Patient> list = new ArrayList<Patient>();
    int count = 1;

    public DentalOffice() {

    }

    public void addNewPatient(Patient patient) {

        patients.add(patient);

    }

    public void showAllPatients() {
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\tList of Patients :");
        System.out.println();
        for (Patient patient : patients) {

            System.out.println("\t\t\t\t" + (count) + "." + patient.ShowPatientInfo());
            count++;
            System.out.println();
        }
    }

    public void removePatient(int index) {
        patients.remove(index);

    }

    public void ShowAgeList(){

    }

    @Override
    public int compareTo(DentalOffice o) {
        return 0;
    }

    public void run() {
        String addNewClient = "Добавить новго клиента";
        String showList = "Просмотр пациентов";
        String showAgeList = "Просмотр по возрасту";
        String showNameList = "Просмотр по ФИО";
        String delete = "Удалить пациента";
        String changeClient = "Изменить пациента";
        String showmoreFiveList = "Просмотр пациентов у которих больше 5 посищений";
        String showMoneyList = "Просмотр пациентов у которих сумма больше введеной";
        String saveList = "Сохранить список пациентов";
        String loadlist = "Загрузить список пациентов";

        String all = "1." + addNewClient + "\n 2" + showList + "\n 3" + showAgeList + "\n 3" + showNameList +
                     "\n 4" + delete + "\n 5" + changeClient + "\n 6" + showmoreFiveList + "\n 7" + showMoneyList
                     + "\n 7" + saveList + "\n 8" + loadlist;

        if (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Загрузить список или создать новый?\n 1" +
                    " - Да\n 2 - Нет");
            int checkDownload = sc.nextInt();

            if (checkDownload == 1){
                //load
            }else if (checkDownload == 2){

                for (int w;;) {
                    System.out.println(all);

                    int chekmenu = sc.nextInt();

                    if (chekmenu < 1 | chekmenu > 8 ){

                        System.out.println("Ви вибрали невірне число\n" +
                                "Виберіть будь ласка правильне число");

                    }
                }
            }
        }
    }

    }



