import java.util.*;
import java.io.*;

public class Item {
    private String producto;
    private float costo;


    public Item(String producto, float costo ) {
        this.costo = costo;
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
