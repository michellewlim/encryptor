package com.example.EncryptDecryptCiphers.data;

public class Atbash {
    protected String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public StringBuffer encode(){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < content.length(); i++){
            char ch = content.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = (char)(90 - (((int)ch) - 65));
                result.append(ch);
            }
            else{
                ch = (char)( 122 - (((int)ch) - 97));
                result.append(ch);
            }
        }
        return result;
    }
}
