public class EmplBook {
    // создание массива
    private Employee[] worker;
    // размер массива
    private int size;

    public EmplBook() {
        this.worker = new Employee[10];
    }


    // Печать всех сотрудников
    public void printAllWorkers() {
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            System.out.println(workers);
        }
    }

    // получить количество заполненных ячеек массива
    public int getCurrentSize() {
        return size;
    }

    //добавление сотрудников
    public void addWorker(String employeeName, String department, double salary) {
        if (size >= worker.length) {
            System.out.println("Нельзя добавить сотрудника, штат укомплектован.");
        }
        Employee newWorker = new Employee(employeeName, department, salary);
        worker[size++] = newWorker;
    }

    // удаление сотрудников по имени
    public void removeWorker(String employeeName) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getEmployeeName().equals(employeeName)) {
                System.out.println(worker[i].getEmployeeName() + " уволен, нафик таких - алкаш и прогульщик!");
                System.arraycopy(worker, i + 1, worker, i, size - i - 1);
                worker[size - 1] = null;
                size--;
            }
            if (worker[size] == null) {
                System.out.println(employeeName + " не найден");
            }
            return;
        }
    }

    // Поиск сотрудника по имени
    public void findWorker(String employeeName) {
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            if (workers.getEmployeeName().equals(employeeName)) {
                System.out.println("Результат поиска - " + workers);
                return;
            }
        }
        System.out.println(employeeName + " не найден");
    }

    // Поиск сотрудников по Отделу
    public void findWorkerDiv(String department) {
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            if (workers.getDepartment().equals(department)) {
                System.out.println("Результат поиска - " + workers);
            }

        }
    }

    // Зарплата по отделам
    public void findDivSalary(String department) {
        double sum = 0d;
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            if (workers.getDepartment().equals(department)) {
                sum += workers.getSalary();
            }
        }
        System.out.println("Зарплата всех сотрудников отдела - " + department + " = " + sum);

    }

    //Индексация Зарплаты на 15% (incr)

    public void calcSalaryIncrWorkers() {
        double totalSalary = 0d;
        double incr = 1.15;
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            totalSalary = totalSalary + workers.getSalary();

        }
        System.out.println("Текущая зарплата всех сотрудников = " + totalSalary);
        System.out.println("Увеличение зарплаты всех сотрудников на 15% составит " + totalSalary * incr);
    }

    // Средняя зп по отделу
    public void findAvSalary(String department) {
        double sum = 0d;
        double sumAvg = 0d;
        int index = 0;
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            if (workers.getDepartment().equals(department)) {
                index++;
                sum += workers.getSalary();
                sumAvg = sum / index;

            }
        }

        System.out.println("Средняя зарплата всех сотрудников отдела - " + department + " = " + sumAvg);


    }

    // Макс и мин зарплаты по отделу
    public void findMinMaxSalary(String department) {
        double maxWeeklySalary = worker[0].getSalary();
        double minWeeklySalary = worker[0].getSalary();
        for (int i = 0; i < size; i++) {
            Employee workers = worker[i];
            if (workers.getDepartment().equals(department)) {
                for (i = 1; i < size; i++) {
                    if (worker[i].getSalary() > maxWeeklySalary) {
                        maxWeeklySalary = worker[i].getSalary();
                    }
                    if (worker[i].getSalary() < minWeeklySalary) {
                        minWeeklySalary = worker[i].getSalary();
                    }

                }
                System.out.println("Уровень зарплат в отделе - " + department + " составляет:");
                System.out.println("Минимальная зарплата - " + minWeeklySalary);
                System.out.println("Максимальная зарплата - " + maxWeeklySalary);
            }
        }
    }
}

// индексация зп+
// поиск по отделу мин зп+
// поиск по отделу макс зп+
// средняя зп по отделу+
// сумма по отделу +
// печать списка по отделу +


