package OOP.week2.homework;



/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:29.01.14
 * Time: 12:08.
 * To change this template use File|Settings|File Templates.
 */
public class Array {
    int size;
    int[] arr;


    public Array(){

    }

   public Array(int size,int[] arr){
       this.size = size;
       this.arr = arr;
   }

    public  Array(int size){
        this.size = size;
    }

    public  Array(int[] arr){
        this.arr = arr;
    }



    public int[] randomArr (){
        int[] array = new int[size];
       for (int i = 0;i < size;i++){
        array[i] = (int) (Math.random() * 100);

       }
        return array;
    }

public int  arrMin(){               //Створюєм масив через метод рандом
    int min = arr[0];                     //Задаэм мінімальне значення першою цифрою масива
    for (int i = 0;i < arr.length;i++){   //Пробігаємся по кожному елементу масива
        if (min > arr[i]) {              //Якщо перша цифра масива більше ніж наступна в масиві
            min = arr[i];               // то наступна стає мінімальною
        }


        System.out.print(arr[i] + " ");        //Виводим массив
    }

    return min;                                 //Вертаєм мінімальне значення масиву
}

    public int arrMax(){
        int max = arr[0];                     //аналогічто методу arrMin
        for (int i = 0;i < arr.length;i++){   //аналогічто методу arrMin
          if (max < arr[i]){                  //Якщо max менше наступного елемента масиву
            max = arr[i];                     //то наступний елемент стає max
          }

            System.out.print(arr[i] + " "); //аналогічто методу arrMin
        }
        return max;                            //аналогічто методу arrMin
    }

    public void printArr(){
        System.out.print("{");                     //Ставим спочатку скобку
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");         //Виводим масив
        }                                          //Ставим вкінці скобку
        System.out.print("}");


    }
    public int[] sizePlus(int size2){
        int newsize = size2  + size;
        int[] array = new int[newsize];
       arr = randomArr();
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
            array[i] = arr[i];

        }


        for (int i = 0;i < size;i++){
            array[i] = (int) (Math.random() * 100);

        }

     return array;
    }

    public int[] arrSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
    /* Предполагаем, что начальный элемент рассматриваемого
     * фрагмента и будет минимальным.
     */
            int min = arr[i]; // Предполагаемый минимальный элемент
            int minindex = i; // Индекс минимального элемента
    /* Просматриваем оставшийся фрагмент массива и ищем там
     * элемент, меньший предположенного минимума.
     */
            for (int j = i+1; j < arr.length; j++) {
        /* Если находим новый минимум, то запоминаем его индекс.
         * И обновляем значение минимума.
         */
                if (arr[j] < min) {
                    min = arr[j];
                    minindex = j;
                }
            }
    /* Проверяем, нашёлся ли элемент меньше, чем стоит на
     * текущей позиции. Если нашёлся, то меняем элементы местами.
     */
            if (i != minindex) {
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }
        return arr;

    }

    public String toString(int[] arr){
     String s = null;
        return s;
    }

  /*  public boolean equals (int[] arr){
        if ()
    }*/






}
