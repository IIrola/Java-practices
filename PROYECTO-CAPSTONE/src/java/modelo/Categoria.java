/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sistema
 */
public class Categoria {
    private int cod_categoria;
    private String cate_descripcion;

    public Categoria(){
        this.cod_categoria = 0;
        this.cate_descripcion = "NN";
    }

    public Categoria(int cod_categoria, String cate_descripcion) {
        this.cod_categoria = cod_categoria;
        this.cate_descripcion = cate_descripcion;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public String getCate_descripcion() {
        return cate_descripcion;
    }

    public void setCate_descripcion(String cate_descripcion) {
        this.cate_descripcion = cate_descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "cod_categoria=" + cod_categoria + ", cate_descripcion=" + cate_descripcion + '}';
    }        
            
}
