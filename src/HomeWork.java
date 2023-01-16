public class HomeWork {
    public static void main(String[] args) {
        String text = "I study Basic Java!";//задание 1
        String newtext= text;//задание 2

        System.out.println(newtext);


        System.out.println("Text lenght " +text.length());
        System.out.println("Последний символ стрроки - "+text.charAt(18));//задание 3
        System.out.println("Последний символ метод 2- " +text.charAt(text.length()-1));// задание 3

        boolean resultContains = text.contains("Java");
        System.out.println(" Is text contains our substring 'Java':" +resultContains);// задание 4

        String oldString = text;
        String newString = oldString.replace("a","o");
        System.out.println(newString);//задание 5


        System.out.println(text.toUpperCase());//задание 6
        System.out.println(text.toLowerCase());//задание 7

    }
}
