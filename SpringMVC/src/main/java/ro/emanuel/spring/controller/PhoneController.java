package ro.emanuel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.spring.dao.PhoneDAO;
import ro.emanuel.spring.model.Phone;

@Controller
public class PhoneController {
    private PhoneDAO phoneDAO = new PhoneDAO();

    @GetMapping("/phones")
    public String getAllPhones(Model model) {
        model.addAttribute("phones", phoneDAO.getAllPhones());
        return "phones";
    }

    @GetMapping("/phone")
    public String getPhoneById(@RequestParam("id") int id, Model model) {
        Phone phone = phoneDAO.getPhoneById(id);
        model.addAttribute("phone", phone);
        return "phone";
    }
}