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
public class XefeZona extends Empregados {

    //Datos principais
    private String despacho;
    private Secretario secretario;
    ArrayList<Vendedor> listaVendedores;
    //Coche de empresa
    private String matricula;
    private String marca;
    private String modelo;

    
    public XefeZona(String nome, String apelidos, String DNI, String direccion, int antiguedade, String telefono, float salario, String despacho) {
        super(nome, apelidos, DNI, direccion, antiguedade, telefono, salario);
        
    }

    @Override
    public String imprimir() {
        return nome+apelidos+DNI+direccion+antiguedade+telefono+salario+salarioBase+despacho+secretario+listaVendedores+matricula+marca+modelo;
    }

    @Override
    public void incrementarSalario() {
        salario = salarioBase + (((20 * salarioBase) / 100) * antiguedade);
        
    }

    public String cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
        return "O novo secretario es "+secretario.nome;
    }

    public String cambiarCoche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        return "O coche foi cambiado con éxito";
    }

    public String altaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
        return "O cliente foi dado de alta";
    }

    public String baixaVendedor(Vendedor vendedor) {
        for (int i = 0; i < listaVendedores.size(); i++) {
            if (listaVendedores.get(i) == vendedor) {
                listaVendedores.remove(i);
                return "O cliente foi dado de baixa";
            }
        }
        return "ERROR:non aparece na base de datos";
    }
}