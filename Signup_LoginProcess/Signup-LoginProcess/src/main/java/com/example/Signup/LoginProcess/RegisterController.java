package com.example.Signup.LoginProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService service;

    public RegisterController(RegisterService service) {
        this.service = service;
    }


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Register> listRegister = service.listAll();
        model.addAttribute("listRegister", listRegister);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewregisterPage(Model model) {
        Register register = new Register();
        model.addAttribute("register", register);

        return "new_Register";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRegister(@ModelAttribute("register") Register register) {
        service.save(register);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditRegisterPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_register");
        RegisterService register = service.get(id);
        mav.addObject("register", register);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteRegsiter(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}