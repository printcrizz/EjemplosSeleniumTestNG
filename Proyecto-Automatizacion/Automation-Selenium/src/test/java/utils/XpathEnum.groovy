package utils

class XpathEnum {

    public static String XPATH_UNEXPECTED_MESSAGE =".//*[@id='__layout']/div/main/div[1]/div/div[3]/h5"
    public static String XPATH_UNEXPECTED_HEADER = ".//*[@id='__layout']/div/main/div[1]/div/div[3]/h4"
    //TODO: Main PAGE
    public static String XPATH_VALUE_BUTTON_CONTINUAR = ".//*[@id='__layout']/div/main/div[3]/div[3]/div/button[2]"
    public static String XPATH_VALUE_BUTTON_CANCELAR = ".//*[@id='__layout']/div/main/div[3]/div[3]/div/button[1]"
    public static String XPATH_VALUE_PRICE_BUTTON = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/button[1]"
    // amount detail PRICE button validation
    public static String XPATH_DETAIL_PRODUCTO_TEXT = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[1]/li[1]/strong"
    public static String XPATH_DETAIL_MONTO_TEXT = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[1]/li[2]/strong"
    public static String XPATH_VALUE_DETAIL_PRODUCTO = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[2]/li/strong[1]"
    public static String XPATH_VALUE_DETAIL_AMOUNT = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[2]/li/strong[2]"
    public static String XPATH_VALUE_OPEN_DETAIL_TOTAL_LABEL = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[3]/li[1]/span"
    public static String XPATH_VALUE_OPEN_DETAIL_TOTAL_AMMOUNT = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[3]/li[2]/strong"
    public static String XPATH_VALUE_PAGAR_BUTTON = ".//*[@id='__layout']/div/main/div[3]/div[3]/div/button[2]"

    //TODO: after click in details
    public static String XPATH_VALUE_CARD_BUTTON = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/button[2]"
    public static String XPATH_VALUE_CARD_LIST = ".//*[@id='__layout']/div/main/div[2]/ul/li"
    public static String XPATH_IMG_CARD_IMAGE = "/img"
    public static String XPATH_CARD_TOKENIZATION_NUMBER = "/strong/small"
    public static String XPATH_CARD_CARD_TYPE = "/strong"

    //after continuar button click
    public static String XPATH_VALUE_AMMOUNT_BUTTON = ".//*[@id='__layout']/div/main/div[3]/div[3]/div/button[2]"
    public static String XPATH_VALUE_CHECKLABEL_PASSWORD = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[4]/input"
    public static String XPATH_VALUE_UPPER_DETAIL = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/div/ul[1]"

    //TODO: After first continue
    public static String XPATH_STRING_CONFIRMATION_MESSAGE = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[4]/span"

    //TODO: CSS values
    public static String CSS_CARD_AND_AMOUNT_VALUE = ".details__toggle"
    public static String CSS_DETAIL_PRODUCTO_TEXT = ".text--sm"
    public static String CSS_DETAIL_PRODUCT_VALUE = ".list__item.mt-2>strong"

    //TODO: TEXT IN SCREEN
    public static String TEXT_AMMOUNT_BUTTON_DETAIL = "Producto"
    public static String TEXT_AMMOUNT_BUTTON_MONTO = "Monto"
    public static String TEXT_AMMOUNT_BUTTON_TOTAL = "Total"
    public static String TEXT_AMMOUNT_BUTTON_HEADER= "Compra en Copec"
    public static String TEXT_ERROR_MESSAGE = "Tu Clave Internet es incorrecta, inténtalo nuevamente."
    public static String TEXT_UNEXPECTED_HEADER = "Error inesperado"
    public static String TEXT_UNEXPECTED_MESAGE = "Ocurrió un error inesperado, por favor inténtalo nuevamente."

//DEBIT
    public static String XPATH_DEBIT_VALUE_CARD_BUTTON = ".//*[@id='__layout']/div/main/div[3]/div[2]/div/div[3]/button[2]"

    //RGBA Colors
    public static String CSS_COLOR_GREEN = "rgba(0, 145, 61, 1)"
    public static String CSS_COLOR_GRAY = "rgba(242, 245, 247, 1)"
    public static String CSS_COLOR_DARK_GRAY = "rgba(137, 145, 152, 1)"
    public static String CSS_CREDIT_COLOR_GREEN = "rgba(59, 161, 39, 1)"

    //CARD NAMES
    public static String CARD_CMR_FALABELLA = "cmr-falabella.0903d96.svg"
    public static String CARD_DEBIT_CONTACTLESS = "debit.aa683e3.png"
    public static String CARD_CMR_MASTERCARD = "548740.685f571.png"
    public static String CARD_CMR_BLACK_CONTACTLESS = "465375.060d0c1.png"
    public static String CARD_CMR_PLATINUM_CONTACTLESS = "445596.102e6bb.png"
    public static String CARD_CMR_CONTACTLESS = "409152.e0f0fa1.png"
    public static String CARD_CMR_YELLOW_PRO = "404028.ce64806.png"

    public XpathEnum(){
    }

    public String getXpath(String name){
        switch(name){
            case "Continuar":
                return XPATH_VALUE_BUTTON_CONTINUAR;
                break
            case "Cancelar":
                return XPATH_VALUE_BUTTON_CANCELAR;
                break
            case "Pagar":
                return XPATH_VALUE_BUTTON_CONTINUAR
            default:
                break
        }
    }
}
