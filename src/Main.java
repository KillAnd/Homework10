public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName +" "+ middleName +" "+ lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //Task 3
        System.out.println("Task 3");
        String fullName1 = fullName.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName1);


    }
}