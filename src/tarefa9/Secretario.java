/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

/**
 *
 * @author usuario
 */
public class Secretario extends  Empregados{
    private String despacho;
    private String numFax;
    public Secretario(String nome, String apelidos, String DNI, String direccion, int antiguedade, String telefono, float salario, String despacho, String numFax) {
        super(nome, apelidos, DNI, direccion, antiguedade, telefono, salario);
        
    }

    @Override
    public void incrementarSalario() {
        salario = salarioBase + (((5 * salarioBase) / 100) * antiguedade);
    }

    @Override
    public String imprimir() {
        return nome+apelidos+DNI+direccion+antiguedade+telefono+salario+salarioBase+despacho+numFax;
    }


    
    
        
        
        
    
}
