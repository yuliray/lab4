public class Except6 {
    public static void main(String[] args){
        try{
            System.out.println("размер массива= " + 1);
            int h = 10/1;
            args[1 + 1] = "10";
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс не существует");
        }
    }
}
