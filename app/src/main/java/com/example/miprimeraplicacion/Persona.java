package com.example.miprimeraplicacion;

import org.json.JSONException;
import org.json.JSONObject;

public class Persona {

    private  String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String password;

    public Persona(String nombre, String apellido, String id, String telefono, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.password=password;
    }

    // Método para crear un JSON a partir de los atributos
    public JSONObject toJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("nombre", this.nombre);
        json.put("apellido", this.apellido);
        json.put("telefono", this.telefono);
        json.put("password", this.password);
        json.put("id", this.id);
        return json;
    }
    // Método para inicializar atributos a partir de un JSON
    public void fromJson(JSONObject json) {
        this.nombre = json.optString("nombre", "");
        this.apellido = json.optString("apellido", "");
        this.telefono = json.optString("telefono", "");
        this.password= json.optString("password","");
        this.id= json.optString("id","");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
