package by.Tasks;

import java.util.Objects;
import java.util.Scanner;

public class RepeatableTask extends AbstractTask {
    private int repeats;

    public RepeatableTask() {
    }

    public void edit(String name, String date, int repeats) {
        super.edit(name, date);
        this.repeats = repeats;
    }

    public int inputInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    @Override
    public void print() {
        System.out.println(super.toString() + toString());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        RepeatableTask that = (RepeatableTask) o;
//        return repeats == that.repeats;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), repeats);
//    }

    @Override
    public String toString() {
        return " Количество повторений: " + repeats + '.';
    }
}

