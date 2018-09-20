public class Classroom {
    public static void main(String[] args){
        Wilder jeremy = new Wilder("Jérémy", true);
        Wilder romain= new Wilder("Paul", false);

        System.out.println(jeremy.whoAmI());
        System.out.println(romain.whoAmI());


    }
}