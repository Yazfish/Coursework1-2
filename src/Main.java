// Курсовая работа 1, Введение в профессию и синтаксис языка.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        Employee[] worker = new Employee[6];

        worker[0] = new Employee("Иванов Иван Иванович", 1, 2020);
        worker[1] = new Employee("Иванов Петр Иванович", 2, 1040);
        worker[2] = new Employee("Сергеев Иван Андреевич", 3, 1100);
        worker[3] = new Employee("Петров Алексей Григорьевич", 4, 1600);
        worker[4] = new Employee("Васечкин Иван Макарович", 5, 1900);
        worker[5] = new Employee("Иванов Иван Константинович", 1, 3650);

        for (Employee workers : worker) {
            System.out.println(workers);
        }
        System.out.println();

        // Сумма ЗП

        double sum = 0d;
        for (Employee salary : worker) {
            sum = sum + salary.getSalary();
        }
        System.out.println("Сумма затрат на ЗП за месяц составила " + sum + " рублей.");
        System.out.println();

        // мин ЗП

        Employee resultMin = worker[0];
        if (worker[0] != null) {
            double minSalary = worker[0].getSalary();
            for (Employee emplMinSal : worker) {
                if (emplMinSal.getSalary() < minSalary) {
                    minSalary = emplMinSal.getSalary();
                    resultMin = emplMinSal;
                }
            }
        }
        System.out.println("Минимальная ЗП - " + resultMin);
        System.out.println();

        // макс зарплата

        Employee resultMax = worker[0];
        double maxSalary = worker[0].getSalary();
        for (Employee emplMaxSal : worker) {
            if (emplMaxSal.getSalary() > maxSalary) {
                maxSalary = emplMaxSal.getSalary();
                resultMax = emplMaxSal;
            }
        }
        System.out.println("Максимальная ЗП - " + resultMax);
        System.out.println();

        //Средняя Зп

        double sum1;
        sum1 = sum / worker.length;
        System.out.println("Среднее значение ЗП за месяц составила " + sum1 + " рублей.");
        System.out.println();

        // Список имен

        String name;
        for (Employee fio : worker) {
            name = fio.getEmployeeName();
            System.out.println(name);

        }
    }
}