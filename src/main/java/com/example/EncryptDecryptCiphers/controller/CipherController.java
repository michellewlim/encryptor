package com.example.EncryptDecryptCiphers.controller;
import com.example.EncryptDecryptCiphers.data.Atbash;
import com.example.EncryptDecryptCiphers.data.Caesar;
import com.example.EncryptDecryptCiphers.data.CipherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CipherController {
    @Autowired
    protected CipherRepository cipherRepository;

    @RequestMapping(value = "/")
    public String ListCiphers(ModelMap modelMap){
        List<CipherRepository.Cipher> ciphers= cipherRepository.getCiphers();
        modelMap.put("ciphers", ciphers);
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
        return "result";
    }

    @GetMapping(value = "/atbash")
    public String AtbashInput(Model model){
        model.addAttribute("atbash", new Atbash());
        return "atbashForm";
    }

    @PostMapping(value = "/atbash")
    public String AtbashSubmit(@ModelAttribute Atbash atbash, ModelMap modelMap){
        StringBuffer encode = atbash.encode();
        modelMap.put("encode", encode);
        return "result";
    }

}
