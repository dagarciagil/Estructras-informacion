/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
   public String getTitulo(){return titulo;}
   public void setTitulo(String titulo){this.titulo=titulo;}
   
   public String getAutor(){return autor;}
   public void setAutor(String autor){this.autor=autor;}
   
   public String getIsbn(){return isbn;}
   public void setIsbn(String isbn){this.isbn=isbn;}
}
