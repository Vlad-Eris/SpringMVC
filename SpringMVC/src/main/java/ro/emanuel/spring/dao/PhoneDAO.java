package ro.emanuel.spring.dao;

import java.util.ArrayList;
import java.util.List;
import ro.emanuel.spring.model.Phone;

public class PhoneDAO {
    private static List<Phone> phones = new ArrayList<>();
    static {
        phones.add(new Phone(1, "Apple", "iPhone 12"));
        phones.add(new Phone(2, "Samsung", "Galaxy S21"));
    }

    public List<Phone> getAllPhones() {
        return phones;
    }

    public Phone getPhoneById(int id) {
        return phones.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}