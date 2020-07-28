package com.example.EncryptDecryptCiphers.data;

public class Caesar {
    protected String content;
    protected int shift;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public StringBuffer encode(){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < content.length(); i++){
            char ch = content.charAt(i);
            if (Character.isUpperCase(ch)){
                ch = (char)(((int)ch + shift - 65) % 26 + 65);
                result.append(ch);
            }
            else{
                ch = (char)(((int)ch + shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


}
