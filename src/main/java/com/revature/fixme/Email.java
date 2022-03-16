package com.revature.fixme;

import java.util.Objects;

public class Email {

    private String authorEmail;
    private String recipientEmail;
    private String message;

    public Email(String authorEmail, String recipientEmail, String message) {
        this.authorEmail = authorEmail;
        this.recipientEmail = recipientEmail;
        this.message = message;
    }

    public Email() {
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email email = (Email) o;
        return Objects.equals(getAuthorEmail(), email.getAuthorEmail()) && Objects.equals(getRecipientEmail(), email.getRecipientEmail()) && Objects.equals(getMessage(), email.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorEmail(), getRecipientEmail(), getMessage());
    }

    @Override
    public String toString() {
        return "{\"Email\":{"
                + "\"authorEmail\":\"" + authorEmail + "\""
                + ", \"recipientEmail\":\"" + recipientEmail + "\""
                + ", \"message\":\"" + message + "\""
                + "}}";
    }
}
