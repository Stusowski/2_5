import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double[] liczby = new double[10];
    
    Random liczba = new Random();
    for(int i=0;i<10;i++){
      liczby[i] = liczba.nextInt(101);
      System.out.println(liczby[i]);
    }
   
    System.out.println("Podaj co chcesz zrobić:");
    System.out.println("1.Średnia z 10 wylosowanych liczb:");
    System.out.println("2.Mediana z 10 wylosowanych liczb:");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    switch (x){

      case 1:  
        double suma = 0;
        for(int j=0;j<10;j++){
          suma = suma + liczby[j];
        }
        double srednia;
        srednia = suma / 10;
        System.out.println("Średnia z 10 wylowowanych liczb to: "+srednia);
        break;

      case 2:
        Arrays.sort(liczby);
        double med = liczby[4]+liczby[5];
        double mediana = med/2;
        System.out.println("Mediana z 10 wylowowanych liczb to: "+mediana);
        break;
    }
  }
}