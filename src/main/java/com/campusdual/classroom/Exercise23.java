package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map mapa = new HashMap<String, Person>();
        mapa.put("person",new Person("John", "Smith"));
        mapa.put("teacher",new Teacher("María", "Montessori", "Educación"));
        mapa.put("police",new PoliceOfficer("Jake", "Peralta", "B-99"));
        mapa.put("doctor",new Doctor("Gregory", "House", "Nefrología e infectología"));
        return mapa;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return map.get(key);
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
