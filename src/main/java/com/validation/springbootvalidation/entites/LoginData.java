package com.validation.springbootvalidation.entites;

// import jakarta.validation.constraints.Pattern;

// import javax.validation.constraints.NotBlank;
// import javax.validation.constraints.Size;

public class LoginData {

    // @NotBlank(message = "User name can not be empty !!")
    // @Size(min = 3, max = 12, message = "User name must be between 3-12
    // characters")
    private String userName;

    // @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid
    // Email")
    // @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid
    // Email")
    private String email;

    // @AsserTrue(message="must agreed terms and conditions")
    private boolean agreed;

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
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

    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + "]";
    }

}
