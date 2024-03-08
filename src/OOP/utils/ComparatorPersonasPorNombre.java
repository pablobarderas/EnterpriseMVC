package OOP.utils;

import java.util.Comparator;

import OOP.entity.Persona;

public class ComparatorPersonasPorNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

}
