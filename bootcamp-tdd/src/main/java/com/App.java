package com;

public class App {

    private String base;

    public String concat(String s){
        if (this.base == null){
            throw new IllegalArgumentException()
        }
        return this.base.concat(s);
    }

    public void setBase(String base){
        this.base = base;
    }


    public static void main(String[] args) {
        
    }
}
