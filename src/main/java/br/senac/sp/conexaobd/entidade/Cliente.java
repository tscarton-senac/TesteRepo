/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.conexaobd.entidade;

import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author scarton
 */
@Getter
@Setter
public class Cliente {
    
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome = %s <br> Email = %s <br> CPF = %s", this.getNome(), this.getEmail(), this.getCpf());
    }
    
    
    
}
