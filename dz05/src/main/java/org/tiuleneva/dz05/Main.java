package org.tiuleneva.dz05;

public class Main {
    public static void main (String [] args){

        //Employee empIvan = new Employee("Ivanov Ivan Ivanovich" , "Director", "ivanov@mail.ru", "89000000000", 350000, 43);
        //Employee empPetr = new Employee("Petrov Petr Petrovich" , "ZamDirector", "petrov@mail.ru", "89000000001", 150000, 42);
        //Employee empSidor = new Employee("Sidorov Sidor Sidorovich" , "Manager", "sidorov@mail.ru", "89000000002", 50000, 30);
        //Employee empIrina = new Employee("Svetina Irina Ivanovna" , "Bookkeeper", "svetina@mail.ru", "89000000003", 70000, 35);
        //Employee empElena = new Employee("Kirillova Elena Petrovna" , "Marketolog", "kirillova@mail.ru", "89000000004", 60000, 37);
        //empIvan.printInfo();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich" , "Director", "ivanov@mail.ru", "89000000000", 350000, 43);
        employees[1] = new Employee("Petrov Petr Petrovich" , "ZamDirector", "petrov@mail.ru", "89000000001", 150000, 42);
        employees[2] = new Employee("Sidorov Sidor Sidorovich" , "Manager", "sidorov@mail.ru", "89000000002", 50000, 30);
        employees[3] = new Employee("Svetina Irina Ivanovna" , "Bookkeeper", "svetina@mail.ru", "89000000003", 70000, 35);
        employees[4] = new Employee("Kirillova Elena Petrovna" , "Marketolog", "kirillova@mail.ru", "89000000004", 60000, 37);

        System.out.println("Employees of OOO «Romashka»: ");
        System.out.println("*  *  *");
        for (int i=0; i<employees.length; i++){
            if (employees[i].getAge() > 40){
                employees[i].printInfo();
                System.out.println("--------------------------------------");
            }
        }
    }
}
