// Курсовая работа 1 (почти средний вариант), Введение в профессию и синтаксис языка.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//

public class Workers {
    public static void main(String[] args) {
        EmplBook worker = new EmplBook();

        worker.addWorker("Иванов Иван Иванович", "Склад", 1020);
        worker.addWorker("Иванов Петр Иванович", "Склад", 1040);
        worker.addWorker("Сергеев Иван Андреевич", "Склад", 2000);
        worker.addWorker("Петров Алексей Григорьевич", "Склад", 1500);
        worker.addWorker("Васечкин Иван Макарович", "Доставка", 500);
        worker.addWorker("Иванов Иван Константинович", "Доставка", 7000);


        worker.printAllWorkers();
        System.out.println();
        System.out.println("Всего сотрудников на предприятии - " + worker.getCurrentSize());
        System.out.println();
        worker.findWorker("Иванов Петр Иванович");
        System.out.println();
        worker.findWorker("Иванов Петр Сергеевич");
        System.out.println();
        worker.findWorkerDiv("Доставка");

        System.out.println();
        worker.findDivSalary("Доставка");
        System.out.println();
        worker.findAvSalary("Доставка");
        System.out.println();
        worker.findMinMaxSalary();
        System.out.println();
        worker.removeWorker("Сергеddddd");
        System.out.println();
        worker.calcSalaryIncrWorkers("Склад");


    }
}
