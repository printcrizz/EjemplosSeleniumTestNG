package pageObjects;

public class Sodimac_po {

    public Sodimac_po(){

    }

    public String MantenerUbicacion(){
        return "//*[@id=\"zprice-hide\"]/ul/li/div[1]/div/a[1]";
    }
    public String BuscarInput(){
        return "//*[@id=\"searchBoxInput\"]";
    }
    public String Lupa(){
        return "//*[@id=\"fbra_searchBoxContainer\"]/div/div[1]/div";
    }
    public String AlicateObjeto1(){
        return "//*[@id=\"main\"]/section/div[2]/section/section/section[2]/section[1]/div[1]/a/img";
    }
    public String AlicateObjeto2(){
        return "//*[@id=\"main\"]/section/div[2]/section/section/section[2]/section[2]/div[1]/a/img";
    }
    public String NombreObjeto(){
        return "//*[@id=\"productTitleDisplayContainer\"]/h1/span";
    }
}
