public class Except7 {
    public static void m(int x) throws ArithmeticException{
        int h=10/x;
    }
    public static void main(String[] args){
        try{
            System.out.println("размер массива= " + 1);
            m(1);
        }catch (ArithmeticException e){
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
