package com.example.miprimeraplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
    private Persona persona;

    @Before
    public void setUp() {
        // Inicializa el objeto Persona antes de cada prueba
        persona = new Persona("Jason","Leiton","116110036","88888888","1234");
    }

    @After
    public void tearDown() {
        // Aquí podría limpiar recursos si es necesario...
        persona = null; // No es estrictamente necesario, pero se puede hacer
    }

    @Test
    public void testToJson() throws JSONException {
        JSONObject json = persona.toJson();

        assertEquals("Jason", json.getString("nombre"));
        assertEquals("Leiton", json.getString("apellido"));
        assertEquals("116110036", json.getString("id"));
        assertEquals("88888888",json.getString("telefono"));
        assertEquals("1234",json.getString("password"));
    }

    @Test
    public void testFromJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("nombre", "Ana");
        json.put("apellido", "García");
        json.put("telefono", "987654321");
        json.put("id", "1010101010");
        json.put("password", "asdf");
        persona.fromJson(json);

        assertEquals("Ana", persona.getNombre());
        assertEquals("García", persona.getApellido());
        assertEquals("987654321", persona.getTelefono());
        assertEquals("1010101010", persona.getId());
        assertEquals("1010101010", persona.getId());

    }

    @Test
    public void testFromJsonWithMissingFields() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("nombre", "Luis");

        persona.fromJson(json);

        assertEquals("Luis", persona.getNombre());
        assertEquals("", persona.getApellido()); // Por defecto debería ser vacío
        assertEquals("", persona.getTelefono()); // Por defecto debería ser vacío
    }

    @Test
    public void testJsonStructure() throws JSONException {
        JSONObject json = persona.toJson();

        assertTrue(json.has("nombre"));
        assertTrue(json.has("apellido"));
        assertTrue(json.has("telefono"));
    }

    @Test
    public void testJsonEmptyValues() throws JSONException {
        JSONObject json = new Persona("","","","","").toJson();

        assertEquals("", json.getString("nombre"));
        assertEquals("", json.getString("apellido"));
        assertEquals("", json.getString("telefono"));
    }

    /**
     * Lista de los assert
     *assertEquals(expected, actual): Verifica que dos valores sean iguales.
     *
     * assertNotEquals(unexpected, actual): Verifica que dos valores no sean iguales.
     *
     * assertTrue(condition): Verifica que la condición sea verdadera.
     *
     * assertFalse(condition): Verifica que la condición sea falsa.
     *
     * assertNull(object): Verifica que el objeto sea nulo.
     *
     * assertNotNull(object): Verifica que el objeto no sea nulo.
     *
     *assertThrows(exceptionClass, executable): Verifica que se lance una excepción específica al ejecutar el bloque de código.
     *
     * assertDoesNotThrow(executable): Verifica que no se lance ninguna excepción al ejecutar el bloque de código.
     */
}
