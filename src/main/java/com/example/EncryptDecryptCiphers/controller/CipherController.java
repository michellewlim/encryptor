package com.example.EncryptDecryptCiphers.controller;
import com.example.EncryptDecryptCiphers.data.Caesar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CipherController {
    @RequestMapping(value = "/")
    public String ListCiphers(){
        return "home";
    }

    @GetMapping(value = "/caesar")
    public String CaesarInput(Model model){
        model.addAttribute("caesar", new Caesar());
        return "caesarForm";
    }

    @PostMapping(value = "/caesar")
    public String CaesarSubmit(@ModelAttribute Caesar caesar, ModelMap modelMap){
        StringBuffer encode = caesar.encode();
        modelMap.put("encode", encode);
        return "caesarResult";
    }

}