package by.Applications;

import by.Users.User;

public class ApplicationUser {
    public static void main(String[] args) {
        User user = User.newBuilder()
                .setLastName("Kilchevskij")
                .setFirstName("Vladislav")
                .setMiddleName("Eduardovich")
                .setUserId("385748")
                .build();
        user.print();
    }
}
