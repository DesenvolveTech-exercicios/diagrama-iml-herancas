package models;

public class Cachorro extends Animal {
    public Cachorro() {}

    public Cachorro(String nome) {
        super(nome);
    }

    public String late(){
        return "au au";
    }
}
