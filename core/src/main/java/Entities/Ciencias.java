package Entities;

import estructuras.ListaEnlazada;

public class Ciencias extends Habilidad {

    public void llenarEgo(){
        ListaEnlazada<String> frases = new ListaEnlazada();
        frases.pushBack("Jaja, fumanas");
        frases.pushBack("Paredes blancas");
        frases.pushBack("No raye el viejo");
        frases.pushBack("Bañese, mamerto");
        frases.pushBack("lol");
        this.getAtaqueDistancia().setFrases(frases);
    }

    public Ciencias(){
        super();
        llenarEgo();
        getAtaqueCorto().setEstado( new Eructado() );
    }

}
