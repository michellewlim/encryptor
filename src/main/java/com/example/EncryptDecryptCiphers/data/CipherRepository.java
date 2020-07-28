package com.example.EncryptDecryptCiphers.data;

import org.springframework.beans.factory.support.ManagedList;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CipherRepository {
    public class Cipher{
        protected String name;

        public Cipher(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    protected final List<Cipher> CIPHERS = Arrays.asList(
        new Cipher("caesar"),
        new Cipher("atbash")
    );

    public List<Cipher> getCiphers(){
        return CIPHERS;
    }
}
