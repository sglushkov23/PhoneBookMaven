package ru.academits.java.glushkov.phone_book_maven;

import ru.academits.java.glushkov.phone_book_maven.converter.ContactConverter;
import ru.academits.java.glushkov.phone_book_maven.converter.ContactValidationConverter;
import ru.academits.java.glushkov.phone_book_maven.converter.IdsListConverter;
import ru.academits.java.glushkov.phone_book_maven.dao.ContactDao;
import ru.academits.java.glushkov.phone_book_maven.service.ContactService;

/**
 * Created by Anna on 14.06.2017.
 */
public class PhoneBook {

    public static ContactDao contactDao = new ContactDao();

    public static ContactService phoneBookService = new ContactService();

    public static ContactConverter contactConverter = new ContactConverter();

    public static ContactValidationConverter contactValidationConverter = new ContactValidationConverter();

    public static IdsListConverter idsListConverter = new IdsListConverter();
}