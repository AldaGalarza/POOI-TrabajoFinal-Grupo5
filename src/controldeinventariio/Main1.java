/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeinventariio;

import java.util.ArrayList;

/**
 *
 * @author witchy
 */
public class Main1 {

    public static String mUsuario;
    public static String mPass;

    public static boolean mEsGere;
    public static boolean mEsAdmin;
    public static boolean mEsTraba;

    public static ArrayList<Usuario> mListaDeUsuarios = new ArrayList();
    public static ArrayList<Producto> mListaDeProductos = new ArrayList();

    public static void main(String[] args) {

        ArrayList<String> mListaDeRoles = new ArrayList();

        mListaDeRoles.add("Administrador");
        mListaDeRoles.add("Vendedor");

        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Jose");
        usuario1.setPass("Jose");
        usuario1.setCorreoElectronico("josseanttonio2001@gmail.com");
        usuario1.setListaRoles(mListaDeRoles);
        
        mListaDeRoles = new ArrayList();
        mListaDeRoles.add("Gerente");

        Usuario usuario = new Usuario();
        usuario.setNombre("Gere");
        usuario.setPass("Gere");
        usuario.setListaRoles(mListaDeRoles);
        

        mListaDeRoles = new ArrayList();
        mListaDeRoles.add("Administrador");

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Admin");
        usuario2.setPass("Admin");
        usuario2.setListaRoles(mListaDeRoles);
       

        mListaDeRoles = new ArrayList();
        mListaDeRoles.add("Trabajador");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("trabajador");
        usuario3.setPass("trabajador");
        usuario3.setListaRoles(mListaDeRoles);
        

        //Vamos a agregar el usuario por defecto a la lista de usuarios (este siempre va a existir que se ejecute el programa)
        mListaDeUsuarios.add(usuario1); //Tiene el rol de administrador y vendedor
        mListaDeUsuarios.add(usuario2); //Tiene el rol de administrador
        mListaDeUsuarios.add(usuario3); //Tiene el rol de vendedor

        frmLogin login = new frmLogin();
        login.setVisible(true);

    }

}
