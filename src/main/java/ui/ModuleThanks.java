package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModuleThanks {

    public static Target button (String button){
        return Target.the("button " + button).locatedBy("//a[contains(text(),'" + button +"')]");
    }

    // Localizar el contenedor de productos de la categoría "Agradecimientos"
    public static final Target PRODUCT_LIST = Target.the("lista de productos de la categoría Agradecimientos")
            .locatedBy("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/div[1]/div[1]/div[2]");

    public static final Target PRIMER_PRODUCTO_AGREGAR = Target.the("Boton agregar primer producto").locatedBy("(//span[@class='title-cart'][normalize-space()='Añadir al carrito'])[1]");

    public static final Target SEGUNDO_PRODUCTO_AGREGAR = Target.the("Boton agregar segundo producto").locatedBy("(//span[@class='title-cart'][normalize-space()='Añadir al carrito'])[2]");

    public static final Target BOTON_LISTA = Target.the("Boton Lista").locatedBy("(//button[@title='List'])[1]");

    public static final Target BOTON_SEGUIRCOMPRANDO = Target.the("Boton Seguir Comprando").locatedBy("(//a[normalize-space()='Seguir comprando'])[1]");

    public static final Target PRODUCTO_1_EN_CARRITO = Target.the("Primer producto en el carrito")
            .locatedBy("(//a[contains(text(),'MDF 00015')])[3]");

    public static final Target PRODUCTO_2_EN_CARRITO = Target.the("Segundo producto en el carrito")
            .locatedBy("(//a[contains(text(),'MDF 00020')])[3]");

    // Botón para abrir el carrito
    public static final Target BOTON_CARRO = Target.the("Botón para abrir el carrito")
            .located(By.xpath("//span[@class='sub-title' and contains(text(), 'CARRO')]"));

    public static final Target PRODUCTO_1_EN_CARRO = Target.the("Primer producto en el carrO")
            .locatedBy("(//a[@class='product-name'][normalize-space()='MDF 00015'])[2]");

    public static final Target PRODUCTO_2_EN_CARRO = Target.the("Primer producto en el carrO")
            .locatedBy("(//a[@class='product-name'][normalize-space()='MDF 00020'])[2]");

    public static final Target MENSAJE_PRODUCTO_AGREGADO = Target.the("mensaje de producto agregado al carrito")
            .located(By.xpath("//*[contains(text(), 'MDF 00020') and contains(text(), 'se ha añadido a tu carrito')]"));





}
