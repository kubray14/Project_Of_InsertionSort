public class InsertionSort {
public static void main(String[] args) {
     
    int array [] = {22,27,16,2,18,6};

    int i, j, k, number;
    int asama=1;
    for (i = 1; i < array.length; i++) {
        number = array[i];
        j = i;
        while (j > 0 && array[j - 1] > number) {
        array[j] = array[j - 1];
        j--;
        }
        array[j] = number;
        System.out.print("Asama "+ asama+": ");
        for (k = 0; k < array.length; k++) {
            System.out.print(array[k]+", ");
        }
        asama++;
        System.out.println("");
        } 
} 

}
