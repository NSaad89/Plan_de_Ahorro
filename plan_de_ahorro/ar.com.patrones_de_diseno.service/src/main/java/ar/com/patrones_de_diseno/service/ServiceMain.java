package ar.com.patrones_de_diseno.service;

import java.util.Scanner;

import ar.com.patrones_de_diseno.dao.UsuarioDao;
import ar.com.patrones_de_diseno.daoimpl.UsuarioDaoImpl;
import ar.com.patrones_de_diseno.domain.Usuario;

public class ServiceMain {

	public static void main(String[] args) throws Exception {
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a plan de ahorro!!");
        
        System.out.println("Ingrese nombre de usuario:");
        
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese apellido de usuario:");
        
        String apellido = teclado.nextLine();
        
        System.out.println("Ingrese modelo de auto:");
        
        String auto = teclado.nextLine();
        
        teclado.close();
        
        Usuario u = new Usuario(nombre, apellido, auto);
        
        UsuarioDao usuario = new UsuarioDaoImpl();
             
        Usuario usuarioCreado = usuario.crearUsuario(u);
        
        System.out.println(usuarioCreado + "ha sido ingresado exitosamente en nuestra base de datos con el ID: " 
        		+ usuarioCreado.getId());
        
	}

}
