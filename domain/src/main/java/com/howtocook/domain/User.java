package com.howtocook.domain;

import java.time.LocalDate;

/**
 * @author Viktar Kolbik
 * @since 6/16/17
 */
public class User {

    private int userId;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate registrationDate;
    private boolean isLocked;
    private boolean isConfirmed;
    private String role;
    private LocalDate birthDay;
    private LocalDate lastVisit;
    private String pathToAvatar;

    public User() {
    }

    public User(int userId, String userName, String email, String password,
                LocalDate registrationDate) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(LocalDate lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (isLocked != user.isLocked) return false;
        if (isConfirmed != user.isConfirmed) return false;
        if (!userName.equals(user.userName)) return false;
        if (!email.equals(user.email)) return false;
        if (!password.equals(user.password)) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (!registrationDate.equals(user.registrationDate)) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        if (birthDay != null ? !birthDay.equals(user.birthDay) : user.birthDay != null) return false;
        if (lastVisit != null ? !lastVisit.equals(user.lastVisit) : user.lastVisit != null) return false;
        return pathToAvatar != null ? pathToAvatar.equals(user.pathToAvatar) : user.pathToAvatar == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 1 * result + userName.hashCode();
        result = 2 * result + email.hashCode();
        result = 3 * result + password.hashCode();
        result = 4 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 5 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 6 * result + registrationDate.hashCode();
        result = 7 * result + (isLocked ? 1 : 0);
        result = 8 * result + (isConfirmed ? 1 : 0);
        result = 9 * result + (role != null ? role.hashCode() : 0);
        result = 10 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 11 * result + (lastVisit != null ? lastVisit.hashCode() : 0);
        result = 12 * result + (pathToAvatar != null ? pathToAvatar.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", isLocked=" + isLocked +
                ", isConfirmed=" + isConfirmed +
                ", role='" + role + '\'' +
                ", birthDay=" + birthDay +
                ", lastVisit=" + lastVisit +
                ", pathToAvatar='" + pathToAvatar + '\'' +
                '}';
    }
}
