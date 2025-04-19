package Mercagala;

public class Empresa {
private String id;
private String nombre;
private String email;
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
@Override
public String toString() {
    return "Empresa [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Empresa(String id, String nombre, String email) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
}
