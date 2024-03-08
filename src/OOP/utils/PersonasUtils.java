package OOP.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import OOP.entity.Persona;

public class PersonasUtils {

        public static List<Persona> getPersonList() {
                List<Persona> personas = new ArrayList<>();

                Persona persona = new Persona("Edgar", "Cidoncha",
                                646227018, "53491045Z");

                Persona personaPablo = new Persona("Pablo", "Bardera",
                                699225566, "53667611D");

                Persona personaCr7 = new Persona("Cr7", "Dios",
                                655228888, "53491045F");

                Persona personaMbapee = new Persona("Mbapee", "Fichaje",
                                646445566, "53491045J");

                Persona personaVini = new Persona("Mbapee", "Fichaje",
                                646445566, "53491045J");

                Persona personaVini2 = new Persona("Mbapee", "Fichaje",
                                646445566, "53491045J");

                personas.addAll(Arrays.asList(persona, personaPablo, personaCr7, personaMbapee, personaVini,
                                personaVini2));

                // Añadir id segun posicion en la lista
                for (Persona personaImpreso : personas) {
                        personaImpreso.setID(personas.indexOf(personaImpreso));
                }
                return personas;
        }

        public static boolean numeroValido(double numeroTlf, int numeroCaracteres) {
                // con esto lo que hacemos es pasar el numero que no llega por int, lo pasamos a
                // comillas ej "646227018", con esto queremos obtener
                // la longitud del numero con el .length()
                int longitudNumero = String.valueOf(numeroTlf).length();

                // ponemos longitudNumero == numeroCaracteres para comparar la longitudNuemero
                // con el numero de caracteres que nos han pasado por parametro
                return longitudNumero == numeroCaracteres;
        }
}
