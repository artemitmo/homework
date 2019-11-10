package HWLes11.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Создать список объетов List<Employee>
// и сортировать по:
// имени
// имени и зарплете
// имени, зарплете, возрасту и компании

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee ( String name , String company , int salary , int age ) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCompany () {
        return company;
    }

    public void setCompany ( String company ) {
        this.company = company;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary ( int salary ) {
        this.salary = salary;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // TODO: конструктор, геттеры и сеттеры ++++

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int)((Math.random()*names.length))], companies[(int)((Math.random()*companies.length))], 10*(int)(Math.random()*1000), 21 + (int)(Math.random()*29)));
            // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп ++
        }
        return employees;
    }

    public void sortName(List<Employee> list){
        Collections.sort(list , new Comparator<Employee>() {
            @Override
            public int compare ( Employee o1 , Employee o2 ) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void sortNameSal (List<Employee> list) {
        Collections.sort(list , new Comparator<Employee>() {
            @Override
            public int compare ( Employee o1 , Employee o2 ) {
                if (o1.getName().compareTo(o2.getName())!=0){
                    return (o1.getName().compareTo(o2.getName()));
                }

                else { if (o1.getSalary()>o2.getSalary()){
                    return 1;
                }
                else if (o1.getSalary()<o2.getSalary()){
                    return -1;
                }
                else {
                    return 0;
                }
                }
            }
        });
    }

    public static void main ( String[] args ) {
        List<Employee> emp = Employee.employeeGenerator(3);
        System.out.println(Employee.employeeGenerator(3));
        Employee.sortNameSal(emp);
        System.out.println(emp);
    }
}