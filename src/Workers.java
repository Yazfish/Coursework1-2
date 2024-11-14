// Курсовая работа 1 (почти средний вариант), Введение в профессию и синтаксис языка.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//

public class Workers {
    public static void main(String[] args) {
        EmplBook worker = new EmplBook();

        worker.addWorker("Иванов Иван Иванович", "Доставка", 2020);
        worker.addWorker("Иванов Петр Иванович", "Доставка", 1040);
        worker.addWorker("Сергеев Иван Андреевич", "Склад", 2000);
        worker.addWorker("Петров Алексей Григорьевич", "Склад", 2000);
        worker.addWorker("Васечкин Иван Макарович", "Склад", 2000);
        worker.addWorker("Иванов Иван Константинович", "Склад", 6000);

        worker.printAllWorkers();
        System.out.println();
        System.out.println("Всего сотрудников на предприятии - " + worker.getCurrentSize());
        System.out.println();
        worker.findWorker("Иванов Петр Иванович");
        System.out.println();
        worker.findWorker("Иванов Петр Сергеевич");
        System.out.println();
        worker.findWorkerDiv("Склад");

        System.out.println();
        worker.findDivSalary( "Склад" );
        System.out.println();
        worker.calcSalaryIncrWorkers();
        System.out.println();
        worker.findAvSalary("Склад");



    }
}
