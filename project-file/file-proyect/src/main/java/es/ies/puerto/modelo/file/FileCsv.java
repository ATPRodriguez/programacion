package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass {
    @Element (name = "personas")
    List<Persona> personas;
    String path="src/main/resources/data.csv";

    public FileCsv() {
    }

    public List<Persona> obtenerPersonas () {
        List<Persona> personas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                if (i > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    String email = datos[3];
                    Persona persona = new Persona(id, nombre, edad, email);
                    personas.add(persona);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personas;
    }

    public Persona obtenerPersona (Persona personaBuscar) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            boolean encontrado = false;
            int i = 0;
            while ((linea = br.readLine()) != null && !encontrado) {
                if (i > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    if (id == personaBuscar.getId()) {
                        String nombre = datos[1];
                        int edad = Integer.parseInt(datos[2]);
                        String email = datos[3];
                        personaBuscar.setNombre(nombre);
                        personaBuscar.setEdad(edad);
                        personaBuscar.setEmail(email);
                        encontrado = true;
                    }
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaBuscar;
    }

    public void updatePersona(Persona persona) {
        List<Persona> personas = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("id,nombre,edad,email\n");
            for (Persona personasFile : personas) {
                if (personasFile.equals(persona)) {
                    writer.write(persona.toCsv() + "\n");
                } else {
                    writer.write(personasFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPersona (Persona persona) {
        Persona personaBuscar = new Persona(persona.getId());
        personaBuscar = obtenerPersona(personaBuscar);
        if (personaBuscar.getEmail() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(persona.toCsv() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePersona (Persona personaEliminar) {
        List<Persona> personas = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("id,nombre,edad,email\n");
            for (Persona persona : personas) {
                if (!persona.equals(personaEliminar)) {
                    writer.write(persona.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
