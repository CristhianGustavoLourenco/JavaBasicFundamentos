/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasicofundamentos;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ListaExercicio02 {
    
    public static void main(String[] args) {
        // 3 Use o conhecimento em Hash e crie um algoritimo de media com 3 alunos
        // - Passou(>7)
        // - Recuperação (>=4)
        // - Reprovou (<4)
        // - Quantidade de alunos que: Passou, recuperação e Reprovou

        String txt;
        HashMap<String,String> cadastroPessoa = new HashMap<String,String>();
        Float media;
        
        
        cadastroPessoa.put("nome", "Walter");
        
        txt ="Seu nome é: " + cadastroPessoa.get("nome");
        
        cadastroPessoa.put("serie", "Quinta Serie");
        
        txt += " Sua serie é: "+cadastroPessoa.get("serie");
        
         cadastroPessoa.put("nota1", "8");
         cadastroPessoa.put("nota2", "8");
         cadastroPessoa.put("nota3", "9");
          
        
         media = ( Float.parseFloat(cadastroPessoa.get("nota1"))
                    + Float.parseFloat(cadastroPessoa.get("nota2"))
                        + Float.parseFloat(cadastroPessoa.get("nota3")))/3;
         
         
         
         txt += "Media igual á: "+media;
         
         
        JOptionPane.showMessageDialog(null,txt);
    }
}
