import java.util.Scanner;

class ArrayDemo {

    int arr[] ;
    int size;

    ArrayDemo(int size){
        this.size=size;
        arr = new int[size];
    }


    void acceptElements(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter "+size+" elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
        }
    }

    void displayElements(){
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void deleteElement(int pos){
        if(pos<0 || pos>=size){
            System.out.println("Invalid position");
            return;
        }
        int newArr[] = new int[size-1];
        for(int i=0, j=0; i<size; i++){
            if(i!=pos){
                newArr[j++] = arr[i];
            }
        }
        arr = newArr;
        size--;
    }

    void insertElement(int pos, int element){

        if(pos<0 || pos>=size){
            System.out.println("Invalid position");
            return;
        }
         int newArr[] = new int[size+1];
         for(int i=0, j=0; i<size; i++){
            if (i!= pos) {
                newArr[j++] = arr[i];

         }
    }

    arr = newArr;
    size--;
}



void linearSearch(int key){
    boolean found = false;
    for(int i=0;i<size;i++){
        if(arr[i]==key){
            found = true;
            System.out.println("Element"+key+" found at index: "+i);
        
            found = true;
            break;
        }
    }
    if(!found){
        System.out.println("Element "+key+" not found in the array");
    }
}

void bubbleSort(){
    for(int i=0;i<size-1;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
System.out.println("Array after bubble sort:");
    displayElements();
}
}

public class ArrayMain {
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo(5);
        obj.acceptElements();
        obj.displayElements();

        obj.insertElement(2,99);
        System.out.println("After insertion:");
        obj.displayElements();


        obj.deleteElement(3);
        System.out.println("After deletion:");
        obj.displayElements();

        obj.linearSearch(99);
        obj.bubbleSort();


    }


}


    
