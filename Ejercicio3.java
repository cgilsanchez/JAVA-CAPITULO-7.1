public class Ejercicio3 {
    public static void main(String[] args) {
        int [] num = new int [10];
        int arrayaux []= new int[10];
        for (int i = 0; i < 10; i++) {
            num [i] = Integer.parseInt(System.console().readLine());
            int j = 10-i-1;
            arrayaux[j]=num[i];
            
        }
        arrayaux=num;
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayaux[j]);
        }
        System.out.println("hoy tiene un humor que ya sabes jjajajja un humor de mierda mi colega");
    }
}
