package by.Users;

public class User {
    private String lastName;
    private String firstName;
    private String middleName;
    private String userId;

    public User() {

    }

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getUserId() {
        return userId;
    }

    public class Builder {

        private Builder() {
        }

        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            User.this.middleName = middleName;
            return this;
        }
        public Builder setUserId(String userId){
            User.this.userId = userId;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
    public void print() {
        System.out.println("User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", userId='" + userId + '\'' +
                '}');
    }
}