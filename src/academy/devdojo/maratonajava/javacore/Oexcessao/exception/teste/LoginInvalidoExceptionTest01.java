package academy.devdojo.maratonajava.javacore.Oexcessao.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcessao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
    try{
        logar();
    }catch (LoginInvalidoException e){
        e.printStackTrace();
    }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner entrada = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDb = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = entrada.nextLine();
        System.out.println("Senha");
        String senhaDigitada = entrada.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada)){
        throw new LoginInvalidoException("Usuario ou Senha Invalida");
        }
        System.out.println("Login bem sucedido");
    }
}
