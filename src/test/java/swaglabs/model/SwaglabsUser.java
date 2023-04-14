package swaglabs.model;

public enum SwaglabsUser {
    STANDARD_USER("0858331704","12345678");

    public final String username;
    public final String password;

    SwaglabsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
