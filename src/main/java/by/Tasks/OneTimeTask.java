package by.Tasks;

import java.util.Objects;

public class OneTimeTask extends AbstractTask {

    private String time;
//  добавь период вместо времени.
    public OneTimeTask() {
    }

    public void edit(String name, String date, String time) {
        super.edit(name, date);
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println(super.toString() + toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OneTimeTask that = (OneTimeTask) o;
        return time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), time);
    }

    @Override
    public String toString() {
        return " Время выполнения: " + time + '.';
    }
}
