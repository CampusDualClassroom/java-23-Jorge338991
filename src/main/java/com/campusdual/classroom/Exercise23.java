package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map mapa = new HashMap<String, Person>();
        Person p1 = new Person("John", "Smith");
        Teacher t = new Teacher("María", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e infectología");
        addMapValue(mapa, "person", p1);
        addMapValue(mapa, "teacher", t);
        addMapValue(mapa, "police", po);
        addMapValue(mapa, "doctor", d);
        return mapa;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        map.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + "; Nombre completo: " + valor.name + " " + valor.surname);
        });
    }

    public static void main(String[] args) {
        Map<String, Person> mapa = createHashMap();
        printMapValues(mapa);
    }
}
