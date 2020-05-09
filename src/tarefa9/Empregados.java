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
public  class Empregados {
protected String nome;
protected String apelidos;
protected String DNI;
protected String direccion;
protected String telefono;
protected float salario;
protected float salarioBase;
protected Empregados supervisor;
protected  int antiguedade;
        
   public Empregados(String nome, String apelidos, String DNI, String direccion, int antiguedade, String telefono, float salario) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedade = antiguedade;
        this.telefono = telefono;        
        this.salarioBase = salario;
    }
    
    public String imprimir(){  
        
    return nome+apelidos+DNI+direccion+antiguedade+telefono+salario+salarioBase;
        
    }
    
    public void cambiarSupervisor(Empregados nuevoSupervisor){
        supervisor=nuevoSupervisor;
    }
    
    public void incrementarSalario(){
    
        
        
    };
  


}
