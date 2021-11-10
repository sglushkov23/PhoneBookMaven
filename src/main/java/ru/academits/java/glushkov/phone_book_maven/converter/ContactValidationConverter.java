package ru.academits.java.glushkov.phone_book_maven.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.academits.java.glushkov.phone_book_maven.service.ContactValidation;

public class ContactValidationConverter {
    private final Gson gson = new GsonBuilder().create();

    public String convertToJson(ContactValidation contactValidation) {
        return gson.toJson(contactValidation);
    }
}
