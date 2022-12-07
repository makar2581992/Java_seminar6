import java.util.ArrayList;
 
public class main {
 
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 25));
            System.out.println(array[i]);

            
        }
    }
    private int[] array;
    int[] myArray = array[i];
 
        for(int i=0; i<9; i++){
            if(i==8){ //Чтобы не было выхода за пределы массива тем самым "ошибки типа java.lang.ArrayIndexOutOfBoundsException"
                break;
            }
            if (myArray[i]==myArray[i+1]) { //сравниваем первую ячейку со второй и если они равны то в консоль число не выводим
                System.out.println();
            }else{
                System.out.println(myArray[i]); //иначе выводим
 
            }
}
}
}