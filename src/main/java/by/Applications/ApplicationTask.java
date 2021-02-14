package by.Applications;

import by.Tasks.OneTimeTask;
import by.Tasks.RepeatableTask;

public class ApplicationTask {
    public static void main(String[] args) {
        RepeatableTask repeatableTask1 = new RepeatableTask();
        repeatableTask1.edit(repeatableTask1.inputString(),
                repeatableTask1.inputString(),
                repeatableTask1.inputInt());
        repeatableTask1.print();

        OneTimeTask oneTimeTask1 = new OneTimeTask();
        oneTimeTask1.edit(oneTimeTask1.inputString(),
                oneTimeTask1.inputString(),
                oneTimeTask1.inputString());
        oneTimeTask1.print();
    }
}
