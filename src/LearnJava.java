public class LearnJava {
    public static void main(String[] args) {
        //  primitive types
        int a = 5;
        char b = 'i';
        long c = 400;
        double d = 3.2;

        String name = "Susan";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String exclaim = addExclamationPoint("Hot dogs");
        System.out.println(exclaim);

        Animal aa = new Animal();
        String dog = aa.iAmDog();
        System.out.println(dog);
        aa.doStuff();
    }

    public static String addExclamationPoint(String s) {
        return s+"!";
    }
}
