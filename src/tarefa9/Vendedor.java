/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Vendedor extends Empregados {

    //Datos principais
    private String telMovil;
    private String area;
    private int porcentVendas;
    ArrayList<String> listaClientes;
    //Coche de empresa
    private String matricula;
    private String marca;
    private String modelo;

    
    public Vendedor(String nome, String apelidos, String DNI, String direccion, int antiguedade, String telefono, float salario, String telMovil, String area, int porcentVendas) {
        super(nome, apelidos, DNI, direccion, antiguedade, telefono, salario);
        
    }

    @Override
    public String imprimir() {
        return nome+apelidos+DNI+direccion+antiguedade+telefono+salario+salarioBase+telMovil+area+porcentVendas+listaClientes+matricula+marca+modelo;                
    }

    @Override
    public void incrementarSalario() {
        salario = salarioBase + (((10 * salarioBase) / 100) * antiguedade);
        
    }

    public String altaCliente(String cliente) {
        listaClientes.add(cliente);
        return "O cliente foi dado de alta con éxito";
    }

    public String baixaCliente(String cliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).equals(cliente)) {
                listaClientes.remove(i);
                return "O cliente foi dado de baixa con éxito";
            }
        }
        return "ERROR: O nome non aparece na base de datos";
    }

    public String cambiarCoche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        return "O coche foi cambiado con éxito";
    }
    
}
