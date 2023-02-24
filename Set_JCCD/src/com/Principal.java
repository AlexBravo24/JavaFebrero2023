package com;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juan","00001",20000);
		Cliente c2 = new Cliente("Alfredo","00002",40000);
		Cliente c3 = new Cliente("Marcel","00003",15000);
		Cliente c4 = new Cliente("Gabriela","00004",8000);
		Cliente c5 = new Cliente("Juan","00001",20000);
		
		Set<Cliente> clientesbanco = new HashSet<Cliente>();
		
		clientesbanco.add(c1);
		clientesbanco.add(c2);
		clientesbanco.add(c3);
		clientesbanco.add(c4);
		clientesbanco.add(c5);
		
		for (Cliente cliente : clientesbanco) {
			
			System.out.println("Nombre: " + cliente.getNombre() + "\nCuenta: " + cliente.getCuenta() 
			+ "\nSaldo: $" + cliente.getSaldo());
			
		}
	}

}
