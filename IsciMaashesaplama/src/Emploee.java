public class Emploee {
    String name;
    double salary;
    double workHours;
    double hireYear;
    double a;


    Emploee(String name, double salary, double workHours, double hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        a =this.salary;
        if (this.salary > 1000) {
            a = (a * 0.03);
            return a;
        }
        return 0;

    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        }
        if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;
        }
        if (2021 - this.hireYear > 20) {
            return this.salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Work hours: "+this.workHours);
        System.out.println("Hired year : "+this.hireYear);
        System.out.println("Tax : "+tax());
        System.out.println("bonus: "+bonus());
        System.out.println("Raise index of year: "+raiseSalary());
        System.out.println(tax()+bonus()+this.salary);
        System.out.println(bonus()+raiseSalary()+this.salary);
        return null;
    }
}
