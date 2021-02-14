package by.Tasks;

import java.util.Objects;
import java.util.Scanner;

public abstract class AbstractTask implements Task {
    private String name;
    private String date;

    public AbstractTask() {
    }

    public enum Category {
        REST("Отдых"), WORK("Работа"), STUDY("Учёба"), SPORTS("Спорт");
        private String name;

        Category(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Категория: " + name + '.' + "\n";
        }
    }

    public enum Priority {
        LOW("Низкий"), MIDDLE("Средний"), HIGH("Высокий");
        private String name;

        Priority(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Приоритет: " + name + ".\n";
        }
    }

    @Override
    public void edit(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String inputString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTask that = (AbstractTask) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Задача: " + name + '.' + "\n"
                + "Дата выполнения: " + date + ".";
    }
}

