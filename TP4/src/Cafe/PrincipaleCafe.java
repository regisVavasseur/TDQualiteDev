package Cafe;

public class PrincipaleCafe {
    public static void main(String[] args) {

        Boisson boisson = new Deca();
        boisson = new DecorateurBoissonCreme(boisson);
        boisson = new DecorateurBoissonChantilly(boisson);
        boisson = new DecorateurBoissonChantilly(boisson);
        System.out.println(boisson);

    }
}
